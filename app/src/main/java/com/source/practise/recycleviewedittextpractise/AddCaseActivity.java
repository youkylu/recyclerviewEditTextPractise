package com.source.practise.recycleviewedittextpractise;

import android.text.Editable;
import android.text.InputType;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.VirtualLayoutManager;
import com.alibaba.android.vlayout.layout.LinearLayoutHelper;

import java.util.LinkedList;
import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;

/**
 * <p>Class: com.source.practise.recycleviewedittextpractise.AddCaseActivity</p>
 * <p>Description: </p>
 * <pre>
 *
 *  </pre>
 *
 * @author lujunjie
 * @date 2019/4/19/14:01.
 */
public class AddCaseActivity extends SimpleBaseActivity {
    @BindView(R.id.activity_add_case_rv)
    RecyclerView activityAddCaseRv;
    @BindView(R.id.common_title_back_ll)
    RelativeLayout commonTitleBackLl;
    @BindView(R.id.common_title_tv)
    TextView commonTitleTv;
    @BindView(R.id.common_title_save_tv)
    TextView commonTitleSaveTv;
    @BindView(R.id.common_title_bar_rl)
    RelativeLayout commonTitleBarRl;


    private AddCaseViewModel addCaseViewModel;
    private VirtualLayoutManager layoutManager;
    private DelegateAdapter delegateAdapter;
    private List<DelegateAdapter.Adapter> mAdapters;
    private ScriptEngine engine;
    private SparseArray<String> mEditTextCache = new SparseArray<>();
    private boolean onBind;
    private int etFocusPos = -1;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_add_case;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {
        engine = new ScriptEngineManager().getEngineByName("rhino");
        addCaseViewModel = ViewModelProviders.of(this, new ViewModelProvider.AndroidViewModelFactory(getApplication())).get(AddCaseViewModel.class);

        engine.put("a", 1);
//            System.out.println("llaal1"+engine.eval("a+b").toString());
        engine.put("b", 2);
        try {
            System.out.println("engineeval" + engine.eval("a+b").toString());
        } catch (ScriptException e) {
            e.printStackTrace();
        }

        mAdapters = new LinkedList<>();
        //初始化
        //创建VirtualLayoutManager对象
        layoutManager = new VirtualLayoutManager(this);
        activityAddCaseRv.setLayoutManager(layoutManager);

        //设置回收复用池大小，（如果一屏内相同类型的 View 个数比较多，需要设置一个合适的大小，防止来回滚动时重新创建 View）
        RecyclerView.RecycledViewPool viewPool = new RecyclerView.RecycledViewPool();
        activityAddCaseRv.setRecycledViewPool(viewPool);
        viewPool.setMaxRecycledViews(0, 20);

        //设置适配器
        delegateAdapter = new DelegateAdapter(layoutManager, true);
        activityAddCaseRv.setAdapter(delegateAdapter);

        //自定义各种不同适配器
        initAllTypeView();
        //设置适配器
        delegateAdapter.setAdapters(mAdapters);


        addCaseViewModel.getCrfChildrenData();
        addObserve();
    }

    public void initAllTypeView() {
        mAdapters.clear();
        if (addCaseViewModel.getCrfChildrenLiveData().getValue() != null) {
            int size = addCaseViewModel.getCrfChildrenLiveData().getValue().size();
            for (int i = 0; i < size; i++) {
                if (addCaseViewModel.getPositionValue(i).getDirective() != null &&
                        addCaseViewModel.getPositionValue(i).getDirective().getCalculate() != null) {
                    addCalculateType(i);
                } else {
                    addValueType(i);
                }
            }
        }

    }

    public void addValueType(final int totalPosition) {
        BaseDelegateAdapter adAdapter = new BaseDelegateAdapter(this, new LinearLayoutHelper(),
                R.layout.recycler_item_add_case_value, 1, DataConstants.viewType.typeEmpty) {
            @Override
            public void onBindViewHolder(BaseViewHolder holder, int position) {

                TextView titleTv = holder.getView(R.id.rvi_add_case_value_name_tv);
                final EditText valueEt = holder.getView(R.id.rvi_add_case_value_name_et);

                titleTv.setText(addCaseViewModel.getPositionValue(totalPosition).getModuleDefineName());
                valueEt.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);

                //当前holder是我们记录下的焦点位置时，我们给当前的editext设置焦点并设置光标位置

//        通过tag判断当前editText是否已经设置监听，有监听的话，移除监听再给editText赋值
                if (valueEt.getTag() instanceof TextWatcher) {
                    valueEt.removeTextChangedListener((TextWatcher) valueEt.getTag());
                }

//        必须在判断tag后给editText赋值，否则会数据错乱
                onBind = true;
                if (!TextUtils.isEmpty(mEditTextCache.get(totalPosition))) {
                    valueEt.setText(mEditTextCache.get(totalPosition));
                    valueEt.setSelection(valueEt.getText().length());
                } else {
                    valueEt.setText("");
                }
                if (etFocusPos == totalPosition) {
                    valueEt.requestFocus();
                    valueEt.setSelection(valueEt.getText().length());
                }

                onBind = false;

                valueEt.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        if (event.getAction() == MotionEvent.ACTION_UP) {
                            etFocusPos = totalPosition;
                        }
                        return false;
                    }
                });
                TextWatcher textWatcher = new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {

                    }

                    @Override
                    public void afterTextChanged(Editable s) {
                        // 如果填入数据与缓存数据相同返回
                        if (TextUtils.equals(mEditTextCache.get(totalPosition), s.toString())) {
                            return;
                        }
                        mEditTextCache.put(totalPosition, s.toString());
                        if (TextUtils.isEmpty(valueEt.getText().toString())) {
                            engine.put(addCaseViewModel.getPositionValue(totalPosition).getModuleDefineCode(), null);
                        } else {
                            engine.put(addCaseViewModel.getPositionValue(totalPosition).getModuleDefineCode(), Integer.parseInt(s.toString()));
                        }
                        if (!onBind) {
                            delegateAdapter.notifyDataSetChanged();
                        }
                    }
                };
                valueEt.addTextChangedListener(textWatcher);

                valueEt.setTag(textWatcher);
            }
        };

        mAdapters.add(adAdapter);
    }

    public void addCalculateType(final int totalPosition) {
        BaseDelegateAdapter adAdapter = new BaseDelegateAdapter(this, new LinearLayoutHelper(),
                R.layout.recycler_item_add_case_calculate, 1, DataConstants.viewType.typeDivider) {
            @Override
            public void onBindViewHolder(BaseViewHolder holder, int position) {

                TextView titleTv = holder.getView(R.id.rvi_add_case_value_calculate_name_tv);
                TextView valueEt = holder.getView(R.id.rvi_add_case_value_calculate_tv);

                titleTv.setText(addCaseViewModel.getPositionValue(totalPosition).getModuleDefineName());
                valueEt.setText("");
                boolean isEmpty =false;
                List<ReferenceBean> referenceBeanList = addCaseViewModel.getPositionValue(totalPosition).getDirective().getReference();
                for (ReferenceBean referenceBean : referenceBeanList) {
                    Object valueString =  engine.get(referenceBean.getValue());
                    if (valueString==null) {
                        isEmpty = true;
                        break;
                    }
                }
                if(isEmpty){
                    valueEt.setText( "");
                }else{
                    try {
                        String value = engine.eval(addCaseViewModel.getPositionValue(totalPosition).getDirective().getCalculate()).toString();
                        Log.d("evalLog", value + "");
                        valueEt.setText(value + "");
                    } catch (ScriptException e) {
                        e.printStackTrace();
                    }
                }


            }
        };

        mAdapters.add(adAdapter);
    }

    private void addObserve() {
        addCaseViewModel.getCrfChildrenLiveData().observe(this, new Observer<List<CrfChildBean>>() {
            @Override
            public void onChanged(List<CrfChildBean> crfChildBeans) {
                if (crfChildBeans.size() > 0) {
                    initAllTypeView();
                    //设置适配器
                    delegateAdapter.setAdapters(mAdapters);
                }
            }
        });
    }
}

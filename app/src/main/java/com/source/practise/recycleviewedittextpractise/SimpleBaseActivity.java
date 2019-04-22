package com.source.practise.recycleviewedittextpractise;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.reactivex.disposables.CompositeDisposable;

/**
 * <p>Class: com.source.practise.recycleviewedittextpractise.SimpleBaseActivity</p>
 * <p>Description: </p>
 * <pre>
 *
 *  </pre>
 *
 * @author lujunjie
 * @date 2019/4/19/14:02.
 */
public abstract class SimpleBaseActivity extends AppCompatActivity {
    //将所有正在处理的Subscription都添加到CompositeSubscription中。统一退出的时候注销观察
    private CompositeDisposable mCompositeDisposable = new CompositeDisposable();

    private Unbinder mUnbinder;

    protected int statusColor = Color.rgb(35, 119, 217);

    private Bundle savedInstanceState;

    private int fontSize;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.O && isTranslucentOrFloating()) {
//            boolean result = fixOrientation();
//        }

        super.onCreate(savedInstanceState);
        this.savedInstanceState = savedInstanceState;
        setContentView(getLayoutId());
        setStatusBar(statusColor);
        setFitsystem(true);
        mUnbinder = ButterKnife.bind(this);

        if (regEvent()) {
            EventBus.getDefault().register(this);
        }
        initViews();
        initListener();
        initData();
    }

    /**
     * 布局的资源id
     *
     * @return
     */
    @LayoutRes
    protected abstract int getLayoutId();

    /**
     * 初始化控件
     */
    protected abstract void initViews();

    /**
     * 初始化监听
     */
    protected abstract void initListener();


    protected abstract void initData();

    @Override
    protected void onDestroy() {
        mUnbinder.unbind();
        if (regEvent()) {
            EventBus.getDefault().unregister(this);
        }
        super.onDestroy();
        if (mCompositeDisposable != null) {
            mCompositeDisposable.dispose();
        }
    }

    protected void startActivity(Class<? extends Activity> clazz) {
        startActivity(new Intent(this, clazz));
    }


    protected void toast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }


    protected void setStatusBar(int color) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

            ViewGroup decorViewGroup = (ViewGroup) getWindow().getDecorView();
            View statusBarView = new View(getWindow().getContext());
            int statusBarHeight = getStatusBarHeight(getWindow().getContext());
            FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, statusBarHeight);
            params.gravity = Gravity.TOP;
            statusBarView.setLayoutParams(params);
            statusBarView.setBackgroundColor(color);
            decorViewGroup.addView(statusBarView);
        } else {
            Window window = getWindow();
            //取消设置透明状态栏,使 ContentView 内容不再覆盖状态栏
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            //需要设置这个 flag 才能调用 setStatusBarColor 来设置状态栏颜色
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            //设置状态栏颜色
            window.setStatusBarColor(color);
        }
    }

    private static int getStatusBarHeight(Context context) {
        int statusBarHeight = 0;
        Resources res = context.getResources();
        int resourceId = res.getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            statusBarHeight = res.getDimensionPixelSize(resourceId);
        }
        return statusBarHeight;
    }


    public void setFitsystem(boolean fitSystemWindows) {
        ViewGroup mContentView = (ViewGroup) getWindow().findViewById(Window.ID_ANDROID_CONTENT);
        View mChildView = mContentView.getChildAt(0);
        if (mChildView != null) {
            //注意不是设置 ContentView 的 FitsSystemWindows, 而是设置 ContentView 的第一个子 View . 预留出系统 View 的空间.
            mChildView.setFitsSystemWindows(fitSystemWindows);
        }
    }


    public Bundle getSavedInstanceState(){
        return savedInstanceState;
    }

//    @Override
//    public void recreate() {
//        super.recreate();
//
//        setContentView(getLayoutId());
//        setStatusBar(statusColor);
//        setFitsystem(true);
//        mUnbinder = ButterKnife.bind(this);
//        initViews();
//        initListener();
//        initData();
//    }

    @Override
    public Resources getResources() {
        Resources res = super.getResources();
        Configuration config = res.getConfiguration();
        fontSize = SharedPreferenceService.getInstance(this).get("fontSize", 2);
        switch (fontSize){
            case 1:
                config.fontScale = 0.85f; //1 设置正常字体大小的倍数
                break;
            case 2:
                config.fontScale = 1f; //1 设置正常字体大小的倍数
                break;
            case 3:
                config.fontScale = 1.2f; //1 设置正常字体大小的倍数
                break;
            case 4:
                config.fontScale = 1.4f; //1 设置正常字体大小的倍数
                break;
        }
        res.updateConfiguration(config, res.getDisplayMetrics());
        return res;
    }

    /**
     * 需要接收事件 重写该方法 并返回true
     */
    protected boolean regEvent() {
        return false;
    }

    /**
     * 子类接受事件 重写该方法
     */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventBus(Event event) {
    }

//    private boolean fixOrientation(){
//        try {
//            Field field = Activity.class.getDeclaredField("mActivityInfo");
//            field.setAccessible(true);
//            ActivityInfo o = (ActivityInfo)field.get(this);
//            o.screenOrientation = -1;
//            field.setAccessible(false);
//            return true;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//
//    private boolean isTranslucentOrFloating(){
//        boolean isTranslucentOrFloating = false;
//        try {
//            int [] styleableRes = (int[]) Class.forName("com.android.internal.R$styleable").getField("Window").get(null);
//            final TypedArray ta = obtainStyledAttributes(styleableRes);
//            Method m = ActivityInfo.class.getMethod("isTranslucentOrFloating", TypedArray.class);
//            m.setAccessible(true);
//            isTranslucentOrFloating = (boolean)m.invoke(null, ta);
//            m.setAccessible(false);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return isTranslucentOrFloating;
//    }
//
//    @Override
//    public void setRequestedOrientation(int requestedOrientation) {
//        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.O && isTranslucentOrFloating()) {
//
//            return;
//        }
//
//        super.setRequestedOrientation(requestedOrientation);
//    }
}

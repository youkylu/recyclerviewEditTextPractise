package com.source.practise.recycleviewedittextpractise;

import java.util.ArrayList;
import java.util.List;

import androidx.lifecycle.MutableLiveData;

/**
 * <p>Class: com.source.practise.recycleviewedittextpractise.AddCaseRepository</p>
 * <p>Description: </p>
 * <pre>
 *
 *  </pre>
 *
 * @author lujunjie
 * @date 2019/4/19/14:38.
 */
public class AddCaseRepository extends AbsRepository {

//    private RetrofitService retrofitService;

    public AddCaseRepository() {
//        retrofitService = RetrofitServiceManager.getInstance().create(RetrofitService.class);
    }

    public void loadCrfChildrenData(MutableLiveData<List<CrfChildBean>> crfChildrenData) {
        crfChildrenData.postValue(generateData());
    }


    private List<CrfChildBean> generateData() {
        CrfChildBean crfChildBean = new CrfChildBean();
        crfChildBean.setModuleDefineCode("INDICATOR_232_444T");
        crfChildBean.setName("身高");
        crfChildBean.setModuleDefineName("身高");
        crfChildBean.setCriteriaDataType("NUMBER");

        CrfChildBean crfChildBean1 = new CrfChildBean();
        crfChildBean1.setModuleDefineCode("INDICATOR_232_445T");
        crfChildBean1.setName("体重");
        crfChildBean1.setModuleDefineName("体重");
        crfChildBean1.setCriteriaDataType("NUMBER");

        CrfChildBean crfChildBean2 = new CrfChildBean();
        crfChildBean2.setModuleDefineCode("INDICATOR_232_446T");
        crfChildBean2.setName("BMI");
        crfChildBean2.setModuleDefineName("BMI");
        crfChildBean2.setCriteriaDataType("NUMBER");

        DirectiveBean directiveBean = new DirectiveBean();
        directiveBean.setCalculate("INDICATOR_232_444T + INDICATOR_232_445T");

        ReferenceBean referenceBean = new ReferenceBean();
        referenceBean.setValue("INDICATOR_232_445T");
        referenceBean.setName("体重");
        referenceBean.setDataType("NUMBER");

        ReferenceBean referenceBean1 = new ReferenceBean();
        referenceBean1.setValue("INDICATOR_232_444T");
        referenceBean1.setName("身高");
        referenceBean1.setDataType("NUMBER");
        List<ReferenceBean> referenceBeanList = new ArrayList<>();
        referenceBeanList.add(referenceBean);
        referenceBeanList.add(referenceBean1);

        directiveBean.setReference(referenceBeanList);
        crfChildBean2.setDirective(directiveBean);

        List<CrfChildBean> crfChildBeanList = new ArrayList<>();
        crfChildBeanList.add(crfChildBean);
        crfChildBeanList.add(crfChildBean1);
        crfChildBeanList.add(crfChildBean2);

        return crfChildBeanList;
    }
}

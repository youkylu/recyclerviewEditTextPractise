package com.source.practise.recycleviewedittextpractise;

import android.app.Application;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

/**
 * <p>Class: com.source.practise.recycleviewedittextpractise.AddCaseViewModel</p>
 * <p>Description: </p>
 * <pre>
 *
 *  </pre>
 *
 * @author lujunjie
 * @date 2019/4/19/14:32.
 */
public class AddCaseViewModel extends AbsViewModel<AddCaseRepository> {

    private MutableLiveData<List<CrfChildBean>> crfChildrenData;


    public AddCaseViewModel(@NonNull Application application) {
        super(application);
    }

    public MutableLiveData<List<CrfChildBean>> getCrfChildrenLiveData() {
        if (crfChildrenData == null) {
            crfChildrenData = new MutableLiveData<>();
        }
        return crfChildrenData;
    }

    public CrfChildBean getPositionValue(int i) {
        return getCrfChildrenLiveData().getValue().get(i);
    }

    public void getCrfChildrenData() {
        mRepository.loadCrfChildrenData(crfChildrenData);
    }

}
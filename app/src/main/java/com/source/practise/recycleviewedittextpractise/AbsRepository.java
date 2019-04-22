package com.source.practise.recycleviewedittextpractise;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * <p>Class: com.source.practise.recycleviewedittextpractise.AbsRepository</p>
 * <p>Description: </p>
 * <pre>
 *
 *  </pre>
 *
 * @author lujunjie
 * @date 2019/4/19/14:37.
 */
public abstract class AbsRepository {

    private CompositeDisposable mCompositeDisposable;

    protected void  addDisposable(Disposable disposable){
        if(mCompositeDisposable==null){
            mCompositeDisposable = new CompositeDisposable();
        }
        mCompositeDisposable.add(disposable);
    }

    public void  unDisposable(){
        if(mCompositeDisposable!=null&&mCompositeDisposable.isDisposed()){
            mCompositeDisposable.clear();
        }
    }
}


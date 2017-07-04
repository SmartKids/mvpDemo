package demo.mvp.base;

import java.lang.ref.WeakReference;

/******************************************
 * 类描述： Presenter基类 类名称：MVPBasePresenter
 *
 * @version: 1.0
 * @author: Lee
 * @time: 2017-7-4 11:12
 ******************************************/

public class MVPBasePresenter<V> {
    protected WeakReference<V> mViewRef;

    public void attachView(V view) {
        mViewRef = new WeakReference<>(view);
    }

    public void detachView() {
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
    }

    public boolean isViewAttached() {
        return mViewRef != null && mViewRef.get() != null;
    }

    protected V getViewInterface() {
        if (isViewAttached()) {
            return mViewRef.get();
        } else {
            return null;
        }
    }

    public void cancelPresenterRequest() {
    }
}

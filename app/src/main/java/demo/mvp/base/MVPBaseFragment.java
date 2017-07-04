package demo.mvp.base;

import android.os.Bundle;

/******************************************
 * 类描述： MVP Fragment基类 类名称：MVPBaseFragment
 *
 * @version: 1.0
 * @author: Lee
 * @time: 2017-7-4 11:21
 ******************************************/

public abstract class MVPBaseFragment<V extends MVPBaseInter, P extends MVPBasePresenter<V>>
        extends BaseFragment {
    protected P mPresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();
        if (mPresenter != null) {
            mPresenter.attachView((V) this);
        }
    }

    @Override
    public void onDestroy() {
        if (mPresenter != null) {
            mPresenter.detachView();
        }
        super.onDestroy();
    }

    protected abstract P createPresenter();
}
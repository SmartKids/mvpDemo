package demo.mvp.base;

import android.os.Bundle;

/******************************************
 * 类描述： MVP Activity基类 类名称：MVPBaseActivity
 *
 * @version: 1.0
 * @author: Lee
 * @time: 2017-7-4 11:21
 ******************************************/
public abstract class MVPBaseActivity<V extends MVPBaseInter, P extends MVPBasePresenter<V>> extends BaseActivity {
    protected P mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();
        if (mPresenter != null) {
            mPresenter.attachView((V) this);
        }
    }

    @Override
    protected void onDestroy() {
        if (mPresenter != null) {
            mPresenter.detachView();
        }
        super.onDestroy();
    }

    protected abstract P createPresenter();
}

package demo.mvp.base;

/******************************************
 * 类描述： MVP POJO 基类 类名称：MVPBasePOJO
 *
 * @version: 1.0
 * @author: Lee
 * @time: 2017-7-4 11:22
 ******************************************/
public abstract class MVPBasePOJO<V extends MVPBaseInter, P extends MVPBasePresenter<V>> {
    protected P mPresenter;

    public MVPBasePOJO() {
        mPresenter = createPresenter();
        if (mPresenter != null) {
            mPresenter.attachView((V) this);
        }
    }

    protected void onDestroy() {
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }

    /**
     * 显示缓冲UI
     */
    protected void showLoading() {
    }

    /**
     * 隐藏缓冲UI
     */
    protected void hiddenLoading() {
    }

    protected abstract P createPresenter();
}

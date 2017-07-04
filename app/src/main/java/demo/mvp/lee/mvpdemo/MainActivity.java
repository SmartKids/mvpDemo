package demo.mvp.lee.mvpdemo;

import android.os.Bundle;

import demo.mvp.base.MVPBaseActivity;
import demo.mvp.inter.LoginInter;
import demo.mvp.presenter.LoginPresenter;
import demo.mvp.presenter.bean.LoginBean;
import demo.mvp.response.BaseResponse;

public class MainActivity extends MVPBaseActivity<LoginInter, LoginPresenter> implements LoginInter {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginToServer();
    }


    private void loginToServer() {
        LoginBean loginBean = new LoginBean();
        loginBean.setUserName("Lee");
        loginBean.setPassword("1234567890");
        showLoading();
        mPresenter.login(loginBean);
    }

    @Override
    protected LoginPresenter createPresenter() {
        return new LoginPresenter();
    }

    @Override
    public void onError(int error, String msg) {
        hiddenLoading();
    }

    @Override
    public void onLoginSuccess(BaseResponse baseResponse) {
        hiddenLoading();
    }
}

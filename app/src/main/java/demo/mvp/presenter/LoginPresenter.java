package demo.mvp.presenter;

import com.google.gson.Gson;

import demo.mvp.base.MVPBasePresenter;
import demo.mvp.inter.LoginInter;
import demo.mvp.presenter.bean.LoginBean;
import demo.mvp.request.retrofit.inter.LoginRetrofitInter;
import demo.mvp.response.BaseResponse;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static demo.mvp.utils.Constants.JSON_MIME_TYPE;

/******************************************
 * 类描述： 登录业务逻辑处理类 类名称：LoginPresenter
 *
 * @version: 1.0
 * @author: Lee
 * @time: 2017-7-4 12:13
 ******************************************/
public class LoginPresenter extends MVPBasePresenter<LoginInter> {


    /**
     * 登录
     * 备注（此处可以调整为不同的实现或再做进一步封装）
     *
     * @param loginBean
     */
    public void login(LoginBean loginBean) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://127.0.0.1").addConverterFactory(GsonConverterFactory.create()).build();
        LoginRetrofitInter loginRetrofitInter = retrofit.create(LoginRetrofitInter.class);
        Gson gson = new Gson();
        String body = gson.toJson(loginBean);
        RequestBody requestBody = RequestBody.create(okhttp3.MediaType.parse(JSON_MIME_TYPE), body);
        Call<BaseResponse> call = loginRetrofitInter.loginToServer(requestBody);
        call.enqueue(new Callback<BaseResponse>() {
            @Override
            public void onResponse(Call<BaseResponse> call, Response<BaseResponse> response) {
                if (response != null) {
                    onLoginSuccess(response.body());
                } else {
                    onError(-1, null);
                }
            }

            @Override
            public void onFailure(Call<BaseResponse> call, Throwable t) {
                onError(-1, null);
            }
        });
    }

    private void onLoginSuccess(BaseResponse baseResponse) {
    }

    private void onError(int error, String msg) {
    }
}

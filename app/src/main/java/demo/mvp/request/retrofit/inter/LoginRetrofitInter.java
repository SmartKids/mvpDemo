package demo.mvp.request.retrofit.inter;

import demo.mvp.response.BaseResponse;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/******************************************
 * 类描述： 登录业务网络请求接口 类名称：LoginRetrofitInter
 *
 * @version: 1.0
 * @author: Lee
 * @time: 2017-7-4 12:35
 ******************************************/

public interface LoginRetrofitInter {
    @POST("/login/api")
    Call<BaseResponse> loginToServer(@Body RequestBody requestBody);
}

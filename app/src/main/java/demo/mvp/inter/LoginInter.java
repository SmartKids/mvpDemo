package demo.mvp.inter;

import demo.mvp.base.MVPBaseInter;
import demo.mvp.response.BaseResponse;

/******************************************
 * 类描述： 登录接口 类名称：LoginInter
 *
 * @version: 1.0
 * @author: Lee
 * @time: 2017-7-4 12:02
 ******************************************/
public interface LoginInter extends MVPBaseInter {
    void onLoginSuccess(BaseResponse baseResponse);
}

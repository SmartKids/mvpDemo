package demo.mvp.response;

/******************************************
 * 类描述： HTTP数据请求响应基类 类名称：BaseResponse
 *
 * @version: 1.0
 * @author: Lee
 * @time: 2017-7-4 12:06
 ******************************************/

public abstract class BaseResponse {
    protected int code;
    protected String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

package demo.mvp.response;

/******************************************
 * 类描述： HTTP数据请求标准响应基类 类名称：CommonResponse
 *
 * @version: 1.0
 * @author: Lee
 * @time: 2017-7-4 12:08
 ******************************************/

public class CommonResponse<T> extends BaseResponse {
    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    private T result;

}

package demo.mvp.response;

import java.util.List;

/******************************************
 * 类描述： HTTP数据请求标准数组响应基类 类名称：CommonListResponse
 *
 * @version: 1.0
 * @author: Lee
 * @time: 2017-7-4 12:10
 ******************************************/

public class CommonListResponse<T> extends BaseResponse {
    private List<T> result;

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }
}

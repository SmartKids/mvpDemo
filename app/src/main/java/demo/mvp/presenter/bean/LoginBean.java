package demo.mvp.presenter.bean;

/******************************************
 * 类描述： 登录业务请求数据对象 类名称：LoginBean
 *
 * @version: 1.0
 * @author: Lee
 * @time: 2017-7-4 12:30
 ******************************************/

public class LoginBean {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

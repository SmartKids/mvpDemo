package demo.mvp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


/******************************************
 * 类描述： Activity基类 类名称：BaseActivity
 *
 * @version: 1.0
 * @author: Lee
 * @time: 2017-7-4 11:15
 ******************************************/

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * 初始化View
     */
    protected void initView() {
    }

    /**
     * 初始化数据
     */
    protected void initData() {
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
}

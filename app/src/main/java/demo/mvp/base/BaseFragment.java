package demo.mvp.base;

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/******************************************
 * 类描述： Fragment基础类 类名称：BaseFragment
 *
 * @version: 1.0
 * @author: Lee
 * @time: 2017-7-4 11:20
 ******************************************/

public class BaseFragment extends Fragment {
    /**
     * 初始化数据
     */
    protected void initData() {
    }

    /**
     * 初始化View
     */
    protected void initView(View view) {
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

    /**
     * Fragment动画开始执行回调
     *
     * @param enter
     * @param animation
     */
    protected void onFragmentAnimationStart(boolean enter, Animation animation) {
    }

    /**
     * Fragment动画执行完毕回调
     *
     * @param enter
     * @param animation
     */
    protected void onFragmentAnimationEnd(boolean enter, Animation animation) {
    }

    @Override
    public Animation onCreateAnimation(int transit, final boolean enter, int nextAnim) {
        Animation anim = null;
        try {
            anim = AnimationUtils.loadAnimation(getActivity(), nextAnim);
        } catch (Exception e) {
        }
        if (anim == null) {
            onFragmentAnimationEnd(enter, null);
            return null;
        }
        anim.setAnimationListener(new Animation.AnimationListener() {
            //动画开始
            public void onAnimationStart(Animation animation) {
                onFragmentAnimationStart(enter, animation);
            }

            //动画循环
            public void onAnimationRepeat(Animation animation) {
            }

            //动画结束
            public void onAnimationEnd(final Animation animation) {
                View v = getView();
                if (v != null) {
                    v.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            if (isAdded()) {
                                onFragmentAnimationEnd(enter, animation);
                            }
                        }
                    }, 100);
                }
            }
        });
        return anim;
    }
}

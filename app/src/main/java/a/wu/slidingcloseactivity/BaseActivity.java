package a.wu.slidingcloseactivity;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

/**
 * Created by guannan on 2017/7/26.
 */

public class BaseActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(enableSwipeBack()){
            SwipeBackLayout slidingLayout = new SwipeBackLayout(this);
            slidingLayout.replaceCurrentLayout(this);
        }

    }

    /**
     * 子类重写这个方法true:允许向右滑动，false:禁止向右滑动
     * @return
     */
    protected boolean enableSwipeBack(){
        return false;
    }
}

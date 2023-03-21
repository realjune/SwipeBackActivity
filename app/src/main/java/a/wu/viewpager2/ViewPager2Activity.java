package a.wu.viewpager2;


import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import a.wu.slidingcloseactivity.BaseActivity;
import a.wu.slidingcloseactivity.R;

/**
 * @author wangjx
 * @version 1.0.0
 * @date 2023/3/20
 */
public class ViewPager2Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpage2);

        ViewPager2 viewPager2 = findViewById(R.id.vp_h);
        ViewPager2Adapter adapter = new ViewPager2Adapter(this);
        viewPager2.setAdapter(adapter);
    }

    @Override
    protected boolean enableSwipeBack() {
        return true;
    }
}

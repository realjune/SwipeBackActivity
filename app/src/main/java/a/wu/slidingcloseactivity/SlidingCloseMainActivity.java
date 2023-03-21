package a.wu.slidingcloseactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import a.wu.viewpager2.ViewPager2Activity;

public class SlidingCloseMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sliding_close_activity_main);
    }

    public void open(View view){

//        Intent intent = new Intent(this, SlidingActivity.class);
        Intent intent = new Intent(this, ViewPager2Activity.class);
        startActivity(intent);
    }
}

package a.wu.viewpager2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import a.wu.slidingcloseactivity.R;

/**
 * @author wangjx
 * @version 1.0.0
 * @date 2023/3/20
 */
public class ViewPager2Adapter extends RecyclerView.Adapter<ViewPager2Adapter.HorizontalVpViewHolder> {

    private List<Integer> backgrounds;
    private Context mContext;

    // 适配器的构造方法，添加不同背景到数组里
    public ViewPager2Adapter(Context context) {
        mContext = context;
        if (backgrounds == null) {
            backgrounds = new ArrayList<>();
            backgrounds.add(R.color.colorAccent);
            backgrounds.add(R.color.white);
            backgrounds.add(R.color.black);
            backgrounds.add(R.color.teal_200);
            backgrounds.add(R.color.teal_700);
            backgrounds.add(R.color.purple_200);
        }
    }


    // onCreatedViewHolder()方法作用是绑定item视图
    @NonNull
    @Override
    public HorizontalVpViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HorizontalVpViewHolder(LayoutInflater.from(mContext)
                .inflate((R.layout.item_ll_background), parent, false));
    }

    // 该方法的作用是将数据跟视图（ViewHolder）绑定
    @Override
    public void onBindViewHolder(@NonNull HorizontalVpViewHolder holder, int position) {
        holder.mTextView.setText("第 " + (position + 1) + "界面");
        holder.mLinearLayout.setBackgroundColor(backgrounds.get(position));
    }


    // 返回Item的数量，即可以ViewPager可以滑动的页数
    @Override
    public int getItemCount() {
        if (backgrounds == null) {
            return 0;
        }
        return backgrounds.size();
    }


    // 创建ViewHolder内部类，用来存储并绑定实例化的Item对象
    class HorizontalVpViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout mLinearLayout;
        private TextView mTextView;

        HorizontalVpViewHolder(@NonNull View itemView) {
            super(itemView);
            mLinearLayout = itemView.findViewById(R.id.item_ll_background);
            mTextView = itemView.findViewById(R.id.item_tv_title);
        }
    }
}

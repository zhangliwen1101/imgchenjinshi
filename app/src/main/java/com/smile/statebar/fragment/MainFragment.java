package com.smile.statebar.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.smile.statebar.R;
import com.smile.statebar.utils.StatusBarCompat;
import com.smile.statebar.utils.Util;
import com.smile.statebar.view.ObservableScrollView;

/**
 * Created by y.vn on 2017/9/13.
 */

public class MainFragment extends Fragment {

//    private LinearLayout head;
//    private LinearLayout linearLayout;
//    private ObservableScrollView scrollView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

//        head = view.findViewById(R.id.main_head);
//        linearLayout = view.findViewById(R.id.main_linear);
//        scrollView = view.findViewById(R.id.main_scrollview);
//        head.setPadding(0, Util.getWindowStateHeight(getContext()), 0, 0);
        StatusBarCompat.setStatusBarColor(getActivity(), Color.TRANSPARENT);
        //设置透明度
//        head.getBackground().setAlpha(0);

//        linearLayout.removeAllViews();
//        for (int i = 0; i < 20; i++) {
//            TextView tv = new TextView(getActivity());
//            tv.setText(i + "wwww");
//            tv.setPadding(20, 20, 20, 20);
//            tv.setGravity(Gravity.CENTER);
//            linearLayout.addView(tv);
//        }

//        scrollView.setOnScollChangedListener(new ObservableScrollView.OnScollChangedListener() {
//            @Override
//            public void onScrollChanged(ObservableScrollView scrollView, int x, int y, int oldx, int oldy) {
//                Log.e("滚动距离", "          " + scrollView.getScrollY());
//                if (scrollView.getScrollY() < 10) {
//                    StatusBarCompat.setStatusBarColor(getActivity(), Color.TRANSPARENT);
//                    head.getBackground().setAlpha(0);
//                } else if (scrollView.getScrollY() > 10) {
//                    StatusBarCompat.setStatusBarColor(getActivity(), Color.BLUE);
//                    head.getBackground().setAlpha(scrollView.getScrollY() < 255 ? scrollView.getScrollY() : 255);
//                }
//            }
//        });
        return view;

    }

//    @Override
//    public void onHiddenChanged(boolean hidden) {
//        super.onHiddenChanged(hidden);
//        if (!hidden) {
//            StatusBarCompat.setStatusBarColor(getActivity(), Color.TRANSPARENT);
//        }
//    }
}

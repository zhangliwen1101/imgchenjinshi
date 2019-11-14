package com.smile.statebar.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.smile.statebar.R;
import com.smile.statebar.utils.StatusBarCompat;
import com.smile.statebar.utils.Util;

/**
 * Created by y.vn on 2017/9/13.
 */

public class NewsFragment extends Fragment {

    private LinearLayout newsLinear;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        newsLinear = view.findViewById(R.id.newslinear);
        newsLinear.setPadding(0, Util.getWindowStateHeight(getContext()), 0, 0);
        StatusBarCompat.setStatusBarColor(getActivity(), ContextCompat.getColor(getContext(), R.color.colorPrimary));
        return view;
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (!hidden) {
            StatusBarCompat.setStatusBarColor(getActivity(), ContextCompat.getColor(getContext(), R.color.colorPrimary));
        }
    }
}

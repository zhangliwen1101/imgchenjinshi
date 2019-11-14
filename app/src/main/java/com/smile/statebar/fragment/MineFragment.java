package com.smile.statebar.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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

public class MineFragment extends Fragment {
    private LinearLayout mineLinear;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mine, container, false);
        mineLinear = view.findViewById(R.id.minelinear);
        mineLinear.setPadding(0, Util.getWindowStateHeight(getContext()), 0, 0);
        StatusBarCompat.setStatusBarColor(getActivity(), Color.BLACK);
        return view;
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (!hidden) {
            StatusBarCompat.setStatusBarColor(getActivity(), Color.BLACK);
        }
    }
}

package com.smile.statebar;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.smile.statebar.fragment.MainFragment;
import com.smile.statebar.fragment.MineFragment;
import com.smile.statebar.fragment.NewsFragment;
import com.smile.statebar.utils.Util;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FrameLayout frameLayout;
    private TextView main, news, mine;
    private FragmentManager mainManager;
    private List<Fragment> fragList = new ArrayList<>();
    private int tag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Util.setWindowImmersiveState(this);
        setContentView(R.layout.activity_main);
        frameLayout = (FrameLayout) findViewById(R.id.framelayout);
        main = (TextView) findViewById(R.id.main);
        main.setOnClickListener(this);
        news = (TextView) findViewById(R.id.news);
        news.setOnClickListener(this);
        mine = (TextView) findViewById(R.id.mine);
        mine.setOnClickListener(this);

        fragList.add(new MainFragment());
        fragList.add(new NewsFragment());
        fragList.add(new MineFragment());

        mainManager = getSupportFragmentManager();
        mainManager.beginTransaction().replace(R.id.framelayout, fragList.get(0), "0").commit();
        main.setTextColor(Color.BLUE);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main:
                tag = 0;
                main.setTextColor(Color.BLUE);
                news.setTextColor(Color.BLACK);
                mine.setTextColor(Color.BLACK);
                setFragment(tag);
                break;
            case R.id.news:
                tag = 1;
                main.setTextColor(Color.BLACK);
                news.setTextColor(Color.BLUE);
                mine.setTextColor(Color.BLACK);
                setFragment(tag);
                break;
            case R.id.mine:
                tag = 2;
                main.setTextColor(Color.BLACK);
                news.setTextColor(Color.BLACK);
                mine.setTextColor(Color.BLUE);
                setFragment(tag);
                break;
        }
    }

    public void setFragment(int tag) {
        try {
            Fragment frag = mainManager.findFragmentByTag("" + tag);
            if (frag == null) {
                mainManager.beginTransaction().add(R.id.framelayout, fragList.get(tag), tag + "").commit();
            }
            FragmentTransaction ft = mainManager.beginTransaction();
            for (int i = 0; i < fragList.size(); i++) {
                if (i == tag) {
                    ft.show(fragList.get(i));
                } else {
                    ft.hide(fragList.get(i));
                }
            }
            ft.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

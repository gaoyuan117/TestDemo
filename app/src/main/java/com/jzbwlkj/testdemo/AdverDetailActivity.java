package com.jzbwlkj.testdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class AdverDetailActivity extends AppCompatActivity {
    private ListView mListView;
    private List<String> mList;
    private View headView;
    private AdverDetailAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adver_detail);

        mListView = (ListView) findViewById(R.id.lv_adver_detail);
        headView = View.inflate(this, R.layout.head_adver_detail, null);
        mListView.addHeaderView(headView);
        mList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mList.add("");
        }
        mAdapter = new AdverDetailAdapter(mList,this);
        mListView.setAdapter(mAdapter);
        mListView.setDividerHeight(0);
    }
}

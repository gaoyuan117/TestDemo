package com.jzbwlkj.testdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class NearbyActivity extends AppCompatActivity {
    private ListView mListView;
    private List<String> mList;
    private NearbyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby);
        mListView = (ListView) findViewById(R.id.lv_nearby);
        mList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mList.add("1");
        }
        mAdapter = new NearbyAdapter(mList, this);
        mListView.setAdapter(mAdapter);
    }
}

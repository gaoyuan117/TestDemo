package com.jzbwlkj.testdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class GreetActivity extends AppCompatActivity {
    private ListView mListView;
    private List<String> mList;
    private GreetAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greet);
        mListView = (ListView) findViewById(R.id.lv_greet);
        mList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mList.add("1");
        }
        mAdapter = new GreetAdapter(mList,this);
        mListView.setAdapter(mAdapter);
    }
}

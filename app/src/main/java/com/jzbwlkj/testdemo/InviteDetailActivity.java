package com.jzbwlkj.testdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class InviteDetailActivity extends AppCompatActivity {
    private GridView mGridView;
    private InviteDetailAdapter mAdapter;
    private List<String> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite_detail);
        mGridView = (GridView) findViewById(R.id.gv_invite_detail);
        mList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mList.add("");
        }
        mAdapter = new InviteDetailAdapter(mList, this);
        mGridView.setAdapter(mAdapter);
    }
}

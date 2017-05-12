package com.jzbwlkj.testdemo;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class EvaluateActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private GridView mGridView;
    private EvaluateAdapter mAdapter;
    private List<String> mList;
    private TextView tvLabel;
    private StringBuffer stringBuffer;
    private List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluate);
        initView();
    }

    private void initView() {
        tvLabel = (TextView) findViewById(R.id.tv_evaluate_label);
        mGridView = (GridView) findViewById(R.id.gv_evaluate);
        mList = new ArrayList<>();
        list = new ArrayList<>();
        stringBuffer = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            mList.add("哈哈");
        }
        mAdapter = new EvaluateAdapter(mList, this);
        mGridView.setAdapter(mAdapter);

        mGridView.setOnItemClickListener(this);
        mGridView.setSelector(new ColorDrawable(Color.TRANSPARENT));
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.e("gy", "size:" + list.size());

        CheckBox checkBox = (CheckBox) view.findViewById(R.id.cb_item_evaluate_label);
        if (!checkBox.isChecked()) {

            list.add(mList.get(position));
            checkBox.setChecked(true);
        } else {
            list.remove(mList.get(position));
            checkBox.setChecked(false);
        }

        for (int i = 0; i < list.size(); i++) {
            stringBuffer.append(list.get(i) + " ");
        }
        Log.e("gy", stringBuffer.toString());
        if (!TextUtils.isEmpty(stringBuffer.toString())) {
            tvLabel.setText(stringBuffer.toString());
        } else {
            tvLabel.setText("请给他(她)一个评价吧");
        }
        stringBuffer.setLength(0);
    }
}

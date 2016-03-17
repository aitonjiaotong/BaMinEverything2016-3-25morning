package com.example.zjb.bamin.Gkuaidibao.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.zjb.bamin.R;

public class KuaiDiActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuai_di);
        findID();
        initUI();
        setListener();
    }

    private void setListener() {
        findViewById(R.id.rela_search).setOnClickListener(this);
        findViewById(R.id.rela_jijian).setOnClickListener(this);
    }

    private void initUI() {

    }

    private void findID() {

    }

    @Override
    public void onClick(View v) {
        Intent intent= new Intent();
        switch (v.getId()){
            case R.id.rela_search:
                intent.setClass(KuaiDiActivity.this,SearchActivity.class);
                startActivity(intent);
                break;
            case R.id.rela_jijian:

                break;
        }
    }
}

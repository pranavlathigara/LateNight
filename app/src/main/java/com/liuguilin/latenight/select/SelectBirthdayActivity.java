package com.liuguilin.latenight.select;
/*
 *  项目名：  LateNight 
 *  包名：    com.liuguilin.latenight.select
 *  文件名:   SelectBirthdayActivity
 *  创建者:   LGL
 *  创建时间:  2016/11/7 16:47
 *  描述：    选择生日
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.liuguilin.gankclient.R;

public class SelectBirthdayActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_select_birthday);
    }
}
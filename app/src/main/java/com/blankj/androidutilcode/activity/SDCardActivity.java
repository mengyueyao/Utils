package com.blankj.androidutilcode.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.blankj.androidutilcode.R;
import com.blankj.androidutilcode.base.BaseActivity;

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2016/09/27
 *     desc  : SDCard工具类Demo
 * </pre>
 */
public class SDCardActivity extends BaseActivity {

    @Override
    public void initData(Bundle bundle) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_sdcard;
    }

    @Override
    public void initView(Bundle savedInstanceState, View view) {
        TextView tvAboutSdcard = (TextView) findViewById(R.id.tv_about_sdcard);
    }

    @Override
    public void doBusiness(Context context) {

    }

    @Override
    public void onWidgetClick(View view) {

    }
}

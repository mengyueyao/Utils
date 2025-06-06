package com.blankj.androidutilcode.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.blankj.androidutilcode.R;
import com.blankj.androidutilcode.base.BaseActivity;
import com.blankj.utilcode.util.PhoneUtils;

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2016/10/13
 *     desc  : Phone工具类Demo
 * </pre>
 */
public class PhoneActivity extends BaseActivity {

    @Override
    public void initData(Bundle bundle) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_phone;
    }

    @Override
    public void initView(Bundle savedInstanceState, View view) {
        findViewById(R.id.btn_dial).setOnClickListener(this);
        findViewById(R.id.btn_call).setOnClickListener(this);
        findViewById(R.id.btn_send_sms).setOnClickListener(this);
        findViewById(R.id.btn_send_sms_silent).setOnClickListener(this);
        TextView tvAboutPhone = (TextView) findViewById(R.id.tv_about_phone);
        tvAboutPhone.setText("isPhone: " + PhoneUtils.isPhone()
                + "\ngetIMEI: " + PhoneUtils.getIMEI()
                + "\ngetIMSI: " + PhoneUtils.getIMSI()
                + "\ngetPhoneType: " + PhoneUtils.getPhoneType()
                + "\nisSimCardReady: " + PhoneUtils.isSimCardReady()
                + "\ngetSimOperatorName: " + PhoneUtils.getSimOperatorName()
                + "\ngetSimOperatorByMnc: " + PhoneUtils.getSimOperatorByMnc()
                + "\n获取手机状态信息: " + PhoneUtils.getPhoneStatus()
        );
    }

    @Override
    public void doBusiness(Context context) {

    }

    @Override
    public void onWidgetClick(View view) {
        switch (view.getId()) {
           /* case R.id.btn_dial:
                PhoneUtils.dial("10000");
                break;
            case R.id.btn_call:
                PhoneUtils.call("10000");
                break;
            case R.id.btn_send_sms:
                PhoneUtils.sendSms("10000", "test");
                break;
            case R.id.btn_send_sms_silent:
                PhoneUtils.sendSmsSilent("10000", "test");
                break;*/
        }
    }
}

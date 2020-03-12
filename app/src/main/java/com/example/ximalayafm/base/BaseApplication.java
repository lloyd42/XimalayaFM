package com.example.ximalayafm.base;

import android.app.Application;

import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CommonRequest request = CommonRequest.getInstanse();
        if (DTransferConstants.isRelease) {
            String mAppSecret = "8646d66d6abe2efd14f2891f9fd1c8af";
            request.setAppkey("9f9ef8f10bebeaa83e71e62f935bede8");
            request.setPackid("com.app.test.android");
            request.init(this, mAppSecret);
        } else {
            String mAppSecret = "0a09d7093bff3d4947a5c4da0125972e";
            request.setAppkey("f4d8f65918d9878e1702d49a8cdf0183");
            request.setPackid("com.ximalaya.qunfeng");
            request.init(this, mAppSecret);
        }
    }
}

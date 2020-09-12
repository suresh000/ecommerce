package com.bjmasc.ecommerce.base;

import android.app.ProgressDialog;
import android.content.Context;

public class BaseViewModel {

    private Context mContext;

    protected BaseViewModel(Context context) {
        mContext = context;
    }

    protected ProgressDialog showProgressDialog(String message) {
        final ProgressDialog progressDialog = new ProgressDialog(mContext);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setCancelable(false);
        progressDialog.setMessage(message);
        progressDialog.show();
        return progressDialog;
    }

}

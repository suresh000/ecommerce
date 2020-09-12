package com.bjmasc.ecommerce;

import android.content.Context;
import android.content.Intent;

import com.bjmasc.ecommerce.categories.CategoriesActivity;

public final class AppNavigator {

    private AppNavigator() {
        throw new IllegalStateException(getClass().getName());
    }

    public static void navigateToCategoriesActivity(Context context) {
        Intent intent = new Intent(context, CategoriesActivity.class);
        context.startActivity(intent);
    }

}

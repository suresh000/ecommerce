package com.bjmasc.sharedcode.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.text.DecimalFormat;

public final class AppUtils {

    private AppUtils() {
        throw new IllegalArgumentException(AppUtils.class.getName());
    }

    private static final DecimalFormat decimalFormat = new DecimalFormat("##.##");

    public static void showToast(@NonNull final Context context,
                                 @NonNull final String message,
                                 final boolean longDuration) {
        if (longDuration) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }
    }

    public static void gradientBackground(View view, String color1, String color2) {
        int[] colors = {Color.parseColor(color1), Color.parseColor(color2)};

        //create a new gradient color
        GradientDrawable gd = new GradientDrawable(
                GradientDrawable.Orientation.TL_BR, colors);

        gd.setCornerRadius(0f);
        //apply the button background to newly created drawable gradient
        view.setBackground(gd);
    }

    public static void openKeyboard(Activity activity, View view) {
        InputMethodManager inputMethodManager =
                (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.toggleSoftInputFromWindow(
                view.getApplicationWindowToken(),
                InputMethodManager.SHOW_FORCED, 0);
    }

    public static double decimalFormat(double value) {
        String convert = decimalFormat.format(value);
        return Double.parseDouble(convert);
    }
}

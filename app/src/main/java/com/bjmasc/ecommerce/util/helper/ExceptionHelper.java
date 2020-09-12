package com.bjmasc.ecommerce.util.helper;

public class ExceptionHelper {

    private static boolean EXCEPTION_ENABLED = true;

    public static void setException(boolean isLogEnabled) {
        EXCEPTION_ENABLED = isLogEnabled;
    }

    public static void printStackTrace(Exception e) {
        if (EXCEPTION_ENABLED) {
            LogHelper.e("exception", e.getMessage());
        }
    }
}

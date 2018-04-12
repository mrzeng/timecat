package com.time.cat.util.override;

import android.app.Activity;
import android.support.annotation.StringRes;
import android.support.design.widget.Snackbar;
import android.view.View;

import com.nispok.snackbar.SnackbarManager;
import com.nispok.snackbar.enums.SnackbarType;
import com.time.cat.TimeCatApp;


public class SnackBarUtil {
    public static void show(View view, String str) {
        try {
            Snackbar.make(view, str, Snackbar.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void show(View view, int str) {
        show(view, TimeCatApp.getInstance().getString(str));
    }

    public static void show(View view, String str, String cancel, final View.OnClickListener listener) {
        try {
            Snackbar.make(view, str, Snackbar.LENGTH_LONG).setAction(cancel, new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) listener.onClick(v);
                }
            }).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void show(View view, int str, String cancel, final View.OnClickListener listener) {
        show(view, TimeCatApp.getInstance().getString(str), cancel, listener);
    }

    public static void show(View view, String str, int cancel, final View.OnClickListener listener) {
        show(view, str, TimeCatApp.getInstance().getString(cancel), listener);
    }

    public static void show(View view, int str, int cancel, final View.OnClickListener listener) {
        show(view, TimeCatApp.getInstance().getString(str), TimeCatApp.getInstance().getString(cancel), listener);
    }

    public static void show(String string, Activity activity, com.nispok.snackbar.Snackbar.SnackbarDuration duration) {

        SnackbarManager.show(com.nispok.snackbar.Snackbar.with(activity.getApplicationContext()).type(SnackbarType.MULTI_LINE).duration(duration).text(string), activity);
    }

    public static void show(String string, Activity activity) {
        show(string, activity, com.nispok.snackbar.Snackbar.SnackbarDuration.LENGTH_SHORT);
    }

    public static void show(@StringRes int string, Activity activity) {
        show(activity.getResources().getString(string), activity, com.nispok.snackbar.Snackbar.SnackbarDuration.LENGTH_SHORT);
    }
}

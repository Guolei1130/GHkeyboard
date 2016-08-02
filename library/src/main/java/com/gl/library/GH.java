package com.gl.library;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class GH {

    public static void init(@NonNull Activity activity){
        setTouchListener(activity);
    }

    public static void init(@NonNull Fragment fragment){
        if (fragment.getActivity() != null){
            setTouchListener(fragment.getActivity());
        }else {
            throw new NullPointerException("fragment.getActivity() is null");
        }
    }

    public static void init(@NonNull android.support.v4.app.Fragment fragment){
        if (fragment.getActivity() != null){
            setTouchListener(fragment.getActivity());
        }else {
            throw new NullPointerException("fragment.getActivity() is null");
        }
    }

    private static void setTouchListener(final Activity context){
        context.getWindow().getDecorView().setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
                if (context.getCurrentFocus() != null) {
                    imm.hideSoftInputFromWindow(context.getCurrentFocus().getWindowToken(),0);
                }else {
                    imm.hideSoftInputFromWindow((context.findViewById(android.R.id.content)).getWindowToken(),0);
                }
                return false;
            }
        });
    }

}

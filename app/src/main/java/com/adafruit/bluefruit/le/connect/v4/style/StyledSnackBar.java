package com.adafruit.bluefruit.le.connect.v4.style;

import android.content.Context;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import com.adafruit.bluefruit.le.connect.v4.R;
import com.google.android.material.snackbar.Snackbar;

public class StyledSnackBar {

    public static void styleSnackBar(Snackbar snackbar, Context context) {
        snackbar.setBackgroundTint(ContextCompat.getColor(context, R.color.colorAccent));
        snackbar.setTextColor(ContextCompat.getColor(context, R.color.infotext));
    }
}

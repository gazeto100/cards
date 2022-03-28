package com.example.poker;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;

public class Background {

    private Bitmap bgr;
    private int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
    private int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;


    public Background(Bitmap bmp) {
        bgr = bmp;

        bgr = Bitmap.createScaledBitmap(bgr, screenWidth, screenHeight, true);
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(bgr, 0, 0, null);
    }
}

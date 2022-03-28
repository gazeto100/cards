package com.example.poker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.SurfaceView;

import java.util.ArrayList;

public class Coins {

    private int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
    private int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;

    ArrayList<Bitmap> bitmapCoins = new ArrayList<Bitmap>();

    public void Init(Bitmap bitmapCoinInit, int screenWidth, int screenHeight){

        bitmapCoinInit = Bitmap.createScaledBitmap(bitmapCoinInit, screenWidth, screenHeight, true);

        bitmapCoins.add(bitmapCoinInit);
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(bitmapCoins.get(0), 0, screenHeight-bitmapCoins.get(0).getHeight(), null);
    }

}

package com.example.poker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.SurfaceView;

import java.util.ArrayList;

public class Coins {

    private int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
    private int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;

    private int x = 20;

    ArrayList<Bitmap> bitmapCoins = new ArrayList<Bitmap>();

    public void Init(Bitmap bitmapCoinInit, int screenWidth, int screenHeight){

        bitmapCoinInit = Bitmap.createScaledBitmap(bitmapCoinInit, screenWidth, screenHeight, true);

        bitmapCoins.add(bitmapCoinInit);
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(bitmapCoins.get(0), x, screenHeight-bitmapCoins.get(0).getHeight()*2, null);
        canvas.drawBitmap(bitmapCoins.get(1), x+bitmapCoins.get(0).getWidth()*1, screenHeight-bitmapCoins.get(0).getHeight()*2, null);
        canvas.drawBitmap(bitmapCoins.get(2), x+bitmapCoins.get(0).getWidth()*2, screenHeight-bitmapCoins.get(0).getHeight()*2, null);
        canvas.drawBitmap(bitmapCoins.get(3), x+bitmapCoins.get(0).getWidth()*3, screenHeight-bitmapCoins.get(0).getHeight()*2, null);
        canvas.drawBitmap(bitmapCoins.get(4), x+bitmapCoins.get(0).getWidth()*4, screenHeight-bitmapCoins.get(0).getHeight()*2, null);


        Paint paint = new Paint();
        paint.setColor(Color.WHITE);

        paint.setTextSize(50);
        canvas.drawText("Some Text:"+screenWidth, 10, 50, paint);
        canvas.drawText("Some Text:"+screenHeight, 10, 120, paint);
    }

}

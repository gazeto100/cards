package com.example.poker;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

public class BetWin {

    private int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
    private int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;

    Bitmap btCredit;
    Bitmap btBet;

    public void Init (){

//        bitmapButtonsInit = Bitmap.createScaledBitmap(bitmapButtonsInit, screenWidth, screenHeight, true);
        btBet = BitmapFactory.decodeResource(mResources, R.drawable.bet);

    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(btBet, screenWidth/2-btBet.getWidth()/2, screenHeight - btBet.getHeight()*3, null);
    }

}

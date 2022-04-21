package com.example.poker;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.SurfaceView;

public class BetWin {

    private int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
    private int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;

    Bitmap btCredit;
    Bitmap btBet;
    private int ybutton;

    public void Init (Context cnt){

        ybutton = 0;
//        bitmapButtonsInit = Bitmap.createScaledBitmap(bitmapButtonsInit, screenWidth, screenHeight, true);
        btBet = BitmapFactory.decodeResource(cnt.getResources(), R.drawable.bet);
        btCredit = BitmapFactory.decodeResource(cnt.getResources(), R.drawable.credit);
        btBet = Bitmap.createScaledBitmap(btBet, screenWidth/2, 180, true);
        btCredit = Bitmap.createScaledBitmap(btCredit, screenWidth/2, 180, true);
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(btBet, screenWidth-btBet.getWidth(), 0, null);
        canvas.drawBitmap(btCredit, 0, 0, null);
    }


    public int getButtonY(){
        return ybutton;
    }
    public void setButtonY(int y){
        ybutton = y;
    }

}

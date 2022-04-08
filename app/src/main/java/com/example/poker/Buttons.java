package com.example.poker;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;

import java.util.ArrayList;

public class Buttons {

    ArrayList<Bitmap> bitmapButtons = new ArrayList<Bitmap>();

    private int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
    private int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;


    public void Init(Bitmap bitmapButtonsInit, int screenWidth, int screenHeight){

//        bitmapButtonsInit = Bitmap.createScaledBitmap(bitmapButtonsInit, screenWidth, screenHeight, true);

        bitmapButtons.add(bitmapButtonsInit);

    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(bitmapButtons.get(0), screenWidth-bitmapButtons.get(0).getWidth(), screenHeight - bitmapButtons.get(0).getHeight()*3, null);
        canvas.drawBitmap(bitmapButtons.get(1), 0, screenHeight - bitmapButtons.get(0).getHeight()*3, null);
    }

}

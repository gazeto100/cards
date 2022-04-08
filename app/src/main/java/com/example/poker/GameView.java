package com.example.poker;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class GameView extends SurfaceView implements SurfaceHolder.Callback {

    private int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
    private int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;

    private MainThread thread;
    private CharacterSprite characterSprite;
    private Coins coins = new Coins();
    private Buttons buttons = new Buttons();
    private Background background;
    private BetWin betwin = new BetWin();


    public GameView(MainActivity context) {
        super(context);

        getHolder().addCallback(this);

        betwin.Init();

        buttons.Init(BitmapFactory.decodeResource(getResources(), R.drawable.button_deal), screenWidth/5, 114);
        buttons.Init(BitmapFactory.decodeResource(getResources(), R.drawable.button_hit), 144, 114);

        coins.Init(BitmapFactory.decodeResource(getResources(), R.drawable.coin1), screenWidth/5, screenWidth/5);
        coins.Init(BitmapFactory.decodeResource(getResources(), R.drawable.coin5), screenWidth/5, screenWidth/5);
        coins.Init(BitmapFactory.decodeResource(getResources(), R.drawable.coin10), screenWidth/5, screenWidth/5);
        coins.Init(BitmapFactory.decodeResource(getResources(), R.drawable.coin25), screenWidth/5, screenWidth/5);
        coins.Init(BitmapFactory.decodeResource(getResources(), R.drawable.coin100), screenWidth/5, screenWidth/5);

        characterSprite = new CharacterSprite(BitmapFactory.decodeResource(getResources(), R.drawable.dog));
        background = new Background(BitmapFactory.decodeResource(getResources(), R.drawable.blackjack1));
        thread = new MainThread(getHolder(), this);
        setFocusable(true);
    }

    @Override
    public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {

        thread.setRunning(true);
        thread.start();

    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
        boolean retry = true;
        while (retry) {
            try {
                thread.setRunning(false);
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            retry = false;
        }
    }

    public void update() {
        characterSprite.update();
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (canvas != null) {
            background.draw(canvas);
            characterSprite.draw(canvas);
            betwin.draw(canvas);
            coins.draw(canvas);
            buttons.draw(canvas);
        }
    }
}

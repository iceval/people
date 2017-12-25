package com.example.ugs.people;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class Man {
    float x, y;
    Bitmap sprite;

    Man( float x, float y,Bitmap sprite){
        this.x = x;
        this.y = y;
        this.sprite = sprite;
    }
int nFrame=0;
    Paint p = new Paint();
    void draw(Canvas canvas){
       Rect to = new Rect((int)x-54,(int)y-70,(int)x+54,(int)y+70);
        Rect frame = new Rect(0,0,nFrame*108,nFrame*108);
        nFrame++;
        nFrame%=8;

        canvas.drawBitmap(sprite,frame, to, p);
    }
}

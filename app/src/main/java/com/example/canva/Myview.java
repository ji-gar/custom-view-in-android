package com.example.canva;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

class Myview extends View {
Paint paint,paint1;
   public Myview(Context context) {
      super(context);
      init();
   }

   public Myview(Context context, @Nullable AttributeSet attrs) {
      super(context, attrs);
      init();
   }
   public void init()
   {
      paint=new Paint();
      paint1=new Paint();
      paint.setColor(Color.YELLOW);
      paint.setStyle(Paint.Style.FILL);
      paint1.setStyle(Paint.Style.FILL);
   }

   @Override
   protected void onDraw(Canvas canvas) {
      super.onDraw(canvas);
      //canvas.drawColor(Color.WHITE);
      canvas.drawCircle(this.getWidth()/2,this.getHeight()/2,150,paint);
     // canvas.drawColor(Color.BLACK);
      canvas.drawCircle(470,970,5,paint1);
      canvas.drawCircle(580,970,5,paint1);

   }
}


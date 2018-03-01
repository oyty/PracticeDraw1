package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    RectF rectF = new RectF();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(3);

        // 画坐标轴
        canvas.drawLine(100, 50, 100, 600, paint);
        canvas.drawLine(100, 600, 1000, 600, paint);

        paint.setColor(Color.GREEN);

        rectF.set(125, 590, 225, 598);
        canvas.drawRect(rectF, paint);

        rectF.set(250, 550, 350, 598);
        canvas.drawRect(rectF, paint);

        rectF.set(375, 550, 475, 598);
        canvas.drawRect(rectF, paint);

        rectF.set(500, 400, 600, 598);
        canvas.drawRect(rectF, paint);

        rectF.set(625, 350, 725, 598);
        canvas.drawRect(rectF, paint);

        rectF.set(750, 200, 850, 598);
        canvas.drawRect(rectF, paint);

        rectF.set(875, 500, 975, 598);
        canvas.drawRect(rectF, paint);

        paint.setColor(Color.WHITE);
        paint.setTextSize(40);
        paint.setTextAlign(Paint.Align.CENTER);

        canvas.drawText("Froyo", 175, 640, paint);
        canvas.drawText("GB", 300, 640, paint);
        canvas.drawText("ICS", 425, 640, paint);
        canvas.drawText("JB", 550, 640, paint);
        canvas.drawText("KitKat", 675, 640, paint);
        canvas.drawText("L", 800, 640, paint);
        canvas.drawText("M", 925, 640, paint);


    }
}

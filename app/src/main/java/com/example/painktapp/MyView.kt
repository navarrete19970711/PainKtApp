package com.example.painktapp

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View
import kotlin.io.path.Path

// 1) viewを継承したクラス
class MyView(context: Context?, attrs: AttributeSet?) : View(context, attrs) {

    private var path:Path = Path()//線を引く、図形を描く、グラフィック描画
    private var paint:Paint = Paint()//色とか太さ

    // 2) 描画の準備
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        paint.color = Color.BLUE//色
        paint.style = Paint.Style.STROKE//描画のスタイルを線にする
        paint.strokeWidth = 10F//幅
        canvas.drawPath(path,paint)
    }

}
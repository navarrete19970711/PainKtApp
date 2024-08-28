package com.example.painktapp

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import kotlin.io.path.Path

// 1) viewを継承したクラス
class MyView(context: Context?, attrs: AttributeSet?) : View(context, attrs) {

    private var path:Path = Path()//線を引く、図形を描く、グラフィック描画
    private var paint:Paint = Paint()//色とか太さ
    private var drawx:Float = 0F
    private var drawy:Float = 0F

    // 2) 描画の準備
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        paint.color = Color.BLUE//色
        paint.style = Paint.Style.STROKE//描画のスタイルを線にする
        paint.strokeWidth = 10F//幅
        canvas.drawPath(path,paint)
    }

    // 3) 実際の描画（押した時、動かした時）
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        // タッチポジション（x座標、y座標 ）
        drawx = event!!.x
        drawy = event.y

        when(event.action){
            MotionEvent.ACTION_DOWN -> path.moveTo(drawx,drawy)
            MotionEvent.ACTION_MOVE -> path.lineTo(drawx,drawy)
        }
        //再描画を実行する呪文
        invalidate()
        //return super.onTouchEvent(event)
        return true
    }

    // 4) クリア処理（の関数を作る）
    fun clearCanvas(){
        path.reset()
        invalidate()
    }

}
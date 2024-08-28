package com.example.painktapp

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.View

// 1) viweを継承したクラス
class MyView(context: Context?, attrs: AttributeSet?) : View(context, attrs) {

    // 2) 描画の準備
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
    }

}
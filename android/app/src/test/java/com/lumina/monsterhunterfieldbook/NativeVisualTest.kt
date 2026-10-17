package com.lumina.monsterhunterfieldbook

import android.graphics.Bitmap
import android.graphics.Canvas
import android.view.View
import android.view.ViewGroup
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.Shadows.shadowOf
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode
import java.io.File
import java.time.Duration

/** Skia-rendered review artifacts, not a substitute for physical-device tests. */
@RunWith(RobolectricTestRunner::class)
@Config(sdk=[28],qualifiers="w411dp-h891dp-port-mdpi")
@GraphicsMode(GraphicsMode.Mode.NATIVE)
class NativeVisualTest {
    private fun walk(v:View):List<View> = listOf(v)+if(v is ViewGroup)(0 until v.childCount).flatMap{walk(v.getChildAt(it))}else emptyList()
    private fun capture(root:View,name:String){
        root.measure(View.MeasureSpec.makeMeasureSpec(411,View.MeasureSpec.EXACTLY),View.MeasureSpec.makeMeasureSpec(891,View.MeasureSpec.EXACTLY));root.layout(0,0,411,891)
        val bitmap=Bitmap.createBitmap(411,891,Bitmap.Config.ARGB_8888);root.draw(Canvas(bitmap))
        val output=File("build/reports/$name.png");output.parentFile.mkdirs();output.outputStream().use{bitmap.compress(Bitmap.CompressFormat.PNG,100,it)};bitmap.recycle()
    }
    @Test fun renderFoundationForVisualReview(){
        val controller=Robolectric.buildActivity(MainActivity::class.java).setup();val a=controller.get()
        shadowOf(android.os.Looper.getMainLooper()).idleFor(Duration.ofSeconds(5))
        repeat(5){Thread.sleep(50);shadowOf(android.os.Looper.getMainLooper()).idle()}
        capture(a.root,"native-overview")
        walk(a.root).first{it.contentDescription=="Settings"}.performClick()
        shadowOf(android.os.Looper.getMainLooper()).idleFor(Duration.ofSeconds(1));capture(a.root,"native-settings")
        controller.pause().stop().destroy()
    }
}

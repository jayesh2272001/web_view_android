package com.jayesh.webviewdemo

import android.graphics.Bitmap
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity


class WebViewDemoActivity : AppCompatActivity() {
    private lateinit var wbMain: WebView
    private lateinit var url: String
    lateinit var rvProgressLayout: RelativeLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_demo)

        wbMain = findViewById(R.id.wbMain);
        url = intent.getStringExtra("url").toString()
        rvProgressLayout = findViewById(R.id.rvProgressLayout)

        //wbMain.loadUrl("https://www.google.com/")
        wbMain.loadUrl(url)
        wbMain.webViewClient = WebViewClient()
    }


    override fun onBackPressed() {
        if (wbMain.canGoBack()) {
            wbMain.goBack()
        } else {
            super.onBackPressed()
        }

    }
}
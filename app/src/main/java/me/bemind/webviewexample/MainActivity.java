package me.bemind.webviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView mWebView = (WebView) findViewById(R.id.webview);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setLoadsImagesAutomatically(true);
        //carichiamo finalmete la url
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.setWebChromeClient(new MyChromeClient());
        mWebView.loadUrl("http://www.bemind.io");
    }


    private class MyChromeClient extends WebChromeClient {

    }
}

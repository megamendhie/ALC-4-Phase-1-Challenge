package com.alc.phaseonechallenge;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("About ALC");
        actionBar.setDisplayHomeAsUpEnabled(true);

        WebView wvAbout = findViewById(R.id.wvAbout);
        final ProgressBar prgAbout = findViewById(R.id.prgAbout);

        wvAbout.getSettings().setBuiltInZoomControls(true);
        wvAbout.getSettings().setDisplayZoomControls(false);
        wvAbout.getSettings().setUseWideViewPort(true);
        wvAbout.getSettings().setDomStorageEnabled(true);
        wvAbout.getSettings().setPluginState(WebSettings.PluginState.ON);
        wvAbout.getSettings().setJavaScriptEnabled(true);
        wvAbout.getSettings().setSupportMultipleWindows(true);

        wvAbout.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                prgAbout.setVisibility(View.GONE);
            }
        });
        wvAbout.loadUrl(getResources().getString(R.string.andela_url));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return true;
    }
}

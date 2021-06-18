package com.appcaffesk.bdnews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

public class web extends AppCompatActivity {
    public WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        webView = (WebView) findViewById(R.id.webid);

        Bundle bundle=new Bundle();
        bundle= getIntent().getExtras();
        // String ctg=new String() ;
        String url=new String();

        url=bundle.getString("urlkey");

        getSupportActionBar().setTitle("Newspapers BD");
        webView = (WebView) findViewById(R.id.webid);
        Toast.makeText(getApplicationContext(),"Loading ...Please wait",Toast.LENGTH_SHORT).show();

        webView.loadUrl(url);

    }
    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}

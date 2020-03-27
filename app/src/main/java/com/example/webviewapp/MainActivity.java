package com.example.webviewapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    public void showExternalWebPage(){
        // TODO: Add your code for showing external web page here
    }

    public void showInternalWebPage(){
        // TODO: Add your code for showing internal web page here
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*
        * Rename your App. Tip: Values->Strings
        * Enable Internet access for your App. Tip: Manifest
        * Create a WebView element in the layout file content_main.xml
        * Give the WebView element ID "my_webview"
        -- Commit and push to your github fork
        * Create a private member variable called "myWebView" of type WebView
        * Locate the WebView element created in step 1 using the ID created in step 2
        * Create a new WebViewClient to attach to our WebView. This allows us to
          browse the web inside our app.
        -- Commit and push to your github fork
        * Enable Javascript execution in your WebViewClient
        * Enter the url to load in our WebView
        -- Commit and push to your github fork
        * Move the code that loads a URL into your WebView into the two methods
          "showExternalWebPage()" and "showInternalWebPage()".
        * Call the "showExternalWebPage()" / "showInternalWebPage()" methods
          when you select menu options "External Web Page" or "Internal Web Page"
          respectively
        -- Commit and push to your github fork
        * Take two screenshots using the "Take a screenshot" tool in the AVD
           showing your App. One (1) screenshot showing your internal web page and
           one (1) screenshot showing your external web page.
        */

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_external_web) {
            Log.d("==>","Will display external web page");
            return true;
        }

        if (id == R.id.action_internal_web) {
            Log.d("==>","Will display internal web page");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

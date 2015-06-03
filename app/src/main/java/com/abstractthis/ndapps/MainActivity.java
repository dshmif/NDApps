package com.abstractthis.ndapps;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private static final String TOAST_PREFIX = "This button will launch my";
    private static final String TOAST_SUFFIX = "app!";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void launchSpotifyStreamer(View view) {
        CharSequence text = String.format("%s Spotify Streamer %s", TOAST_PREFIX, TOAST_SUFFIX);
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }

    public void launchScoresApp(View view) {
        CharSequence text = String.format("%s Scores %s", TOAST_PREFIX, TOAST_SUFFIX);
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }

    public void launchLibraryApp(View view) {
        CharSequence text = String.format("%s Library %s", TOAST_PREFIX, TOAST_SUFFIX);
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }

    public void launchBuildItBigger(View view) {
        CharSequence text = String.format("%s Build It Bigger %s", TOAST_PREFIX, TOAST_SUFFIX);
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }

    public void launchXYZReader(View view) {
        CharSequence text = String.format("%s XYZ Reader %s", TOAST_PREFIX, TOAST_SUFFIX);
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }

    public void launchCapstoneApp(View view) {
        CharSequence text = String.format("%s Capstone %s", TOAST_PREFIX, TOAST_SUFFIX);
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }
}

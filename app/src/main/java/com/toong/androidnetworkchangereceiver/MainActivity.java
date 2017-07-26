package com.toong.androidnetworkchangereceiver;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //        if(NetworkChangeReceiver.mIsNetworkAvailable) {
        //            Toast.makeText(this, "s", Toast.LENGTH_SHORT).show();
        //        }else{
        //            Toast.makeText(this, "b", Toast.LENGTH_SHORT).show();
        //        }

        if (AppStatus.getInstance(this).isOnline()) {
            Toast.makeText(this, "You are online!!!!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "You are not online!!!!", Toast.LENGTH_SHORT).show();
            Log.v("Home", "############################You are not online!!!!");
        }
    }
}

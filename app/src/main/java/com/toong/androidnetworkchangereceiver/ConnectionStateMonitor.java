package com.toong.androidnetworkchangereceiver;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;

public class ConnectionStateMonitor{

   final NetworkRequest networkRequest;

   public ConnectionStateMonitor() {
       networkRequest = new NetworkRequest.Builder()
               .addTransportType(NetworkCapabilities.TRANSPORT_CELLULAR)
               .addTransportType(NetworkCapabilities.TRANSPORT_WIFI).build();
   }

   public void enable(Context context) {
       ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
       connectivityManager.registerNetworkCallback(networkRequest , new ConnectivityManager.NetworkCallback(){
           @Override
           public void onAvailable(Network network) {
               super.onAvailable(network);
           }
       });
   }
}
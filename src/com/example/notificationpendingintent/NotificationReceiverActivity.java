package com.example.notificationpendingintent;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class NotificationReceiverActivity extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.result);
    
    Bundle b=getIntent().getExtras();
    String hellString=b.getString("testValue");
    Log.v("Notification", "testing notification: "+hellString);
  }
} 
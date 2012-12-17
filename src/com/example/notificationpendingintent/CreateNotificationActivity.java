package com.example.notificationpendingintent;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreateNotificationActivity extends Activity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
  }

  @SuppressWarnings("deprecation")
public void createNotification(View view) {

	  NotificationManager nm = (NotificationManager) getSystemService(this.NOTIFICATION_SERVICE);
	  
	  Notification notification = new Notification(R.drawable.ic_launcher, "status bar title...", System.currentTimeMillis());
	  notification.flags = Notification.FLAG_AUTO_CANCEL;
	  
	  Intent showIntent=new Intent(CreateNotificationActivity.this, NotificationReceiverActivity.class);
	  showIntent.putExtra("testValue", "hell");
 
	  PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, showIntent, 0);
	 
	  notification.setLatestEventInfo(this, "title...", "text...", pendingIntent);
	 
	  notification.flags |= Notification.FLAG_AUTO_CANCEL;
	  nm.notify("tag...", 0, notification);

  }
} 
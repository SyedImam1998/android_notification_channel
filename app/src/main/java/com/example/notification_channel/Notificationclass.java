package com.example.notification_channel;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;


public class Notificationclass extends Application {
    public static final String CHANNEL_ID_1="channel1";
    @Override
    public void onCreate() {
        super.onCreate();
        createNotificationChannels();
    }
    private void createNotificationChannels(){
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            NotificationChannel channel1= new NotificationChannel(CHANNEL_ID_1
            , "IMAM APP", NotificationManager.IMPORTANCE_HIGH);

            channel1.setDescription("your are looking at description of Imam APP");

            NotificationManager manager=getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel1);
        }
    }
}

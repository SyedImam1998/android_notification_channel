package com.example.notification_channel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static com.example.notification_channel.Notificationclass.CHANNEL_ID_1;

public class MainActivity extends AppCompatActivity {
    private NotificationManagerCompat notificationManager;
    public EditText editTextTitle;
    public EditText editTextMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextTitle=findViewById(R.id.editTextTextPersonName);
        editTextMessage=findViewById(R.id.editTextTextPersonName2);
        notificationManager=NotificationManagerCompat.from(this);
    }
    public void showNotification(View view){
        String title=editTextTitle.getText().toString();
        String message=editTextMessage.getText().toString();
        Notification notification= new NotificationCompat.Builder(this,CHANNEL_ID_1)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle(title)
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();
        notificationManager.notify(1,notification);

    }
}
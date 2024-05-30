package com.example.incidents.main_notifications_option;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.incidents.R;

public class NotificationsOptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications_option);
        ListView notificationListView = findViewById(R.id.notificationList);

        // Создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_notification, R.id.notificationType, notificationData);

        // Устанавливаем адаптер на ListView
        notificationListView.setAdapter(adapter);
    }

    String[] notificationData = {
            "Уведомление 1",
            "Уведомление 2",
            "Уведомление 3",
            "Уведомление 4",
            "Уведомление 5",
            "Уведомление 6 ",
    };
}
package com.example.incidents.entrance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.incidents.MainActivity;
import com.example.incidents.MainHomePageActivity;
import com.example.incidents.R;

public class EntranceActivity extends AppCompatActivity {
    private EditText emailEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrance);

        emailEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Проверяем введенные данные
                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(EntranceActivity.this, "Заполните все поля", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Проверяем соответствие введенных данных тестовым
                if (email.equals("123@gmail.com") && password.equals("123")) {
                    // Переходим на главную страницу приложения
                    Intent intent = new Intent(EntranceActivity.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    // Выводим сообщение об ошибке авторизации
                    Toast.makeText(EntranceActivity.this, "Ошибка авторизации", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
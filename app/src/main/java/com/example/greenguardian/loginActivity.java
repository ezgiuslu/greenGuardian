package com.example.greenguardian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText usernameEditText = findViewById(R.id.username);
        EditText passwordEditText = findViewById(R.id.passwd); // Doğru ID'yi kullanın
        Button loginButton = findViewById(R.id.loginbttn);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Kullanıcı giriş bilgilerini doğrulayın
                // (Veritabanından kontrol edin, dosyadan okuyun vb.)

                if (username.equals("admin") && password.equals("1234")) {
                        // Giriş başarılıysa ana sayfaya veya diğer sayfalara yönlendirin
                    Intent intent = new Intent(loginActivity.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    // Giriş başarısızsa kullanıcıyı bilgilendirin
                    Toast.makeText(loginActivity.this, "Username or password is incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
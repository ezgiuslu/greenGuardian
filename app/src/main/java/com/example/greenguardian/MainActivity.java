package com.example.greenguardian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText usernameEditText = findViewById(R.id.username);
        EditText tcIdEditText = findViewById(R.id.tcId);
        EditText emailEditText = findViewById(R.id.email);
        EditText passwordEditText = findViewById(R.id.password);
        EditText repasswordEditText = findViewById(R.id.repassword);

        Button signupButton = findViewById(R.id.signupbtn);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kullanıcı giriş bilgilerini alın
                String username = usernameEditText.getText().toString();
                String tcId = tcIdEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                String repassword = repasswordEditText.getText().toString();

                // Giriş bilgilerini doğrulayın ve kaydedin
                registerUser(username, tcId, email, password, repassword);
            }
        });
    }

    // Kullanıcı giriş bilgilerini kaydetmek için bu metodu oluşturun
    private void registerUser(String username, String tcId, String email, String password, String repassword) {
        // Giriş bilgilerini doğrulayın
        if (username.isEmpty()) {
            // Kullanıcı adı boş olamaz
            return;
        }
        if (tcId.isEmpty()) {
            // T.C. kimlik numarası boş olamaz
            return;
        }
        if (email.isEmpty()) {
            // E-posta adresi boş olamaz
            return;
        }
        if (password.isEmpty()) {
            // Şifre boş olamaz
            return;
        }
        if (!password.equals(repassword)) {
            // Şifreler eşleşmiyor
            return;
        }

        // Giriş bilgilerini kaydedin
        // (Veritabanına kaydetmek, dosyaya yazmak vb.)

        // Kayıt başarılıysa kullanıcıyı bilgilendirin
        Toast.makeText(this, "Register is succesfull!", Toast.LENGTH_SHORT).show();

        // Ana sayfaya veya başka bir sayfaya yönlendirin
        // LoginActivity'ye yönlendirin
        Intent intent = new Intent(this, loginActivity.class);
        startActivity(intent);
    }
}

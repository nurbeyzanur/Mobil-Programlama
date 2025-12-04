package com.project.beginner;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding; // ViewBinding nesnesi
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);

                // Binding'i başlatıyoruz
                binding = ActivityMainBinding.inflate(getLayoutInflater());
                setContentView(binding.getRoot());

                // Buton tıklama
                binding.btnChange.setOnClickListener(view -> {

                    // 1. Snackbar mesajı göster
                    Snackbar.make(view, "Butona tıkladınız!", Snackbar.LENGTH_SHORT).show();

                    // 2. TextView içindeki yazıyı değiştir
                    binding.tvMessage.setText("Yeni Mesaj Yazıldı!");
                });
            }
        }

    }
}
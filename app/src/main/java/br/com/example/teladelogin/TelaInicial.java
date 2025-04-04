package br.com.example.teladelogin;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TelaInicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_inicial);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        String loginUsuario =  getIntent().getStringExtra("chaveLoginInformado");
        String senhaInformada = getIntent().getStringExtra("chaveSenhaInformada");
        TextView bemView = findViewById(R.id.textViewbemVindo);
        bemView.setText("Bem vindo " + loginUsuario +
                "\nSua senha e: " + senhaInformada +
                "\n Favor troca essa senha fraca");

    }
}
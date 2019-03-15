package com.example.labo2_ejer1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnCheck;
    private EditText user, pass;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.txtUser);
        pass = findViewById(R.id.txtPass);
        result = findViewById(R.id.txtResult);
        btnCheck = findViewById(R.id.btnCheck);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(user.getText());

            }
        });
        btnCheck.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                result.setText(pass.getText());
                btnCheck.setText("LogIn");
                return false;
            }
        });
    }
}

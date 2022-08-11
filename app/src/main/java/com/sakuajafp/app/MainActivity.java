package com.sakuajafp.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String Nomor = "085156891737";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtNomor = findViewById(R.id.txtNomor);
        Button login = findViewById(R.id.Masuk);

                login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (txtNomor.getText().toString().equalsIgnoreCase(Nomor)){
                            startActivity(new Intent(MainActivity.this, home.class));
                    }else{
                        Toast.makeText(MainActivity.this, "Nomor", Toast.LENGTH_SHORT).show();
                    }

                }
                });
    }
}
package com.example.interfacecallback;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.example.interfacecallback.SecondActivity.setInterfaceInstance;

public class MainActivity extends AppCompatActivity implements MyInterface {

    Button btnGotoSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGotoSecondActivity = findViewById(R.id.btnGotoSecondActivity);
        btnGotoSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                setInterfaceInstance(MainActivity.this);
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }

    @Override public void callBack(String data) {
        Toast.makeText(this, "Data received: " + data, Toast.LENGTH_LONG).show();
    }
}
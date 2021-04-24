package com.example.interfacecallback;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private static MyInterface myInterface;
    Button btnGoBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnGoBack = findViewById(R.id.btnGoBack);
        btnGoBack.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                finish();
                myInterface.callBack("IT wala");
            }
        });
    }

    public static void setInterfaceInstance(Context context) {
        myInterface = (MyInterface) context;
    }
}
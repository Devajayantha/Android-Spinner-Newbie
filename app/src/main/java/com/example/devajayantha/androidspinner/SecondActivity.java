package com.example.devajayantha.androidspinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView TxView;
    TextView TxView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TxView = (TextView) findViewById(R.id.TxView);
        TxView2 = (TextView) findViewById(R.id.TxView2);
        Intent intent = getIntent();

        String Nama = intent.getStringExtra("txt");
        String Kota = intent.getStringExtra("spn");
        TxView.setText("Nama Anda : "+ Nama);
        TxView2.setText("Kota Asal Anda : " + Kota);

    }
}

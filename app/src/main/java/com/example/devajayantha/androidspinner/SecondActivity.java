package com.example.devajayantha.androidspinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    TextView TxView;
    TextView TxView2;
    TextView TxView3;
    TextView TxView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TxView = (TextView) findViewById(R.id.TxView);
        TxView2 = (TextView) findViewById(R.id.TxView2);
        TxView3 = (TextView) findViewById(R.id.TxView3);
        TxView4 = (TextView) findViewById(R.id.TxView4);
        Intent intent = getIntent();

        String Nama = intent.getStringExtra("txt");
        String jurusan = intent.getStringExtra("spn");
        String Nim =  intent.getStringExtra("nim");
        String Amt = intent.getStringExtra("almt");
        TxView.setText("Nama Anda : "+ Nama);
        TxView3.setText("Nim  : "+ Nim);
        TxView4.setText("Alamat : "+ Amt);
        TxView2.setText("Jurusan  : " + jurusan);

    }
}

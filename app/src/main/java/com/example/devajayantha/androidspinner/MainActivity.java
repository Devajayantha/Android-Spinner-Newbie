package com.example.devajayantha.androidspinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner_new;
    private Button button_new;
    private Intent intent;
    private Object android;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner_new = (Spinner) findViewById(R.id.spinner);
        button_new = (Button) findViewById(R.id.Button);


        button_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("data",String.valueOf(spinner_new.getSelectedItem()));
                startActivity(intent);
            }
        });
        spinner_new.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        String text = spinner_new.getSelectedItem().toString();
                        Toast.makeText(getApplicationContext(),"Kamu memilih Kota : " + text,Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    /*
    *
    * ga perlu buat class lagi boy
    * */

//    public class CustomOnItemSelectedListener implements AdapterView.OnItemSelectedListener {
//
//        String firstItem = spinner_new.getSelectedItem().toString();
//
//        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
//            if (firstItem.equals(String.valueOf(spinner_new.getSelectedItem()))) {
//                //memilih salah satu
//            } else {
//                Toast.makeText(parent.getContext(),
//                        "Kamu memilih : " + parent.getItemAtPosition(pos).toString(),
//                        Toast.LENGTH_LONG).show();
//            }
//        }
//
//        @Override
//        public void onNothingSelected(AdapterView<?> arg) {
//
//        }
//    }
}

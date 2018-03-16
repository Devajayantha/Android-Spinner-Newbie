package com.example.devajayantha.androidspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner_new;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner_new = (Spinner) findViewById(R.id.spinner);
        spinner_new.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }

    public class CustomOnItemSelectedListener implements AdapterView.OnItemSelectedListener {

        String firstItem = String.valueOf(spinner_new.getSelectedItem());

        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
            if (firstItem.equals(String.valueOf(spinner_new.getSelectedItem()))) {
                //memilih salah satu
            } else {
                Toast.makeText(parent.getContext(),
                        "Kamu memilih : " + parent.getItemAtPosition(pos).toString(),
                        Toast.LENGTH_LONG).show();
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> arg) {

        }
    }
}

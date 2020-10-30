package com.example.suhu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.TextView;

import java.security.PrivateKey;

public class MainActivity extends Activity implements OnClickListener{

    public EditText awal2,celcius2,reamur2,fahrenheit2,kelvin2;;
            double awal1,celcius1,reamur1,fahrenheit1,kelvin1;
            Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        awal2 = (EditText) findViewById(R.id.awal);
        celcius2 = (EditText) findViewById(R.id.celcius);
        reamur2 = (EditText) findViewById(R.id.reamur);
        fahrenheit2 = (EditText) findViewById(R.id.fahrenheit);
        kelvin2 = (EditText) findViewById(R.id.kelvin);
        this.btn = (Button)this.findViewById(R.id.btn);
        this.btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        awal1 = Double.parseDouble(awal2.getText().toString());
        celcius1 = awal1;
        celcius2.setText((String.valueOf(celcius1)));

        reamur1 = (celcius1*0.8);
        reamur2.setText((String.valueOf(reamur1)));

        fahrenheit1 = (celcius1*1.8) + 32;
        fahrenheit2.setText((String.valueOf(fahrenheit1)));

        kelvin1 = celcius1+273;
        kelvin2.setText((String.valueOf(kelvin1)));

    }
}
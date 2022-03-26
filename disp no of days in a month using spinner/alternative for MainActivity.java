package com.example.months;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private Spinner mspinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mspinner = findViewById(R.id.sp);
        mspinner.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.months,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mspinner.setAdapter(adapter);
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String n="";
        switch (i)
        {
            case 0:
                n="31";
                break;
            case 1:
                n="29 or 28";
                break;
            case 2:
                 n="31";
                break;
            case 3:
                n="30";
                break;
            case 4:
                n="31";
                break;
            case 5:
                n="30";
                break;
            case 6:
                n="31";
                break;
            case 7:
                n="31";
                break;
            case 8:
                n="30";
                break;
            case 9:
                n="31";
                break;
            case 10:
                n="30";
                break;
            case 11:
                n="31";
                break;
            default:
                n="INVALID OPTION";


        }
        Toast.makeText(this, "Number of days in "+ adapterView.getItemAtPosition(i)+" is "+ n ,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}

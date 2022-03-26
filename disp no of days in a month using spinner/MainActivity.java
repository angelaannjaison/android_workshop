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
        switch (i)
        {
            case 0:
                Toast.makeText(this, "Number of days in "+ adapterView.getItemAtPosition(i)+" is 31",Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(this, "Number of days in "+ adapterView.getItemAtPosition(i)+" is 28 or 29",Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "Number of days in "+ adapterView.getItemAtPosition(i)+" is 31",Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this, "Number of days in "+ adapterView.getItemAtPosition(i)+" is 30",Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(this, "Number of days in "+ adapterView.getItemAtPosition(i)+" is 31",Toast.LENGTH_SHORT).show();
                break;
            case 5:
                Toast.makeText(this, "Number of days in "+ adapterView.getItemAtPosition(i)+" is 30",Toast.LENGTH_SHORT).show();
                break;
            case 6:
                Toast.makeText(this, "Number of days in "+ adapterView.getItemAtPosition(i)+" is 31",Toast.LENGTH_SHORT).show();
                break;
            case 7:
                Toast.makeText(this, "Number of days in "+ adapterView.getItemAtPosition(i)+" is 31",Toast.LENGTH_SHORT).show();
                break;
            case 8:
                Toast.makeText(this, "Number of days in "+ adapterView.getItemAtPosition(i)+" is 30",Toast.LENGTH_SHORT).show();
                break;
            case 9:
                Toast.makeText(this, "Number of days in "+ adapterView.getItemAtPosition(i)+" is 31",Toast.LENGTH_SHORT).show();
                break;
            case 10:
                Toast.makeText(this, "Number of days in "+ adapterView.getItemAtPosition(i)+" is 30",Toast.LENGTH_SHORT).show();
                break;
            case 11:
                Toast.makeText(this, "Number of days in "+ adapterView.getItemAtPosition(i)+" is 31",Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this, "INVALID OPTION",Toast.LENGTH_SHORT).show();


        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}

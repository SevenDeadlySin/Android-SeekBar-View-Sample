package com.example.raksa.timetableapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    SeekBar seekBar;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        listView = (ListView) findViewById(R.id.listView);



        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                //Prepare Value for ListView
                int ProgressValue = progress + 1;
                ArrayList arrayList = new ArrayList();
                for (int i = 1;i <= 10;i++){

                    int value1 = ProgressValue;
                    int value2 = i;
                    int calculatedValue = value1 * value2;
                    String StringValue = value1 + " x " + value2+" = "+calculatedValue;

                    arrayList.add(StringValue);
                }

                //set Adapter For ListView
                ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(),
                                            android.R.layout.simple_list_item_1,arrayList);



                //set ListView Value When Changed completed
                listView.setAdapter(arrayAdapter);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

}

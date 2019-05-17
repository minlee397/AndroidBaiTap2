package com.example.baitap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GuideActivity extends AppCompatActivity {

    TextView txt_title, txt_describe, txt_ingredients, txt_timeprep, txt_timecook, txt_timetotal;
    String  Dish_name, Dish_describe, Dish_ingredients;
    int Time_prep, Time_cook, Time_total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        txt_title = (TextView)findViewById(R.id.txt_title);
        txt_describe = (TextView)findViewById(R.id.txt_describe);
        txt_ingredients = (TextView)findViewById(R.id.txt_ingredients);
        txt_timeprep = (TextView)findViewById(R.id.txt_timeprep);
        txt_timecook = (TextView)findViewById(R.id.txt_timecook);
        txt_timetotal = (TextView)findViewById(R.id.txt_timetotal);

        Intent intent = getIntent();
        Dish_name = intent.getExtras().getString("dish_name");
        Dish_describe = intent.getExtras().getString("dish_describe");
        Dish_ingredients = intent.getExtras().getString("dish_ingredients");
        Time_prep = Integer.parseInt(intent.getExtras().getString("dish_timeprep"));
        Time_cook = Integer.parseInt(intent.getExtras().getString("dish_timecook"));
        Time_total = Time_prep + Time_cook;

        txt_title.setText(Dish_name);
        txt_describe.setText(Dish_describe);
        txt_ingredients.setText(Dish_ingredients);
        txt_timeprep.setText(String.valueOf(Time_prep) + " MINS");
        txt_timecook.setText(String.valueOf(Time_cook) + " MINS");
        txt_timetotal.setText(String.valueOf(Time_total) + " MINS");
    }
}

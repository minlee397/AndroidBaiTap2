package com.example.baitap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {

    ImageView image_dish;
    int Imgage_large_dish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        image_dish = (ImageView)findViewById(R.id.image_dish);

        Intent intent = getIntent();
        Imgage_large_dish = Integer.parseInt(intent.getExtras().getString("dish_image_large"));

        image_dish.setImageResource(Imgage_large_dish);
    }
}

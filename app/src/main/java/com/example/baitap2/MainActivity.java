package com.example.baitap2;

import android.app.Activity;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.solver.widgets.ConstraintTableLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Dish> dishs = new ArrayList<>();
    ListView list_item_menu;
    ConstraintLayout left,right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dishs = InitializationData();
        list_item_menu = (ListView)findViewById(R.id.list_item_menu);
        CustomAdapter custom = new CustomAdapter();
        list_item_menu.setAdapter(custom);

        list_item_menu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String dish_name = ((TextView)view.findViewById(R.id.lbl_name)).getText().toString();
            }
        });
    }

    //region InitializationData
    private List<Dish> InitializationData(){
        RawDataDish data = new RawDataDish();
        List<Dish> ds = new ArrayList<>();
        for(int i=0; i<data.getDish_name().length; i++){
            Dish d = new Dish();
            d.setID((i + 1));
            d.setName(data.getDish_name()[i]);
            d.setImage(data.getDish_iamge()[i]);
            d.setImage(data.getDish_iamge()[i]);
            d.setImageLarge(data.getDish_iamge_large()[i]);
            d.setDescribe(data.getDish_describe()[i]);
            d.setIngredients(data.getDish_ingredients()[i]);
            d.setTimePrep(data.getDish_timeprep()[i]);
            d.setTimeCook(data.getDish_timecook()[i]);
            ds.add(d);
        }
        return ds;
    }
    //endregion

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return dishs.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            final int p;
            convertView = getLayoutInflater().inflate(R.layout.custom_list, null);
            TextView textview = (TextView)convertView.findViewById(R.id.lbl_name);
            ImageView imageview = (ImageView)convertView.findViewById(R.id.image_dish);
            ConstraintLayout left = (ConstraintLayout)convertView.findViewById(R.id.left);
            ConstraintLayout right = (ConstraintLayout)convertView.findViewById(R.id.right);

            textview.setText(dishs.get(position).getName());
            imageview.setImageResource(dishs.get(position).getImage());
            p = position;
            left.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this,GuideActivity.class);
                    i.putExtra("dish_name",dishs.get(p).getName());
                    i.putExtra("dish_describe",dishs.get(p).getDescribe());
                    i.putExtra("dish_ingredients",dishs.get(p).getIngredients());
                    i.putExtra("dish_timeprep",String.valueOf(dishs.get(p).getTimePrep()));
                    i.putExtra("dish_timecook",String.valueOf(dishs.get(p).getTimeCook()));
                    startActivity(i);
                }
            });
            right.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, ImageActivity.class);
                    i.putExtra("dish_image_large",String.valueOf(dishs.get(p).getImageLarge()));
                    startActivity(i);
                }
            });
            return convertView;
        }
    }
}


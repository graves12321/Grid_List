package com.cmajor7.listviewtuan10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {
    private ListView listView;
    String Product[] = {"Asus TUF", "Dell G3", "Acer Predator", "Lenovo Legion", "Macbook Air"};
    String Ship[] = {"Free ship", "Free Ship", "Free ship", "Free ship", "Free Ship"};
    String Price[] = {"$1000", "$900", "$2000", "$1200", "$1500"};
    String Rate[] = {};
    int Image[] = {R.drawable.asus, R.drawable.dell, R.drawable.acer, R.drawable.legion, R.drawable.mac};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView = findViewById(R.id.listView);
        ListAdapter adapter = new ListAdapter(this, Product, Ship, Price, Rate, Image);
        listView.setAdapter(adapter);
    }
}
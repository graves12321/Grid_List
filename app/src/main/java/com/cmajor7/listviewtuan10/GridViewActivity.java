package com.cmajor7.listviewtuan10;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.GridView;

public class GridViewActivity extends AppCompatActivity {
    private GridView gridView;
    String Product[] = {"Asus TUF", "Dell G3", "Acer Predator", "Lenovo Legion", "Macbook Air", "Dell XPS", "Thinkpad", "Dell Alienware"};
    int Image[] = {R.drawable.asus, R.drawable.dell, R.drawable.acer, R.drawable.legion, R.drawable.mac, R.drawable.xps, R.drawable.thinkpad, R.drawable.alien};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        gridView = findViewById(R.id.gridView);
        GridAdapter adapter = new GridAdapter(this, Product, Image);
        gridView.setAdapter(adapter);
    }
}
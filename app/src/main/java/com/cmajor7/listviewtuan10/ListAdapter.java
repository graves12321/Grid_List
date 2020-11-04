package com.cmajor7.listviewtuan10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListAdapter extends BaseAdapter {
    Context context;
    String rProduct[];
    String rShip[];
    String rPrice[];
    String Rate[];
    int rImage[];

    public ListAdapter(Context context, String[] rProduct, String[] rShip, String[] rPrice, String[] rate, int[] rImage) {
        this.context = context;
        this.rProduct = rProduct;
        this.rShip = rShip;
        this.rPrice = rPrice;
        this.Rate = rate;
        this.rImage = rImage;
    }

    @Override
    public int getCount() {
        return rProduct.length;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.rows, null);
        ImageView image = (ImageView) convertView.findViewById(R.id.image);
        TextView product = (TextView) convertView.findViewById(R.id.name);
        TextView ship = (TextView) convertView.findViewById(R.id.ship);
        TextView price = (TextView) convertView.findViewById(R.id.price);
        RatingBar Rate = (RatingBar) convertView.findViewById(R.id.rb);

        image.setImageResource(rImage[position]);
        product.setText(rProduct[position]);
        ship.setText(rShip[position]);
        price.setText(rPrice[position]);
        Rate.setIsIndicator(false);
        return convertView;
    }
}

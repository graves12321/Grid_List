package com.cmajor7.listviewtuan10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class GridAdapter extends BaseAdapter {
    Context context;
    String rProduct[];
    int rImage[];

    public GridAdapter(Context context, String[] rProduct, int[] rImage) {
        this.context = context;
        this.rProduct = rProduct;
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
        convertView = layoutInflater.inflate(R.layout.grid_rows, null);
        TextView Product = (TextView) convertView.findViewById(R.id.tv);
        ImageView Image = (ImageView) convertView.findViewById(R.id.img);

        Image.setImageResource(rImage[position]);
        Product.setText(rProduct[position]);
        return convertView;
    }
}
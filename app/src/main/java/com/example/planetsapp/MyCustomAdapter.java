package com.example.planetsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Planet> {
    //using custom layout:MyCustomAdapter.java
    //using custom object:extend ArrayAdapter<Planet>
    private ArrayList<Planet> planetArrayList;
    Context context;

    public MyCustomAdapter( ArrayList<Planet> planets, Context context) {
        super(context, R.layout.item_list_layout,planets);
        this.planetArrayList = planets;
        this.context = context;
    }
    // View Holder Class: used to cache references to the views within
    //                    an item layout, so that they don't need to be
    //                    repeatedly looked up during scrolling
    private static class MyViewHolder{
        TextView planetName;
        TextView moonCount;
        ImageView planetImg;
    }
    // getView(): used to create and return a view for a
    //            specific item in the list.
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // 1- Get the planet object for the current position
    Planet planet=getItem(position);

        // 2- Inflate Layout:
    MyViewHolder myViewHolder;
    final View result;
    if(convertView==null){
        myViewHolder =new MyViewHolder();
        LayoutInflater layoutInflater= LayoutInflater.from(getContext());
        convertView=layoutInflater.inflate(R.layout.item_list_layout,parent,false);
        myViewHolder.planetName=(TextView)convertView.findViewById(R.id.planetName);
        myViewHolder.moonCount=(TextView)convertView.findViewById(R.id.moonCount);
        myViewHolder.planetImg=(ImageView)convertView.findViewById(R.id.planetImg);
        result=convertView;
        convertView.setTag(myViewHolder);
    }else{
        myViewHolder=(MyViewHolder)convertView.getTag();
        result=convertView;
    }
    myViewHolder.planetName.setText(planet.getPlanetName());
    myViewHolder.moonCount.setText(planet.getMoonCount());
    myViewHolder.planetImg.setImageResource(planet.getImageName());
    return result;
    }
}

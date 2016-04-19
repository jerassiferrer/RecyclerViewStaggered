package com.mobileapps.jera.recyclerviewstagger;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by jera on 19/04/16.
 */
public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public ImageView image;
    public TextView   names;


    public MyViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        names = (TextView) itemView.findViewById(R.id.textview);
        image = (ImageView) itemView.findViewById(R.id.imagen);



    }

    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), "Clicked Position= " + getPosition(), Toast.LENGTH_SHORT).show();
    }
}

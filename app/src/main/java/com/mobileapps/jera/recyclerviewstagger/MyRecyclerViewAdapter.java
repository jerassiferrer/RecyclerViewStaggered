package com.mobileapps.jera.recyclerviewstagger;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/**
 * Created by jera on 19/04/16.
 */
public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private List<ItemObjects> itemList;

    private Context context;


    public MyRecyclerViewAdapter(Context context, List<ItemObjects> itemList ){
        this.itemList = itemList;
        this.context= context;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mylist,null);
        MyViewHolder  holder = new MyViewHolder(layoutView);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.image.setImageResource(itemList.get(position).getPhoto());
            holder.names.setText(itemList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}

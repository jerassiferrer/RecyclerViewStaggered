package com.mobileapps.jera.recyclerviewstagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private StaggeredGridLayoutManager staggeredManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView myrecyclerview = (RecyclerView)findViewById(R.id.recycler_view);
        myrecyclerview.setHasFixedSize(true);

        staggeredManager = new StaggeredGridLayoutManager(3,1);
        myrecyclerview.setLayoutManager(staggeredManager);

        List<ItemObjects> list =getListItemData();

        MyRecyclerViewAdapter adapter =new MyRecyclerViewAdapter(MainActivity.this,list);
        myrecyclerview.setAdapter(adapter);


    }

        private List<ItemObjects> getListItemData() {

            List<ItemObjects> listviewitems = new ArrayList<ItemObjects>();
            listviewitems.add(new ItemObjects("poke title", R.drawable.title));
            listviewitems.add(new ItemObjects("pokeball", R.drawable.pokeball));
            listviewitems.add(new ItemObjects("pokeball", R.drawable.pokeball));
            listviewitems.add(new ItemObjects("pokeball", R.drawable.pokeball));
            listviewitems.add(new ItemObjects("greatball", R.drawable.greatball));
            listviewitems.add(new ItemObjects("ultraball", R.drawable.ultraball));
            listviewitems.add(new ItemObjects("masterball", R.drawable.masterball));
            listviewitems.add(new ItemObjects("masterball", R.drawable.masterball));
            listviewitems.add(new ItemObjects("masterball", R.drawable.masterball));
            listviewitems.add(new ItemObjects("pokeball", R.drawable.pokeball));
            listviewitems.add(new ItemObjects("pokeball", R.drawable.pokeball));
            listviewitems.add(new ItemObjects("pokeball", R.drawable.pokeball));
            listviewitems.add(new ItemObjects("poke title", R.drawable.title));


            return listviewitems;


        }






}

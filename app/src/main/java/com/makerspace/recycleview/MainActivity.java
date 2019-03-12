package com.makerspace.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<Item> mList = new ArrayList<>();

        //TODO add volley reqeust for organization list


        mList.add(new Item(R.drawable.ani,"Animals health",R.drawable.eco,"Earned 300$"));
        mList.add(new Item(R.drawable.kids,"Kids health",R.drawable.ani,"Earned 300$"));
        mList.add(new Item(R.drawable.eco,"Ecology health",R.drawable.ani,"Earned 300$"));
        mList.add(new Item(R.drawable.old,"Age health",R.drawable.eco,"Earned 300$"));
        Adapter adapter = new Adapter(this, mList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

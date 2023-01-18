package com.example.pract;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerViewClick{

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    List<Model> userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
      initData();
      initRecylerView();

    }

    private void initData() {
        userList=new ArrayList<>();

        userList.add(new Model(R.drawable.ic_coin,"Coin","10:20 PM","Hi coin","__________________________"));
        userList.add(new Model(R.drawable.ic_facebook,"Facebook","10:20 PM","Hi fb","__________________________"));
        userList.add(new Model(R.drawable.ic_instagram,"Instagram","11:20 PM","Hi instagram","__________________________"));
        userList.add(new Model(R.drawable.ic_messages,"Messages","12:20 PM","Hi messages","__________________________"));
        userList.add(new Model(R.drawable.ic_tick_icon,"Tick","1:20 PM","Hi tick","__________________________"));
        userList.add(new Model(R.drawable.ic_twitter,"Twitter","2:20 PM","Hi twitter","__________________________"));
        userList.add(new Model(R.drawable.ic_youtube,"Youtube","3:20 PM","Hi youtube","__________________________"));
        userList.add(new Model(R.drawable.ic_home,"Home","4:20 PM","Hi home","__________________________"));
        userList.add(new Model(R.drawable.ic_star,"Star","5:20 PM","Hi star","__________________________"));
    }

    private void initRecylerView() {
        recyclerView=findViewById(R.id.recycler);
        linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter=new Adapter(userList,this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(Model userList) {
        Intent intent=new Intent(this,Temp.class);
        intent.putExtra("main",userList.getText1());
        intent.putExtra("name",userList.getText3());
        intent.putExtra("image1",userList.getImage1());
        startActivity(intent);
    }
}
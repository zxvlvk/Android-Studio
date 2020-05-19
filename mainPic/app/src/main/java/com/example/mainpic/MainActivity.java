package com.example.mainpic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);



        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);



        PersonAdapter adapter = new PersonAdapter();



        adapter.addItem(new Person("가슴  ", "푸쉬업",R.drawable.background1));
        adapter.addItem(new Person("다리  ", "스쿼트",R.drawable.background2));
        adapter.addItem(new Person("복근  ", "크런치",R.drawable.background3));
        adapter.addItem(new Person("다리  ", "런지",R.drawable.background4));
        adapter.addItem(new Person("어깨  ", "파이크푸쉬업",R.drawable.background5));
        adapter.addItem(new Person("등  ", "슈퍼맨",R.drawable.background6));





        recyclerView.setAdapter(adapter);
    }
}

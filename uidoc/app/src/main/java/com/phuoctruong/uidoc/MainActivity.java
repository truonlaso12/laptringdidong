package com.phuoctruong.uidoc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.os.Bundle;

import java.util.ArrayList;

import jp.wasabeef.recyclerview.animators.SlideInUpAnimator;

public class MainActivity extends AppCompatActivity {
    private ArrayList<story> arrayList;
    public RecyclerView recyclerView;
    private storyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);
        arrayList = new ArrayList<>();
        createlist();
        adapter = new storyAdapter(this,arrayList);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        layoutManager.scrollToPosition(0);
        recyclerView.setLayoutManager(layoutManager);

        //animator
       recyclerView.setItemAnimator(new SlideInUpAnimator());
        //decorationg recyclerview
        DividerItemDecoration dividerHorizontal = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.setHasFixedSize(true);

    }

    private void createlist() {
        arrayList.add(new story("Yêu Thương Và Friendzone",R.drawable.truyen2));
        arrayList.add(new story("Nếu Như Yêu",R.drawable.tr3));
        arrayList.add(new story("Buông Tay Ra Là Ăn Đấm Đấy",R.drawable.tr4));
        arrayList.add(new story("Phượng Hoàng",R.drawable.tr5));
        arrayList.add(new story("Con Rồng Cháu Tiên",R.drawable.tr6));
        arrayList.add(new story("SaberTooth Là Nơi Tôi Thuộc Về",R.drawable.truyen1));
    }


}
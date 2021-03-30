package com.example.maskerorganik;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvClub;
    private ArrayList<MaskerOrganik> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvClub = findViewById(R.id.rv_masker);
        rvClub.setHasFixedSize(true);

        list.addAll(MaskerData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvClub.setLayoutManager(new LinearLayoutManager(this));
        ListMaskerAdapter listClubAdapter = new ListMaskerAdapter(list);
        rvClub.setAdapter(listClubAdapter);

        listClubAdapter.setOnItemClickCallback(new ListMaskerAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(MaskerOrganik club) {
                Intent moveIntent = new Intent(com.example.maskerorganik.MainActivity.this, DetailMaskerMainActivity.class);
                moveIntent.putExtra(DetailMaskerMainActivity.ITEM_EXTRA, club);
                startActivity(moveIntent);
            }
        });
    }

}
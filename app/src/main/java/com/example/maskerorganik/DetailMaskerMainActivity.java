package com.example.maskerorganik;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailMaskerMainActivity extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_masker_main);

        ImageView imgClub = findViewById(R.id.imgmasker);
        TextView tvClubName = findViewById(R.id.tvmaskerName);
        TextView tvClubDetail = findViewById(R.id.tvmaskerDetail);

        MaskerOrganik club = getIntent().getParcelableExtra(ITEM_EXTRA);
        if(club != null){
            Glide.with(this)
                    .load(club.getPhoto())
                    .into(imgClub);
            tvClubName.setText(club.getName());
            tvClubDetail.setText(club.getDetail());
        }
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail Masker");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    } }
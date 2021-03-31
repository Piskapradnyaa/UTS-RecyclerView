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

        ImageView imgMsk = findViewById(R.id.imgMsk);
        TextView tvMskName= findViewById(R.id.tv_namaMsk);
        TextView tvMskDetail= findViewById(R.id.tvDetailMsk);

        MaskerOrganik masker = getIntent().getParcelableExtra(ITEM_EXTRA);
        if(masker != null){
            Glide.with(this)
                    .load(masker.getPhoto())
                    .into(imgMsk);
            tvMskName.setText(masker.getName());
            tvMskDetail.setText(masker.getDetail());
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

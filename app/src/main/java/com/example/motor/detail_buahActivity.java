package com.example.motor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class detail_buahActivity extends AppCompatActivity {

    TextView nama,asal,desc,vit;
    ImageView gambarbuah;

    private ArrayList<buah> buahArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_buah);

        buahArrayList.addAll(dataBuah.getListData());
        nama = findViewById(R.id.detail_nm_buah);
        asal = findViewById(R.id.negara);
        vit = findViewById(R.id.vitamin);
        desc = findViewById(R.id.desc_buah);
        gambarbuah = findViewById(R.id.detail_gmb);

        Intent intent = getIntent();
        int position = intent.getIntExtra("detail",0);

        final buah buah = buahArrayList.get(position);
        this.setTitle(buah.getNama());
        gambarbuah.setImageResource(buah.getGambar());
        nama.setText(buah.getNama());
        asal.setText(buah.getAsal());
        vit.setText(buah.getVitamin());
        desc.setText(buah.getDesc());

    }
}

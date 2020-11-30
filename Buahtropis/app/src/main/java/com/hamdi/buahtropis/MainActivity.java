package com.hamdi.buahtropis;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    ImageButton Hijau,Kuning;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
       Hijau = findViewById(R.id.btn_buka_buah_hijau);
        Kuning = findViewById(R.id.btn_buka_buah_kuning);
        Hijau.setOnClickListener(view -> bukaGaleri("Hijau"));
        Kuning.setOnClickListener(view -> bukaGaleri("Kuning"));
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity hijau");
        Intent intent = new Intent(this, com.hamdi.buahtropis.GaleriActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

}
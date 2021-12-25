package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import com.example.myapplication.model.System;

public class OperatingSystemActivity extends AppCompatActivity {
    List<System> systems;
    int indeksTampil = 0;
    Button btnPertama,btnTerakhir,btnSebelumnya,btnBerikutnya;
    TextView txJenis,txVersion,txDeskripsi,txLogo,txDeveloper,txWebsite,txModel,txJudul;
    ImageView ivFotoSystem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_system);
        systems = DataProvider.getAllsystems(this);
        inisialisasiView();
        tampilkanProfil();
    }

    private void inisialisasiView() {
        btnPertama = findViewById(R.id.btnPertama);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);
        btnBerikutnya = findViewById(R.id.btnBerikutnya);
        btnTerakhir = findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> systemPertama());
        btnTerakhir.setOnClickListener(view -> systemTerakhir());
        btnSebelumnya.setOnClickListener(view -> systemSebelumnya());
        btnBerikutnya.setOnClickListener(view -> systemBerikutnya());

        txJenis = findViewById(R.id.txJenis);
        txVersion = findViewById(R.id.txversion);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        txLogo = findViewById(R.id.txLogo);
        txDeveloper = findViewById(R.id.txDeveloper);
        txWebsite = findViewById(R.id.txWebsite);
        txModel = findViewById(R.id.txModel);
        ivFotoSystem = findViewById(R.id.gambarSystem);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Operating System");
    }


    private void tampilkanProfil() {
        System k = systems.get(indeksTampil);
        Log.d("System","Menampilkan system "+k.getJenis());
        txJenis.setText(k.getJenis());
        txVersion.setText(k.getVersion());
        txDeskripsi.setText(k.getDeskripsi());
        txLogo.setText(k.getLogo());
        txDeveloper.setText(k.getDeveloper());
        txWebsite.setText(k.getWebsite());
        txModel.setText(k.getModel());
        ivFotoSystem.setImageDrawable(this.getDrawable(k.getDrawableRes()));
    }

    private void systemPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this,"Sudah di posisi system pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfil();
        }
    }

    private void systemTerakhir() {
        int posAkhir = systems.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this,"Sudah di posisi system terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfil();
        }
    }

    private void systemBerikutnya() {
        if (indeksTampil == systems.size() - 1) {
            Toast.makeText(this,"Sudah di posisi system terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfil();
        }
    }

    private void systemSebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this,"Sudah di posisi system pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfil();
        }
    }
}


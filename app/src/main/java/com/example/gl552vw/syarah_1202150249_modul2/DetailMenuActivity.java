package com.example.gl552vw.syarah_1202150249_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailMenuActivity extends AppCompatActivity {
    TextView TextMakanan, TextHarga, TextKomposisi;
    ImageView ImgFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        Intent intent = getIntent();
        String makanan = intent.getStringExtra("makanan");
        Integer harga = intent.getIntExtra("harga",0);
        Integer gambar = intent.getIntExtra("gambar",0);
        String komposisi = intent.getStringExtra("komposisi");

        Log.d("getIntExtra", ""+harga+gambar);

        TextMakanan = (TextView)findViewById(R.id.DetailMkn);
        TextHarga = (TextView)findViewById(R.id.DetailHrg);
        ImgFoto = (ImageView)findViewById(R.id.DetailGbr);
        TextKomposisi = (TextView)findViewById(R.id.komposisi);
        TextMakanan.setText(makanan);
        TextHarga.setText("Rp. "+harga);
        ImgFoto.setImageResource(gambar);
        TextKomposisi.setText(komposisi);
    }
}

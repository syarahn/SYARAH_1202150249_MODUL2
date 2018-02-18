package com.example.gl552vw.syarah_1202150249_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu1Activity extends AppCompatActivity {
    //variable LinkedList
    private final LinkedList<String> makanan = new LinkedList<>();
    private final LinkedList<Integer> harga = new LinkedList<>();
    private final LinkedList<Integer> gambar = new LinkedList<>();
    private final LinkedList<String> komposisi = new LinkedList<>();

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new MenuAdapter(this, makanan, harga, gambar, komposisi);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        //mengisi LinkedList
        makanan.add("Nasi Timbel");
        makanan.add("Nasi Liwet");
        makanan.add("Maranggi");
        makanan.add("Soto Bandung");
        makanan.add("Bakakak Hayam");

        harga.add(25000);
        harga.add(25000);
        harga.add(40000);
        harga.add(28000);
        harga.add(50000);

        gambar.add(R.drawable.nasi_timbel);
        gambar.add(R.drawable.nasi_liwet);
        gambar.add(R.drawable.sate_maranggi);
        gambar.add(R.drawable.soto_bandung);
        gambar.add(R.drawable.bakakak);

        komposisi.add("Nasi timbel yang pulen dengan ikan asin, pepes ikan, empal, ayam goreng, tawes, dan japuh. Tidak lupa juga terdapat lalapan serta sambal");
        komposisi.add("Rasa gurih yang dimiliki oleh nasi liwet diperoleh dari hasil penggunaan bumbu-bumbu rempah khas Indonesia seperti batang serai, cabai rawit, bawang merah, bawang putih, jambal roti, daun kemangi, dan daun salam. Disantap bersama ikan asin, sayur asem, ikan bagar, gorengan tahu tempe.");
        komposisi.add("Sate maranggi dibuat dengan proses merendam daging ke dalam bumbu sebelum ditusuk dan dibakar. Sehingga meskipun tanpa saus, cita rasa sate sudah berasa di lidah karena paduan bumbu rendamannya.");
        komposisi.add("Soto bandung menggunakan bahan utama tetelan daging sapi dengan tambahan bahan pelengkap irisan lobak yang sudah direbus, daun seledri, daun bawang, kacang kedelai goreng, dan bawang goreng.");
        komposisi.add("Ayam yang diberikan bumbu khusus bercita rasa Sunda yang kemudian diolah dengan cara dipanggang. Dilengkapi Sambal dan lalapan");

    }
}

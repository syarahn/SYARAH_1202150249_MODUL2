package com.example.gl552vw.syarah_1202150249_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * Created by GL552VW on 2/18/2018.
 */

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    //menampung data di adapter
    private final LinkedList<String> ListMakanan;
    private final LinkedList<Integer> ListHarga;
    private final LinkedList<Integer> ListGambar;
    private final LinkedList<String> ListKomposisi;
    private LayoutInflater mInflater;

    public MenuAdapter(Context context, LinkedList<String> listMakanan, LinkedList<Integer> listHarga, LinkedList<Integer> listGambar, LinkedList<String> listKomposisi) {
        this.ListMakanan = listMakanan;
        this.ListHarga = listHarga;
        this.ListGambar = listGambar;
        this.ListKomposisi = listKomposisi;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public MenuAdapter.MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.activity_daftar, parent, false);
        return new MenuViewHolder(mItemView, this);
    }
    //connects data to the ViewHolder
    @Override
    public void onBindViewHolder(MenuAdapter.MenuViewHolder holder, int position) {
        String mCurrentMkn = ListMakanan.get(position);
        Integer mCurrentHrg = ListHarga.get(position);
        Integer mCurrentGbr = ListGambar.get(position);
        String mCurrentKomp = ListKomposisi.get(position);
        holder.MknItemView.setText(mCurrentMkn);
        holder.HrgItemView.setText("Rp." + mCurrentHrg.toString());
        holder.GbrItemView.setImageResource(mCurrentGbr);
        //holder.KompItemView.setText(mCurrentKomp);

    }
    //return size of ListMakanan
    @Override
    public int getItemCount() {
        return ListMakanan.size();
    }
    //ViewHolder Class
    class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public final TextView MknItemView;
        public final TextView HrgItemView;
        public final ImageView GbrItemView;
        //public final TextView KompItemView;

        final MenuAdapter mAdapter;

        //constructor yang menginisialisasi dari XML
        public MenuViewHolder(final View itemView, MenuAdapter adapter) {
            super(itemView);
            MknItemView = (TextView) itemView.findViewById(R.id.TextMakanan);
            HrgItemView = (TextView) itemView.findViewById(R.id.TextHarga);
            //KompItemView = (TextView) itemView.findViewById(R.id.TextKomposisi);
            GbrItemView = (ImageView) itemView.findViewById(R.id.gambar);
            GbrItemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Get the position of the item that was clicked.
                    int mPosition = getLayoutPosition();
                    // Use that to access the affected item in List.
                    String makanan = ListMakanan.get(mPosition);
                    Integer harga = ListHarga.get(mPosition);
                    Integer gambar = ListGambar.get(mPosition);
                    String komposisi = ListKomposisi.get(mPosition);
                    Intent intent = new Intent(itemView.getContext(),DetailMenuActivity.class);
                    intent.putExtra("makanan",makanan);
                    intent.putExtra("harga",harga);
                    intent.putExtra("gambar",gambar);
                    intent.putExtra("komposisi", komposisi);
                    itemView.getContext().startActivity(intent);
                }
            });
            this.mAdapter = adapter;
        }

        @Override
        public void onClick(View v) {

        }

    }
}

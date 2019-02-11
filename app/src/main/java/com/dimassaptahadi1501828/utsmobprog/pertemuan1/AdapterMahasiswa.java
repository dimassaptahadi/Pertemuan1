package com.dimassaptahadi1501828.utsmobprog.pertemuan1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class AdapterMahasiswa extends RecyclerView.Adapter<ViewHolderMahasiswa> {

    ArrayList<Mahasiswa> alMahasiswa;

    public AdapterMahasiswa(ArrayList<Mahasiswa> alMahasiswa) {
        this.alMahasiswa = alMahasiswa;
    }

    @NonNull
    @Override
    public ViewHolderMahasiswa onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.profil_row,parent,     false);
        return new ViewHolderMahasiswa(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderMahasiswa holder, int position) {
        Mahasiswa m = alMahasiswa.get(position);
        holder.tvNama.setText(m.getNama());
        holder.tvNim.setText(m.getNim());


    }

    @Override
    public int getItemCount() {
        return alMahasiswa.size();
    }
}

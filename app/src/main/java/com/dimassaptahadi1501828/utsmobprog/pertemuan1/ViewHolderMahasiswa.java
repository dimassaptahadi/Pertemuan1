package com.dimassaptahadi1501828.utsmobprog.pertemuan1;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ViewHolderMahasiswa extends RecyclerView.ViewHolder {
    TextView tvNim, tvNama;
    public ViewHolderMahasiswa( View itemView) {
        super(itemView);
        tvNim = (TextView) itemView.findViewById(R.id.tvNim);
        tvNama = (TextView) itemView.findViewById(R.id.tvNama);
    }
}

package com.dimassaptahadi1501828.utsmobprog.pertemuan1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Mahasiswa> alMahasiswa;
    RecyclerView rvProfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        alMahasiswa = new ArrayList<>();
        alMahasiswa.add(new Mahasiswa("1501828","Dimas"));
        alMahasiswa.add(new Mahasiswa("1501010","Rahman"));


        rvProfil = (RecyclerView) findViewById(R.id.rvProfil);
        rvProfil.setHasFixedSize(true); // karena tinggi baris tidak berubah ubah


        //Adapter
        AdapterMahasiswa adapter = new AdapterMahasiswa(alMahasiswa);
        rvProfil.setAdapter(adapter);


        //layoutmanager
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rvProfil.setLayoutManager(lm);

    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    //agar tiap menu bisa di klik
    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        switch (item.getItemId()){
             case R.id.mKelas:
                Toast.makeText(getApplicationContext(), "Kelas", Toast.LENGTH_LONG).show();
            return true;
            case R.id.mProfil:
                Toast.makeText(getApplicationContext(), "Profil", Toast.LENGTH_LONG).show();
            return true;
        default:
            return super.onOptionsItemSelected(item);
        }
    }
}

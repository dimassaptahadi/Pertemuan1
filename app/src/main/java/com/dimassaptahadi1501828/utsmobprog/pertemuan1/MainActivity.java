package com.dimassaptahadi1501828.utsmobprog.pertemuan1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
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

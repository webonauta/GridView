package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private ArrayList<Digimon> digimon;
    private GridView gridView;
    private DigimonAdapter adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usarToolbar();

        gridView = (GridView) findViewById(R.id.grid);
        adaptador = new DigimonAdapter(this);
        gridView.setAdapter(adaptador);
        gridView.setOnItemClickListener(this);
    }

    private void usarToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Digimon item = (Digimon) parent.getItemAtPosition(position);
        Intent intent = new Intent(this, DetalleActivity.class);
        intent.putExtra(DetalleActivity.EXTRA_PARAM_ID, item.getId());
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(this, new Pair<View, String>(view.findViewById(R.id.imagen_digimon), DetalleActivity.VIEW_NAME_HEADER_IMAGE));
            ActivityCompat.startActivity(this, intent, activityOptions.toBundle());
        }else {
            startActivity(intent);
        }
    }
}

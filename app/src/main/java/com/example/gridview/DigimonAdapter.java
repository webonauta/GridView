package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DigimonAdapter extends BaseAdapter {
    private Context contenxt;

    public DigimonAdapter(Context context){
        this.contenxt = context;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) contenxt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.grid_item, viewGroup, false);
        }

        ImageView imagenDigimon = (ImageView) view.findViewById(R.id.imagen_digimon);
        TextView nombreDigimon = (TextView) view.findViewById(R.id.nombre_digimon);

        final Digimon item = (Digimon) getItem(position);
        Glide.with(imagenDigimon.getContext()).load(item.getIdDrawable()).into(imagenDigimon);
        nombreDigimon.setText(item.getNombre());
        return view;
    }
}

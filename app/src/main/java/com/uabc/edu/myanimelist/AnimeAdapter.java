package com.uabc.edu.myanimelist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.AnimeHolder> {

    private List<Anime> items;

    public class AnimeHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de un item
        public ImageView imagen;
        public TextView nombre;
        public TextView visitas;

        public AnimeHolder(@NonNull View v) {
            super(v);
            imagen=v.findViewById(R.id.imagen);
            nombre=v.findViewById(R.id.nombre);
            visitas=v.findViewById(R.id.visitas);

        }
    }

    public AnimeAdapter(List<Anime> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public AnimeHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                          int viewType) {

       View v = LayoutInflater.from(parent.getContext()).
               inflate(R.layout.my_renglon,parent,false);
        return new AnimeHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimeHolder holder,
                                 int position) {
        holder.imagen.setImageResource(items.get(position).getImagen());
        holder.nombre.setText(items.get(position).getNombre());
        holder.visitas.setText("Visitas: "+
                String.valueOf(items.get(position).getVisitas()));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}

package com.example.pruebacardview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adaptadorLista extends RecyclerView.Adapter<adaptadorLista.ViewHolder> {
    private List<listview> nData;
    private LayoutInflater nInflater;
    private Context context;

    public adaptadorLista (List<listview> itemList,Context context){
        this.nInflater = LayoutInflater.from(context);
        this.context = context;
        this.nData = itemList;
    }
@Override
    public int getItemCount () {
        return nData.size();
}
@Override
    public adaptadorLista.ViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
       View view = nInflater.inflate(R.layout.cardview, null);
       return new adaptadorLista.ViewHolder(view);
}

    @Override
    public void onBindViewHolder(final adaptadorLista.ViewHolder holder, final int position){
        holder.binData(nData.get(position));
    }

    public void setItems(List<listview> items){
        nData=items;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
         ImageView imagenPerfil;
         TextView textoPublicacion;
         ViewHolder(View itemView) {
            super(itemView);
             imagenPerfil = itemView.findViewById(R.id.FotoPerfil);
            textoPublicacion = itemView.findViewById(R.id.TextoPublicacion);
        }

        void binData (final listview item){
            //imagenPerfil.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            textoPublicacion.setText(item.getTextoPublicacion());
        }
    }
}

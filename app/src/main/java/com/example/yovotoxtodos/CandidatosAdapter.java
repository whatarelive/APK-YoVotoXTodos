package com.example.yovotoxtodos;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yovotoxtodos.models.Candidato;

import java.util.ArrayList;
import java.util.List;

public class CandidatosAdapter extends RecyclerView.Adapter<CandidatosAdapter.ViewHolder> {

    private final ArrayList<Candidato> candidatoList;
    private final Context context;

    public CandidatosAdapter(ArrayList<Candidato> candidatoList, Context context) {
        this.candidatoList = candidatoList;
        this.context = context;
    }

    @NonNull
    @Override
    public CandidatosAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_candidate, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CandidatosAdapter.ViewHolder holder, int position) {
        Candidato candidato = candidatoList.get(position);
        Log.i("TAG", "onBindViewHolder: " + position + " = " + candidato);
        //holder.imageView.setImageDrawable(candidato.getImage(context));
        holder.textView.setText(candidato.getName());
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DiputadoBioActivity.class);
            intent.putExtra("diputado", candidato);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return candidatoList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imageView;
        private final TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.name);
            itemView.setOnClickListener(v -> {

            });
        }
    }
}

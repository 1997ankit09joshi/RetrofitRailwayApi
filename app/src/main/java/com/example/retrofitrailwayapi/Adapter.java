package com.example.retrofitrailwayapi;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ProgramAdapter> {
    private ArrayList<RouteModel.Route_> list;
Context content;
    public Adapter(ArrayList<RouteModel.Route_> list,Context content) {
        this.list = list;
        this.content=content;
    }

    @NonNull
    @Override
    public ProgramAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.adapter, viewGroup, false);
        return new ProgramAdapter(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ProgramAdapter programAdapter, int i) {
        RouteModel.Route_ d = list.get(i);

        programAdapter.textView.setText(list.get(i).getStation().getName().toString());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ProgramAdapter extends RecyclerView.ViewHolder {
        TextView textView;
        public ProgramAdapter(@NonNull View itemView) {
            super(itemView);
           textView=itemView.findViewById(R.id.route1);
        }
    }
}

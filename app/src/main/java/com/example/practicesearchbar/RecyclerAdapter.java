package com.example.practicesearchbar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.TextViewHolder> {

    List<String> Names;

    public RecyclerAdapter(List<String> list) {
        this.Names=list;
    }

    @NonNull
    @Override
    public TextViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TextView textView= (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        TextViewHolder textViewHolder=new TextViewHolder(textView);
        return textViewHolder;
    }

    @Override
    public void onBindViewHolder(TextViewHolder holder, int position) {
holder.Versions.setText(Names.get(position));

    }

    @Override
    public int getItemCount() {
        return Names.size();
    }
    public class TextViewHolder extends RecyclerView.ViewHolder {

        TextView Versions;
        public TextViewHolder(@NonNull View itemView) {
            super(itemView);
            Versions= (TextView) itemView;
        }
    }
    public void updateList(List<String> newList){
        Names=new ArrayList<>();
        Names.addAll(newList);
        notifyDataSetChanged();
    }
}

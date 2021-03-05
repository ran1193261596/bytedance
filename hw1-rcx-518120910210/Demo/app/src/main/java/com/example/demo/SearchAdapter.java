package com.example.demo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SearchAdapter extends RecyclerView.Adapter<TextViewHolder> {

    @NonNull
    private List<String> mItems = new ArrayList<>();

    @NonNull
    @Override
    public TextViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TextViewHolder textViewHolder = new TextViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_text, parent, false));
        return textViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TextViewHolder holder, int position) {
        holder.bind(mItems.get(position));
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public void notifyItems(@NonNull List<String> items) {
        mItems.clear();
        mItems.addAll(items);
        notifyDataSetChanged();
    }
}

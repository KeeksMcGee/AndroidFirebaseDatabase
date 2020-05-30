package com.kiarra.androidfirebasedatabase;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public class MyRecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView txt_title, txt_comment;

    ItemClickListener itemClickListener;

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public MyRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        txt_comment = itemView.findViewById(R.id.txt_content);
        txt_title = itemView.findViewById(R.id.txt_title);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v, getAdapterPosition());
    }
}

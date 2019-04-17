package com.example.android.selfstudy;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class SubjectAdapter extends RecyclerView.Adapter <SubjectAdapter.SubjectViewHolder> {

    private String[] data;
    private int[] imageArray;

    SubjectAdapter(String[] data, int[] imageArray) {
        this.data = data;
        this.imageArray = imageArray;
    }

    @Override
    public SubjectViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row_subjects, parent, false);
        return new SubjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SubjectViewHolder holder, int position) {
        String title = data[position];
        holder.textTitle.setText(title);
        int imgRes = imageArray[position];
        holder.imgIcon.setImageResource(imgRes);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class SubjectViewHolder extends RecyclerView.ViewHolder {
        ImageView imgIcon;
        TextView textTitle, textTitle2;

        public SubjectViewHolder(View itemView) {
            super(itemView);
            imgIcon = (ImageView) itemView.findViewById(R.id.imgIcon);
            textTitle = (TextView) itemView.findViewById(R.id.textTitle);
            textTitle2 = (TextView) itemView.findViewById(R.id.textTitle2);
        }
    }
}

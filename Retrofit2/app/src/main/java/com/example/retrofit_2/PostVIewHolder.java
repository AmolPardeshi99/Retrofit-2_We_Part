package com.example.retrofit_2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PostVIewHolder extends RecyclerView.ViewHolder {

    private TextView mTvName;
    private TextView mTvEmail;
    private TextView mTvBody;
    public PostVIewHolder(@NonNull  View itemView) {
        super(itemView);
        initVIews(itemView);

    }

    private void initVIews(View itemView) {
        mTvBody = itemView.findViewById(R.id.tvBody);
        mTvEmail = itemView.findViewById(R.id.tvEmail);
        mTvName = itemView.findViewById(R.id.tvName);

    }

    public void setData(ResponseModel responseModel){
        mTvName.setText(responseModel.getName());
        mTvEmail.setText(responseModel.getEmail());
        mTvBody.setText(responseModel.getBody());
    }

}

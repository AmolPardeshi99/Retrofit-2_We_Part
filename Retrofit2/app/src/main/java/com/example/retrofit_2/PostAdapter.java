package com.example.retrofit_2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostVIewHolder> {

    private List<ResponseModel> postmodelList;

    public PostAdapter(List<ResponseModel> postmodelList) {
        this.postmodelList = postmodelList;
    }

    @NonNull
    @Override
    public PostVIewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new PostVIewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  PostVIewHolder holder, int position) {
        ResponseModel responseModel = postmodelList.get(position);
        holder.setData(responseModel);

    }

    @Override
    public int getItemCount() {
        return postmodelList.size();
    }
}

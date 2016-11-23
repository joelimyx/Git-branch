package com.colinbradley.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Joe on 11/23/16.
 */

public class ActorAdapter extends RecyclerView.Adapter<ActorAdapter.ActorViewHolder>{
    private List<Actor> mActors;

    public ActorAdapter(List<Actor> actors) {
        mActors = actors;
    }

    @Override
    public ActorViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ActorViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mActors.size();
    }

    class ActorViewHolder extends RecyclerView.ViewHolder{
        public ActorViewHolder(View itemView) {
            super(itemView);
        }
    }
}

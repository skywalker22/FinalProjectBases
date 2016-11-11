package com.jacksonmix.android.aca.afinal;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mixja on 11/11/16.
 */
public class PlayerAdapter extends RecyclerView.Adapter<PlayerViewHolder> {

    private List<Player> mPlayerList;
    private LayoutInflater mInflater;
    private Context mContext;

    public PlayerAdapter(Context context) {
        mContext = context;
        mInflater = LayoutInflater.from(context);
        mPlayerList = new ArrayList<>();
    } // end of constructor

    @Override
    public PlayerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.row_player, parent, false);
        PlayerViewHolder viewHolder = new PlayerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PlayerViewHolder holder, int position)
    {
        Player player = mPlayerList.get(position);

        // This is how we use Picasso to load images from the internet.
        Picasso.with(mContext)
                .load(player.getPhotoUrl())
                .placeholder(R.color.colorAccent)
                .into(holder.mImageView);

        holder.mTextView.setText(player.getLastName());
    }

    @Override
    public int getItemCount(){
        return (mPlayerList == null) ? 10 : mPlayerList.size();
    }

    // getMovieList

    public void setPlayerList(List<Player> playerList){
        this.mPlayerList.clear();
        this.mPlayerList.addAll(playerList);
        // The adapter needs to know that the data has changed.
        // If we don't call this, app will crash.
        notifyDataSetChanged();
    }
        /*
    public List<Movie> getMovieList() {
        return mMovieList;
    }
        */

}



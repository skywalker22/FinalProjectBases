package com.jacksonmix.android.aca.afinal;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mixja on 11/11/16.
 */
public class PlayerViewHolder extends RecyclerView.ViewHolder{

    public ImageView mImageView;
    public TextView mTextView;

    public PlayerViewHolder(View itemView){
        super(itemView);
        mImageView = (ImageView) itemView.findViewById(R.id.playerImage);
        mTextView = (TextView) itemView.findViewById(R.id.playerName);
    }

}

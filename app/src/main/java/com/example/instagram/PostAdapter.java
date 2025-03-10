package com.example.instagram;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {

    private List<Post> posts;

    public PostAdapter(List<Post> posts) {
        this.posts = posts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Post post = posts.get(position);
        holder.captionTextView.setText(post.getCaption());
        holder.locationTextView.setText(post.getLocation());
        // Load image using a library like Glide or Picasso
        // Glide.with(holder.itemView.getContext()).load(post.getImageUrl()).into(holder.postImageView);

        if (post.getScheduledTime() > System.currentTimeMillis()) {
            holder.scheduledIndicator.setVisibility(View.VISIBLE);
        } else {
            holder.scheduledIndicator.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView postImageView;
        public TextView captionTextView;
        public TextView locationTextView;
        public View scheduledIndicator; // New UI element to indicate scheduled posts

        public ViewHolder(View itemView) {
            super(itemView);
            postImageView = itemView.findViewById(R.id.postImageView);
            captionTextView = itemView.findViewById(R.id.captionTextView);
            locationTextView = itemView.findViewById(R.id.locationTextView);
            scheduledIndicator = itemView.findViewById(R.id.scheduledIndicator); // Initialize the new UI element
        }
    }
}

package com.example.instagram;

import android.widget.ImageView;
import com.bumptech.glide.Glide;
import android.content.Context;

public class Utils {

    public static void loadImage(Context context, String url, ImageView imageView) {
        Glide.with(context)
                .load(url)
                .into(imageView);
    }
}

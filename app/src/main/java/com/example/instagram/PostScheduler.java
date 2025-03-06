package com.example.instagram;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class PostScheduler {
    private List<Post> scheduledPosts;
    private Timer timer;

    public PostScheduler() {
        scheduledPosts = new ArrayList<>();
        timer = new Timer();
    }

    public void schedulePost(Post post, long scheduledTime) {
        post.setScheduledTime(scheduledTime);
        scheduledPosts.add(post);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                checkAndPostScheduledPosts();
            }
        }, scheduledTime - System.currentTimeMillis());
    }

    public void checkAndPostScheduledPosts() {
        long currentTime = System.currentTimeMillis();
        List<Post> postsToPost = new ArrayList<>();
        for (Post post : scheduledPosts) {
            if (post.getScheduledTime() <= currentTime) {
                postsToPost.add(post);
            }
        }
        for (Post post : postsToPost) {
            scheduledPosts.remove(post);
            // Implement the logic to post the scheduled post
        }
    }
}

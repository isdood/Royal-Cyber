package com.example.instagram;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

public class StorybookActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FloatingActionButton fab;
    private StorybookAdapter adapter;
    private List<StorybookItem> storybookItems;
    private Button schedulePostButton; // New button for scheduling posts
    private PostScheduler postScheduler; // New PostScheduler instance

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storybook);

        recyclerView = findViewById(R.id.recyclerView);
        fab = findViewById(R.id.fab);
        storybookItems = new ArrayList<>();
        adapter = new StorybookAdapter(storybookItems);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Implement functionality to add pictures, text, and locations to the storyline
                addNewItem();
            }
        });

        schedulePostButton = findViewById(R.id.schedulePostButton);
        schedulePostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                schedulePost();
            }
        });

        postScheduler = new PostScheduler(); // Initialize PostScheduler
    }

    private void addNewItem() {
        // Placeholder implementation for adding a new item to the storyline
        StorybookItem newItem = new StorybookItem("New Image URL", "New Caption", "New Location");
        storybookItems.add(newItem);
        adapter.notifyItemInserted(storybookItems.size() - 1);
        recyclerView.scrollToPosition(storybookItems.size() - 1);
    }

    private void schedulePost() {
        // Placeholder implementation for scheduling a post
        Post post = new Post("imageUrl", "caption", "location");
        long scheduledTime = System.currentTimeMillis() + 60000; // Schedule for 1 minute later
        postScheduler.schedulePost(post, scheduledTime);
        Toast.makeText(this, "Post scheduled", Toast.LENGTH_SHORT).show();
    }
}

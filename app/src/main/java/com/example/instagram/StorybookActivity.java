package com.example.instagram;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
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
    }

    private void addNewItem() {
        // Placeholder implementation for adding a new item to the storyline
        StorybookItem newItem = new StorybookItem("New Image URL", "New Caption", "New Location");
        storybookItems.add(newItem);
        adapter.notifyItemInserted(storybookItems.size() - 1);
        recyclerView.scrollToPosition(storybookItems.size() - 1);
    }
}

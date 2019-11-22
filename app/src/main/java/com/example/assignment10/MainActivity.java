package com.example.assignment10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private ModelScreen modelScreen;
    private Date date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        /*RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        final RwAdapterScreen adapter = new RwAdapterScreen(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        */
        
        // modelScreen = new ViewModelProvider(this).get(ModelScreen.class);
        // modelScreen.showData(adapter, date);




    }
}

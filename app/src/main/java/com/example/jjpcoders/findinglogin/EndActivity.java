package com.example.jjpcoders.findinglogin;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class EndActivity extends AppCompatActivity {
    ArrayList<String> listItems = new ArrayList<>();
    ArrayAdapter<String> adapter;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listItems);
        list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);
    }
    public void addItem(View v) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String item = editText.getText().toString();
        listItems.add(item);
        adapter.notifyDataSetChanged();
        editText.setText("");
    }
}
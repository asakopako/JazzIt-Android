package com.rigby.jazzit.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.rigby.jazzit.R;
import com.rigby.jazzit.controller.adapter.ContactsAdapter;

import net.steamcrafted.materialiconlib.MaterialIconView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.contactIconView) MaterialIconView contactIconView;
    @BindView(R.id.listView) public ListView listView;
    @BindView(R.id.progressBar) public View progressBarView;
    public ContactsAdapter contactsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        contactsAdapter = new ContactsAdapter(MainActivity.this);
        listView.setAdapter(contactsAdapter);

    }
}
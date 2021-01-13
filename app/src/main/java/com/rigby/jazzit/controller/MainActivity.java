package com.rigby.jazzit.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.rigby.jazzit.R;
import com.rigby.jazzit.controller.adapter.ContactsAdapter;
import com.rigby.jazzit.service.UserService;

import net.steamcrafted.materialiconlib.MaterialIconView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.backIconView) MaterialIconView backIconView;
    @BindView(R.id.contactIconView) MaterialIconView contactIconView;
    @BindView(R.id.mapIconView) MaterialIconView mapIconView;
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

        contactIconView.setVisibility(View.VISIBLE);
        contactIconView.setOnClickListener(v -> {
            Intent intent = new Intent(this, ContactsActivity.class);
            startActivity(intent);
        });

        UserService.getContacts(this);

    }
}
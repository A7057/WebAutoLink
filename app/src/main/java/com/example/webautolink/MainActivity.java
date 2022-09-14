package com.example.webautolink;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupHyperlink();
    }
    private void setupHyperlink() {
        scrollView=findViewById(R.id.scrollview);
        TextView linkTextView = findViewById(R.id.activity_intent_navigation_link);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    }

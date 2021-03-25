package com.mcgroupproject.lecture09listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class DisplayName extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display__name);
        textView=findViewById(R.id.textView);
        Intent intent=getIntent();
        textView.setText(intent.getStringExtra("name"));
    }
}
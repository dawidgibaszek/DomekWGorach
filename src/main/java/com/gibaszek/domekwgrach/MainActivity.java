package com.gibaszek.domekwgrach;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView likesView;
    private int likesCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button likebutton = findViewById(R.id.likeButton);
        Button deleteButton = findViewById(R.id.deleteButton);
        likesView = findViewById(R.id.likesView);

        likebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                likesCount++;
                updatelikesCount();
            }
        });
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(likesCount > 0) {
                    likesCount--;
                }
                updatelikesCount();
            }
        });
    }
    public void updatelikesCount() {
        likesView.setText(likesCount + " polubień");
    }
}
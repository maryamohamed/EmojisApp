package com.tech.emojisapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EmojiDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emojis_details);
        ImageView emojiImage = findViewById(R.id.emojiImage);
        TextView emojiDescription = findViewById(R.id.emojiDescription);
        ImageView arrowBack = findViewById(R.id.backArrow);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int imageResId = bundle.getInt("imageResId");
            String description = bundle.getString("description");

            emojiImage.setImageResource(imageResId);
            emojiDescription.setText(description);
        }
        arrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmojiDetails.this, Emojis.class);
                startActivity(intent);

            }
        });
    }

}
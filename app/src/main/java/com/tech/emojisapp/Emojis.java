package com.tech.emojisapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class Emojis extends AppCompatActivity {

    ImageButton coldFaceButton;
    ImageButton cryingFaceButton;
    ImageButton screamingFaceButton;
    ImageButton faceWithSymbolsButton;
    ImageButton fearfulFaceButton;
    ImageButton hotFaceButton;
    ImageButton huggingFaceButton;
    ImageButton pleadingFaceButton;
    ImageButton poutingFaceButton;
    ImageButton rollingFaceButton;
    ImageButton shushingFaceButton;
    ImageButton sleepingFaceButton;
    ImageButton upsideDownFaceButton;
    ImageButton smilingWithHeartFaceButton;
    ImageButton smilingWithHeartEyesFaceButton;
    ImageButton smilingWithTearFaceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emojis);

        coldFaceButton = findViewById(R.id.cold_face);
        coldFaceButton = findViewById(R.id.cold_face);
        cryingFaceButton = findViewById(R.id.crying_face);
        screamingFaceButton = findViewById(R.id.face_screaming);
        faceWithSymbolsButton = findViewById(R.id.face_with_symbols);
        fearfulFaceButton = findViewById(R.id.fearful_face);
        hotFaceButton = findViewById(R.id.hot_face);
        huggingFaceButton = findViewById(R.id.hugging_face);
        pleadingFaceButton = findViewById(R.id.pleading_face);
        poutingFaceButton = findViewById(R.id.pouting_face);
        rollingFaceButton = findViewById(R.id.rolling_on_the_floor);
        shushingFaceButton = findViewById(R.id.shushing_face);
        sleepingFaceButton = findViewById(R.id.sleeping_face);
        upsideDownFaceButton = findViewById(R.id.upside_down);
        smilingWithHeartFaceButton = findViewById(R.id.smiling_face_with_heart_eyes);
        smilingWithHeartEyesFaceButton = findViewById(R.id.smiling_face_with_sunglasses);
        smilingWithTearFaceButton = findViewById(R.id.smiling_face_with_tear);

        coldFaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Emojis.this, EmojiDetails.class);
                Bundle bundle = new Bundle();
                bundle.putInt("imageResId", R.drawable.cold_face_svgrepo_com);
                bundle.putString("description", "cold face");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        cryingFaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Emojis.this, EmojiDetails.class);

                Bundle bundle = new Bundle();
                bundle.putInt("imageResId", R.drawable.crying_face_svgrepo_com);
                bundle.putString("description", "crying Face");

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        screamingFaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Emojis.this, EmojiDetails.class);

                Bundle bundle = new Bundle();
                bundle.putInt("imageResId", R.drawable.face_screaming_in_fear_svgrepo_com);
                bundle.putString("description", "screaming Face");

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        faceWithSymbolsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Emojis.this, EmojiDetails.class);

                Bundle bundle = new Bundle();
                bundle.putInt("imageResId", R.drawable.face_with_symbols_on_mouth_svgrepo_com);
                bundle.putString("description", "Symbols on Mouth Face");

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        fearfulFaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Emojis.this, EmojiDetails.class);

                Bundle bundle = new Bundle();
                bundle.putInt("imageResId", R.drawable.fearful_face_svgrepo_com);
                bundle.putString("description", "fearful Face");

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        hotFaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Emojis.this, EmojiDetails.class
                );

                Bundle bundle = new Bundle();
                bundle.putInt("imageResId", R.drawable.hot_face_svgrepo_com);
                bundle.putString("description", "hot Face");

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        huggingFaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Emojis.this, EmojiDetails.class
                );

                Bundle bundle = new Bundle();
                bundle.putInt("imageResId", R.drawable.hugging_face_svgrepo_com);
                bundle.putString("description", "hugging Face");

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        pleadingFaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Emojis.this, EmojiDetails.class
                );

                Bundle bundle = new Bundle();
                bundle.putInt("imageResId", R.drawable.pleading_face_svgrepo_com);
                bundle.putString("description", "pleading Face");

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        poutingFaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Emojis.this, EmojiDetails.class
                );

                Bundle bundle = new Bundle();
                bundle.putInt("imageResId", R.drawable.pouting_face_svgrepo_com);
                bundle.putString("description", "pouting Face");

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        rollingFaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Emojis.this, EmojiDetails.class
                );

                Bundle bundle = new Bundle();
                bundle.putInt("imageResId", R.drawable.rolling_on_the_floor_laughing_svgrepo_com);
                bundle.putString("description", "rolling on the floor Face");

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        shushingFaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Emojis.this, EmojiDetails.class
                );

                Bundle bundle = new Bundle();
                bundle.putInt("imageResId", R.drawable.shushing_face_svgrepo_com);
                bundle.putString("description", "shushing Face");

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        sleepingFaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Emojis.this, EmojiDetails.class
                );

                Bundle bundle = new Bundle();
                bundle.putInt("imageResId", R.drawable.sleeping_face_svgrepo_com);
                bundle.putString("description", "sleeping Face");

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        upsideDownFaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Emojis.this, EmojiDetails.class
                );

                Bundle bundle = new Bundle();
                bundle.putInt("imageResId", R.drawable.upside_down_face_svgrepo_com);
                bundle.putString("description", "upside down Face");

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        smilingWithTearFaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Emojis.this, EmojiDetails.class
                );

                Bundle bundle = new Bundle();
                bundle.putInt("imageResId", R.drawable.smiling_face_with_tear_svgrepo_com);
                bundle.putString("description", "smiling with tear Face");

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        smilingWithHeartFaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Emojis.this, EmojiDetails.class
                );

                Bundle bundle = new Bundle();
                bundle.putInt("imageResId", R.drawable.smiling_face_with_hearts_svgrepo_com);
                bundle.putString("description", "smiling with hearts Face");

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        smilingWithHeartEyesFaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Emojis.this, EmojiDetails.class
                );

                Bundle bundle = new Bundle();
                bundle.putInt("imageResId", R.drawable.smiling_face_with_heart_eyes_svgrepo_com);
                bundle.putString("description", "smiling with heart eyes Face");

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
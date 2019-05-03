package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.askButton);
        final ImageView imageView = (ImageView)findViewById(R.id.image_eightBall);
        final int[] dizi = {R.drawable.ball1,R.drawable.ball2,
                R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};
        final Random randomNumber = new Random();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = randomNumber.nextInt(5);
                imageView.setImageResource(dizi[number]);
            }
        });
    }
}

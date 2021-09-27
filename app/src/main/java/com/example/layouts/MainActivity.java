package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.layouts.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but=findViewById(R.id.but1);
        but.setBackground(getDrawable(R.drawable.hoja));
        but.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                overridePendingTransition(R.anim.enter_from_right,R.anim.left_from_right);
            }
        });
        Button btn2=findViewById(R.id.but2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.enter_from_down,R.anim.left_from_down);
            }
        });

     /*  but.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch(motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN: {
                        but.animate().scaleX(1.5f).scaleY(1.5f).setDuration(100).start();
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                        but.animate().scaleX(1f).scaleY(1f).setDuration(100).start();
                        break;
                    case MotionEvent.ACTION_CANCEL:
                        Toast.makeText(MainActivity.this, "Event Cancel", Toast.LENGTH_SHORT).show();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        but.setX(motionEvent.getX()+but.getWidth());
                        but.setY(motionEvent.getY());
                }
                return true;
            }
        });
        */
    }

    @Override
    public void onBackPressed() {
        Intent homeIntent = new Intent(Intent.ACTION_MAIN);
        homeIntent.addCategory( Intent.CATEGORY_HOME );
        homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(homeIntent);
    }
}
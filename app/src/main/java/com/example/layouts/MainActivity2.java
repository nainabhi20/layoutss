package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.dynamicanimation.animation.SpringAnimation;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText editText=findViewById(R.id.edit1);
        Animation animation= AnimationUtils.loadAnimation(MainActivity2.this,R.anim.edit1);
        editText.startAnimation(animation);
        Button btn=findViewById(R.id.btn1);
        Animation animation1=AnimationUtils.loadAnimation(this,R.anim.button);
        btn.startAnimation(animation1);
    }

    @Override
    public void onBackPressed() {
        Intent intent=new Intent(MainActivity2.this,MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_from_right,R.anim.left_from_right);
    }
}
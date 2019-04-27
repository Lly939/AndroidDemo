package com.example.xiaoer.helloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HelloWorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world_layout);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            pubile void onClick(View v){

            }
        }); 
    }
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView greetingTextView;
    private boolean isHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_layout);



        greetingTextView = (TextView)findViewById(R.id.textView);

        initializeGreeting();

        Button exclaimBtn = (Button)findViewById(R.id.button);

        exclaimBtn.setOnClickListener(toggleGreeting);
    }

    private void initializeGreeting() {
        greetingTextView.setText("Hello");
        isHello = true;
    }

    private final View.OnClickListener toggleGreeting=new View.OnClickListener(){
        public void onClick (View btn){
            if(isHello) {
                isHello = false;
                greetingTextView.setText("Goodbye");
            }
            else {
                isHello = true;
                greetingTextView.setText("Hello");
            }
        }
    };

}

package com.example.welcomeusername;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showUserName(View v){
        final TextView outputText = (TextView) findViewById(R.id.textView);
        final EditText nameText = (EditText) findViewById(R.id.editText);
        Button b = (Button)findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                outputText.setText("Hello " + nameText.getText());
            }
        });
    }

}




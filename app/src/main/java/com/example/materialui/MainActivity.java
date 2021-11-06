package com.example.materialui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        com.google.android.material.textfield.TextInputLayout textInputLayout=findViewById(R.id.materialUITextView);
        com.google.android.material.textfield.TextInputEditText textInputLayout2=findViewById(R.id.materialUIEditText2);





        textInputLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(getApplicationContext(), Objects.requireNonNull(textInputLayout.getEditText()).toString(), Toast.LENGTH_SHORT).show();

//
//                if(!Objects.requireNonNull(textInputLayout.getEditText()).toString().equals("null")){
//                    textInputLayout.setHelperTextEnabled(false);
//                }
            }
        });

    }
}
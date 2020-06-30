package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void writingMethod(View view) {
        Number number = new Number();
        EditText usersNumber = findViewById(R.id.usersNumber);
        number.number = Integer.parseInt(usersNumber.getText().toString());
        if (number.isSquare()&&number.isTriangular()) {
            Toast.makeText(this, "The number is both triangle and square", Toast.LENGTH_SHORT).show();
        } else if (number.isTriangular()) {
            Toast.makeText(this, "The number is triangle", Toast.LENGTH_SHORT).show();
        } else if (number.isSquare()) {
            Toast.makeText(this, "The number is square", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "The number is neither triangle nor square", Toast.LENGTH_SHORT).show();
        }


    }

}
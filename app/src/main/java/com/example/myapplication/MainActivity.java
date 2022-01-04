package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9;

    int counter = 1;
    TextView textView, textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        textView = findViewById(R.id.textView);
        textView1 = findViewById(R.id.textView1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((counter % 2) == 0) {
                    button1.setText("O");
                    textView.setText("Now the turn is : Player1 ");
                }
                else {
                    button1.setText("X");
                    textView.setText("Now the turn is : Player2 ");
                }
                conditions();
                counter++;
                button1.setEnabled(false);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((counter % 2) == 0) {
                    button2.setText("O");
                    textView.setText("Now the turn is : Player1 ");
                }
                else {
                    button2.setText("X");
                    textView.setText("Now the turn is : Player2 ");
                }
                conditions();
                counter++;
                button2.setEnabled(false);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((counter % 2) == 0) {
                    button3.setText("O");
                    textView.setText("Now the turn is : Player1 ");
                }
                else {
                    button3.setText("X");
                    textView.setText("Now the turn is : Player2 ");
                }
                conditions();
                counter++;
                button3.setEnabled(false);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((counter % 2) == 0) {
                    button4.setText("O");
                    textView.setText("Now the turn is : Player1 ");
                }
                else {
                    button4.setText("X");
                    textView.setText("Now the turn is : Player2 ");
                }
                conditions();
                counter++;
                button4.setEnabled(false);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((counter % 2) == 0) {
                    button5.setText("O");
                    textView.setText("Now the turn is : Player1 ");
                }
                else {
                    button5.setText("X");
                    textView.setText("Now the turn is : Player2 ");
                }
                conditions();
                counter++;
                button5.setEnabled(false);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((counter % 2) == 0) {
                    button6.setText("O");
                    textView.setText("Now the turn is : Player1 ");
                }
                else {
                    button6.setText("X");
                    textView.setText("Now the turn is : Player2 ");
                }
                conditions();
                counter++;
                button6.setEnabled(false);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((counter % 2) == 0) {
                    button7.setText("O");
                    textView.setText("Now the turn is : Player1 ");
                }
                else {
                    button7.setText("X");
                    textView.setText("Now the turn is : Player2 ");
                }
                conditions();
                counter++;
                button7.setEnabled(false);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((counter % 2) == 0) {
                    button8.setText("O");
                    textView.setText("Now the turn is : Player1 ");
                }
                else {
                    button8.setText("X");
                    textView.setText("Now the turn is : Player2 ");
                }
                conditions();
                counter++;
                button8.setEnabled(false);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((counter % 2) == 0) {
                    button9.setText("O");
                    textView.setText("Now the turn is : Player1 ");
                }
                else {
                    button9.setText("X");
                    textView.setText("Now the turn is : Player2 ");
                }
                conditions();
                counter++;
                button9.setEnabled(false);
            }
        });
    }
    void conditions(){
        if(button1.getText().equals(button2.getText()) && button1.getText().equals(button3.getText())){
            if(button1.getText() == "X"){
                textView1.setText("Player1 has won the Game");
            }else{
                textView1.setText("Player2 has won the Game");
            }
            textView.setText(" ");
            clicked();
        }
        else if(button1.getText().equals(button4.getText()) && button1.getText().equals(button7.getText())){
            if(button1.getText() == "X"){
                textView1.setText("Player1 has won the Game");
            }else{
                textView1.setText("Player2 has won the Game");
            }
            textView.setText(" ");
            clicked();
        }
        else if(button5.getText().equals(button1.getText()) && button5.getText().equals(button9.getText())){
            if(button5.getText() == "X"){
                textView1.setText("Player1 has won the Game");
            }else{
                textView1.setText("Player2 has won the Game");
            }
            textView.setText(" ");
            clicked();
        }
        else if(button5.getText().equals(button7.getText()) && button5.getText().equals(button3.getText())){
            if(button5.getText() == "X"){
                textView1.setText("Player1 has won the Game");
            }else{
                textView1.setText("Player2 has won the Game");
            }
            textView.setText(" ");
            clicked();
        }
        else if(button5.getText().equals(button2.getText()) && button5.getText().equals(button8.getText())){
            if(button5.getText() == "X"){
                textView1.setText("Player1 has won the Game");
            }else{
                textView1.setText("Player2 has won the Game");
            }
            textView.setText(" ");
            clicked();
        }
        else if(button5.getText().equals(button4.getText()) && button5.getText().equals(button6.getText())){
            if(button5.getText() == "X"){
                textView1.setText("Player1 has won the Game");
            }else{
                textView1.setText("Player2 has won the Game");
            }
            textView.setText(" ");
            clicked();
        }
        else if(button9.getText().equals(button6.getText()) && button9.getText().equals(button3.getText())){
            if(button9.getText() == "X"){
                textView1.setText("Player1 has won the Game");
            }else{
                textView1.setText("Player2 has won the Game");
            }
            textView.setText(" ");
            clicked();
        }
        else if(button9.getText().equals(button8.getText()) && button9.getText().equals(button7.getText())){
            if(button9.getText() == "X"){
                textView1.setText("Player1 has won the Game");
            }else{
                textView1.setText("Player2 has won the Game");
            }
            textView.setText(" ");
            clicked();
        }
        else if(counter >= 9) textView1.setText("Awwwwwww! try next time");
    }
    void clicked(){
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
    }
}
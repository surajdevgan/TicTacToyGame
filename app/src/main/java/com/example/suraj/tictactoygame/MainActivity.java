package com.example.suraj.tictactoygame;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        Button btnselected = (Button) view;
        int ButtonId = 0;
        switch (btnselected.getId()) {
            case R.id.btn1:
                ButtonId = 1;
                break;

            case R.id.btn2:
                ButtonId = 2;
                break;

            case R.id.btn3:
                ButtonId = 3;
                break;

            case R.id.btn4:
                ButtonId = 4;
                break;

            case R.id.btn5:
                ButtonId = 5;
                break;

            case R.id.btn6:
                ButtonId = 6;
                break;

            case R.id.btn7:
                ButtonId = 7;
                break;

            case R.id.btn8:
                ButtonId = 8;
                break;

            case R.id.btn9:
                ButtonId = 9;
                break;
        }
        PlayGame(ButtonId , btnselected);
    }
    int ActivePlayer=1; // 1 for first player and 2 for second player
    ArrayList<Integer> Player1 = new ArrayList<>(); // this array list hold all data of Player1
    ArrayList<Integer> Player2 = new ArrayList<>(); // this array list hold all data of Player1
        void PlayGame(int ButtonID, Button btnselected)
    {
        if(ActivePlayer==1)
        {
            btnselected.setText("X");
            btnselected.setBackgroundColor(Color.GREEN);
            Player1.add(ButtonID);
            ActivePlayer =2;
        }

        else if(ActivePlayer==2)
        {
            btnselected.setText("0");
            btnselected.setBackgroundColor(Color.BLUE);
             Player2.add(ButtonID);
            ActivePlayer =1;

        }




    }
}

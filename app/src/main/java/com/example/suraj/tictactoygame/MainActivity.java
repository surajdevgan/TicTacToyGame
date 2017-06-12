package com.example.suraj.tictactoygame;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

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
            AutoPlay();
        }

        else if(ActivePlayer==2)
        {
            btnselected.setText("0");
            btnselected.setBackgroundColor(Color.BLUE);
             Player2.add(ButtonID);
            ActivePlayer =1;

        }
        btnselected.setEnabled(false);
        CheckWinner();


    }
    void CheckWinner()
    {
        int Winner = -1;
        // row 1
        if(Player1.contains(1) && Player1.contains(2) && Player1.contains(3))
        {
            Winner=1;
        }
        if(Player2.contains(1) && Player2.contains(2) && Player2.contains(3))
        {
            Winner=2;
        }
        // row 2
        if(Player1.contains(4) && Player1.contains(5) && Player1.contains(6))
        {
            Winner=1;
        }
        if(Player2.contains(4) && Player2.contains(5) && Player2.contains(6))
        {
            Winner=2;
        }
        // row  3
        if(Player1.contains(7) && Player1.contains(8) && Player1.contains(9))
        {
            Winner=1;
        }
        if(Player2.contains(7) && Player2.contains(8) && Player2.contains(9))
        {
            Winner=2;
        }
        // column 1
        if(Player1.contains(1) && Player1.contains(4) && Player1.contains(7))
        {
            Winner=1;
        }
        if(Player2.contains(1) && Player2.contains(4) && Player2.contains(7))
        {
            Winner=2;
        }
        // column 2
        if(Player1.contains(2) && Player1.contains(5) && Player1.contains(8))
        {
            Winner=1;
        }
        if(Player2.contains(2) && Player2.contains(5) && Player2.contains(8))
        {
            Winner=2;
        }
        // column 3
        if(Player1.contains(3) && Player1.contains(6) && Player1.contains(9))
        {
            Winner=1;
        }
        if(Player2.contains(3) && Player2.contains(6) && Player2.contains(9))
        {
            Winner=2;
        }
        if(Winner!=-1)
        {
            // We have winner
            if(Winner==1)
            {
                Toast.makeText(this, "Player 1 is winner", Toast.LENGTH_SHORT).show();
            }
            if(Winner==2)
            {
                Toast.makeText(this, "Player 2 is winner", Toast.LENGTH_SHORT).show();
            }

        }



    }
    void AutoPlay()
    {
        ArrayList<Integer> EmptyCells = new ArrayList<>(); // these are all unselected cells
        // Finding Empty Cells
        for (int i=1;i<10;i++)
        {
            if(!(Player1.contains(i)|| Player2.contains(i)))
            {
                EmptyCells.add(i);

            }
        }
        // Random is a class in java which enable us to select random values
        Random r = new Random();
       int RandomIndex = r.nextInt(EmptyCells.size()-0)+  0; // if size = 3 , then u will able to select (0,1,2)
        int ButtonId = EmptyCells.get(RandomIndex);
        Button btnselected ;
        switch (ButtonId) {

            case 1:
                btnselected = (Button)findViewById(R.id.btn1);
                break;

            case 2:
                btnselected = (Button)findViewById(R.id.btn2);
                break;

            case 3:
                btnselected = (Button)findViewById(R.id.btn3);
                break;

            case 4:
                btnselected = (Button)findViewById(R.id.btn4);
                break;

            case 5:
                btnselected = (Button)findViewById(R.id.btn5);
                break;

            case 6:
                btnselected = (Button)findViewById(R.id.btn6);
                break;

            case 7:
                btnselected = (Button)findViewById(R.id.btn7);
                break;

            case 8:
                btnselected = (Button)findViewById(R.id.btn8);
                break;

            case 9:
                btnselected = (Button)findViewById(R.id.btn9);
                break;

            default:
                btnselected = (Button)findViewById(R.id.btn1);
                break;


        }
        PlayGame(ButtonId, btnselected);

    }

}

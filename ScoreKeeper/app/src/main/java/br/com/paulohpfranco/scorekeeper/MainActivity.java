package br.com.paulohpfranco.scorekeeper;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int[] pointsArray = {0,0};//{Left, Right}
    private int[] missArray = {0,0};//{Left, Right}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addpointsLeft(View view) {
        pointsArray[0] = pointsArray[0]+1;
        TextView pointsLeft = (TextView) findViewById(R.id.leftPoints);
        pointsLeft.setText(String.valueOf(pointsArray[0]));
    }

    public void addmissLeft(View view) {
        missArray[0] = missArray[0]+1;
        TextView missLeft = (TextView) findViewById(R.id.leftMisses);
        missLeft.setText(String.valueOf(missArray[0]));
    }

    public void addpointsRight(View view) {
        pointsArray[1] = pointsArray[1]+1;
        TextView pointsRight = (TextView) findViewById(R.id.rightPoints);
        pointsRight.setText(String.valueOf(pointsArray[1]));
    }

    public void addmissRight(View view) {
        missArray[1] = missArray[1]+1;
        TextView missRight = (TextView) findViewById(R.id.rightMisses);
        missRight.setText(String.valueOf(missArray[1]));
    }

    public void resetScore(View view) {
        pointsArray[0] = 0;
        pointsArray[1] = 0;
        missArray[0] = 0;
        missArray[1] = 0;
        TextView pointsLeft = (TextView) findViewById(R.id.leftPoints);
        TextView missLeft = (TextView) findViewById(R.id.leftMisses);
        TextView missRight = (TextView) findViewById(R.id.rightMisses);
        TextView pointsRight = (TextView) findViewById(R.id.rightPoints);

        pointsLeft.setText("0");
        missLeft.setText("0");
        missRight.setText("0");
        pointsRight.setText("0");
    }
}

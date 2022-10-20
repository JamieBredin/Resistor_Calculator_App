package com.example.resistor_calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity<string> extends AppCompatActivity {
    Button b1;
    TextView tv1, tv2, tv3, tv4, totalView;
    int counter=0;
    String firstBand, secondBand, thirdBand, toleranceBand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickBlack(View view)
    {
        switch(counter) {
            case 0:
                tv1 = findViewById(R.id.tv1);
                tv1.setBackgroundColor(getColor(R.color.black));
                firstBand="black";
                counter++;
                break;
            case 1:
                tv2 = findViewById(R.id.tv2);
                tv2.setBackgroundColor(getColor(R.color.black));
                secondBand="black";
                counter++;
                break;
            case 2:
                tv3 = findViewById(R.id.tv3);
                tv3.setBackgroundColor(getColor(R.color.black));
                thirdBand="black";
                counter++;
                break;
            case 3:
                calculatedResistance(firstBand,secondBand,thirdBand,toleranceBand);
                break;
        }

    }
    public void clickBrown(View view)
    {
        switch(counter) {
            case 0:
                tv1 = findViewById(R.id.tv1);
                tv1.setBackgroundColor(getColor(R.color.brown));
                firstBand="brown";
                counter++;
                break;
            case 1:
                tv2 = findViewById(R.id.tv2);
                tv2.setBackgroundColor(getColor(R.color.brown));
                secondBand="brown";
                counter++;
                break;
            case 2:
                tv3 = findViewById(R.id.tv3);
                tv3.setBackgroundColor(getColor(R.color.brown));
                thirdBand="brown";
                counter++;
                break;
            case 3:
                calculatedResistance(firstBand,secondBand,thirdBand,toleranceBand);
                break;
        }
    }
    public void clickRed(View view)
    {
        switch(counter) {
            case 0:
                tv1 = findViewById(R.id.tv1);
                tv1.setBackgroundColor(getColor(R.color.red));
                firstBand="red";
                counter++;
                break;
            case 1:
                tv2 = findViewById(R.id.tv2);
                tv2.setBackgroundColor(getColor(R.color.red));
                secondBand="red";
                counter++;
                break;
            case 2:
                tv3 = findViewById(R.id.tv3);
                tv3.setBackgroundColor(getColor(R.color.red));
                thirdBand="red";
                counter++;
                break;
            case 3:
                calculatedResistance(firstBand,secondBand,thirdBand,toleranceBand);
                break;
        }
    }
    public void clickOrange(View view)
    {
        switch(counter) {
            case 0:
                tv1 = findViewById(R.id.tv1);
                tv1.setBackgroundColor(getColor(R.color.orange));
                firstBand="orange";
                counter++;
                break;
            case 1:
                tv2 = findViewById(R.id.tv2);
                tv2.setBackgroundColor(getColor(R.color.orange));
                secondBand="orange";
                counter++;
                break;
            case 2:
                tv3 = findViewById(R.id.tv3);
                tv3.setBackgroundColor(getColor(R.color.orange));
                thirdBand="orange";
                counter++;
                break;
            case 3:
                calculatedResistance(firstBand,secondBand,thirdBand,toleranceBand);
                break;
        }
    }
    public void clickYellow(View view)
    {
        switch(counter) {
            case 0:
                tv1 = findViewById(R.id.tv1);
                tv1.setBackgroundColor(getColor(R.color.yellow));
                firstBand="yellow";
                counter++;
                break;
            case 1:
                tv2 = findViewById(R.id.tv2);
                tv2.setBackgroundColor(getColor(R.color.yellow));
                secondBand="yellow";
                counter++;
                break;
            case 2:
                tv3 = findViewById(R.id.tv3);
                tv3.setBackgroundColor(getColor(R.color.yellow));
                thirdBand="yellow";
                counter++;
                break;
            case 3:
                calculatedResistance(firstBand,secondBand,thirdBand,toleranceBand);
                break;
        }
    }
    public void clickGreen(View view) {
        switch (counter) {
            case 0:
                tv1 = findViewById(R.id.tv1);
                tv1.setBackgroundColor(getColor(R.color.green));
                firstBand="green";
                counter++;
                break;
            case 1:
                tv2 = findViewById(R.id.tv2);
                tv2.setBackgroundColor(getColor(R.color.green));
                secondBand="green";
                counter++;
                break;
            case 2:
                tv3 = findViewById(R.id.tv3);
                tv3.setBackgroundColor(getColor(R.color.green));
                thirdBand="green";
                counter++;
                break;
            case 3:
                calculatedResistance(firstBand,secondBand,thirdBand,toleranceBand);
                break;
        }
    }
        public void clickBlue (View view)
        {
            switch (counter) {
                case 0:
                    tv1 = findViewById(R.id.tv1);
                    tv1.setBackgroundColor(getColor(R.color.blue));
                    firstBand="blue";
                    counter++;
                    break;
                case 1:
                    tv2 = findViewById(R.id.tv2);
                    tv2.setBackgroundColor(getColor(R.color.blue));
                    secondBand="blue";
                    counter++;
                    break;
                case 2:
                    tv3 = findViewById(R.id.tv3);
                    tv3.setBackgroundColor(getColor(R.color.blue));
                    thirdBand="blue";
                    counter++;
                    break;
                case 3:
                    calculatedResistance(firstBand,secondBand,thirdBand,toleranceBand);
                    break;
            }
        }

    public void clickViolet(View view)
    {
        switch (counter) {
            case 0:
                tv1 = findViewById(R.id.tv1);
                tv1.setBackgroundColor(getColor(R.color.violet));
                firstBand="violet";
                counter++;
                break;
            case 1:
                tv2 = findViewById(R.id.tv2);
                tv2.setBackgroundColor(getColor(R.color.violet));
                secondBand="violet";
                counter++;
                break;
            case 2:
                tv3 = findViewById(R.id.tv3);
                tv3.setBackgroundColor(getColor(R.color.violet));
                thirdBand="violet";
                counter++;
                break;
            case 3:
                calculatedResistance(firstBand,secondBand,thirdBand,toleranceBand);
                break;
        }
    }
    public void clickGrey(View view)
    {
        switch (counter) {
            case 0:
                tv1 = findViewById(R.id.tv1);
                tv1.setBackgroundColor(getColor(R.color.grey));
                firstBand="grey";
                counter++;
                break;
            case 1:
                tv2 = findViewById(R.id.tv2);
                tv2.setBackgroundColor(getColor(R.color.grey));
                secondBand="grey";
                counter++;
                break;
            case 2:
                tv3 = findViewById(R.id.tv3);
                tv3.setBackgroundColor(getColor(R.color.grey));
                thirdBand="grey";
                counter++;
                break;
            case 3:
                calculatedResistance(firstBand,secondBand,thirdBand,toleranceBand);
                break;
        }
    }
    public void clickWhite(View view)
    {
        switch (counter) {
            case 0:
                tv1 = findViewById(R.id.tv1);
                tv1.setBackgroundColor(getColor(R.color.white));
                firstBand="white";
                counter++;
                break;
            case 1:
                tv2 = findViewById(R.id.tv2);
                tv2.setBackgroundColor(getColor(R.color.white));
                secondBand="white";
                counter++;
                break;
            case 2:
                tv3 = findViewById(R.id.tv3);
                tv3.setBackgroundColor(getColor(R.color.white));
                thirdBand="white";
                counter++;
                break;
            case 3:
                calculatedResistance(firstBand,secondBand,thirdBand,toleranceBand);
                break;

        }
    }
    public void clickGold(View view)
    {
        tv4 = findViewById(R.id.tv4);
        tv4.setBackgroundColor(getColor(R.color.gold));
        toleranceBand="gold";
        calculatedResistance(firstBand,secondBand,thirdBand,toleranceBand);

    }
    public void clickSliver(View view)
    {
        tv4 = findViewById(R.id.tv4);
        tv4.setBackgroundColor(getColor(R.color.silver));
        toleranceBand="silver";
        calculatedResistance(firstBand,secondBand,thirdBand,toleranceBand);
    }
    public void clickNone(View view)
    {
        tv4 = findViewById(R.id.tv4);
        tv4.setBackgroundColor(getColor(R.color.darkslateGrey));
        toleranceBand="none";
        calculatedResistance(firstBand,secondBand,thirdBand,toleranceBand);

    }
    public void clearCounter(View view)
    {
        tv1 = findViewById(R.id.tv1);
        tv1.setBackgroundColor(getColor(R.color.darkslateGrey));
        tv2 = findViewById(R.id.tv2);
        tv2.setBackgroundColor(getColor(R.color.darkslateGrey));
        tv3 = findViewById(R.id.tv3);
        tv3.setBackgroundColor(getColor(R.color.darkslateGrey));
        tv4 = findViewById(R.id.tv4);
        tv4.setBackgroundColor(getColor(R.color.darkslateGrey));
        counter =0;
    }

    public int calculate (String firstBand, String secondBand, String thirdBand)
    {
        int firstBandNumber =0, secondBandNumber =0, thirdBandNumber=0, toleranceBandNumber=0;
        int resistance=0;
        switch(firstBand)
        {
            case "black":
                firstBandNumber=0;
                break;
            case "brown":
                firstBandNumber=1;
                break;
            case "red":
                firstBandNumber=2;
                break;
            case "orange":
                firstBandNumber=3;
                break;
            case "yellow":
                firstBandNumber=4;
                break;
            case "green":
                firstBandNumber=5;
                break;
            case "blue":
                firstBandNumber=6;
                break;
            case "violet":
                firstBandNumber=7;
                break;
            case "grey":
                firstBandNumber=8;
                break;
            case "white":
                firstBandNumber=9;
                break;


        }

        switch(secondBand)
        {
            case "black":
                secondBandNumber=0;
                break;
            case "brown":
                secondBandNumber=1;
                break;
            case "red":
                secondBandNumber=2;
                break;
            case "orange":
                secondBandNumber=3;
                break;
            case "yellow":
                secondBandNumber=4;
                break;
            case "green":
                secondBandNumber=5;
                break;
            case "blue":
                secondBandNumber=6;
                break;
            case "violet":
                secondBandNumber=7;
                break;
            case "grey":
                secondBandNumber=8;
                break;
            case "white":
                secondBandNumber=9;
                break;
        }

        switch(thirdBand)
        {
            case "black":
                thirdBandNumber=1;
                break;
            case "brown":
                thirdBandNumber=10;
                break;
            case "red":
                thirdBandNumber=100;
                break;
            case "orange":
                thirdBandNumber=1000;
                break;
            case "yellow":
                thirdBandNumber=10000;
                break;
            case "green":
                thirdBandNumber=100000;
                break;
            case "blue":
                thirdBandNumber=1000000;
                break;
            case "violet":
                thirdBandNumber=10000000;
                break;
            case "grey":
                thirdBandNumber=100000000;
                break;
            case "white":
                thirdBandNumber=1000000000;
                break;
        }



            resistance = ((firstBandNumber *10) +secondBandNumber)*thirdBandNumber;
        return resistance;
    }
public int toleranceMethod(String toleranceBand)
{
    int toleranceBandNumber=0;
    switch(toleranceBand)
    {
        case "gold":
            toleranceBandNumber=5;
            break;
        case "silver":
            toleranceBandNumber=10;
            break;
        case "none":
            toleranceBandNumber=20;
            break;
    }
    return toleranceBandNumber;
}

public void calculatedResistance(String firstBand, String secondBand, String thirdBand,String toleranceBand)
{
    TextView tv5;
    tv5 = findViewById(R.id.totalView);
    int calculatedResistance = calculate(firstBand,secondBand,thirdBand);
    int tolerance = toleranceMethod(toleranceBand);

    tv5.setText(calculatedResistance + "Ω ±" + tolerance + "%");


}
}
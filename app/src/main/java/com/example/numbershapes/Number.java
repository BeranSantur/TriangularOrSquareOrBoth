package com.example.numbershapes;

import android.widget.EditText;

public class Number {
    int number;
    public boolean isSquare()
    {
        double sqrtNumber=Math.sqrt(number);
        if(sqrtNumber==Math.floor(sqrtNumber))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public boolean isTriangular()
    {
        int counter=1;
        int triangularNumber=0;
        while(triangularNumber<number)
        {
            triangularNumber=triangularNumber+counter;
            counter++;
            if(triangularNumber==number)
            {
                return true;
            }
        }
        return false;

    }

}
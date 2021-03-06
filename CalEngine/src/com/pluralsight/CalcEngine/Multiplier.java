package com.pluralsight.CalcEngine;

/**
 * Created by halon on 9/18/2016.
 */
public class Multiplier extends CalculateBase {
    Multiplier() {}
    Multiplier(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double value = getLeftVal() * getRightVal();
        setResult(value);
    }

}


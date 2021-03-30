package com.hfad.calculator;

public class Calculate {
    String add(String firstNum, String secondNum){
        return String.valueOf(Integer.parseInt(firstNum)+Integer.parseInt(secondNum));
    }
    String substract(String firstNum, String secondNum){
        return String.valueOf(Integer.parseInt(firstNum)-Integer.parseInt(secondNum));
    }

    String multiply(String firstNum, String secondNum){
        return String.valueOf(Integer.parseInt(firstNum)*Integer.parseInt(secondNum));
    }

    String divide(String firstNum, String secondNum){
        return String.valueOf(Double.parseDouble(firstNum)/Double.parseDouble(secondNum));
    }
}

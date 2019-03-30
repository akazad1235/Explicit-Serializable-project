package com.example.akazad.employee.utils;

public class Validation {

    public static boolean validate(String...strings){

        boolean flag=true;
        for (String s:strings){
            if (s.isEmpty()){
                flag=false;
            }
        }
        return flag;

    }
}

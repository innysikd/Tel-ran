package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(startOZ("ozon"));
    }

    public static String startOZ (String str){
       String res = "";
       if (str.length()>=1 && str.charAt(0)=='o'){
           res = res + str.charAt(0);
       }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            res = res + str.charAt(1);
        }
        return res;
    }
}

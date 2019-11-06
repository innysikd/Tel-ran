package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(newArray(arr)));
        System.out.println(Arrays.toString(arr));

    }

    public static int[] newArray (int[] arr){
        int[] newArr = new int[arr.length];
        newArr[0] = arr[arr.length-1];
        newArr[newArr.length-1] = arr[0];
        for (int i =1; i<arr.length-1; i++)
        {newArr[i] = arr[i];}
        return newArr;
    }
    }

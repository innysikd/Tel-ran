package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int[] a = {2,8,10,13};
        int[] b = {1,3,5,12,16,17};
        int[] c = {4,67,43,70,63,29,66,295};

        System.out.println(Arrays.toString(mergeTwoArrays(a, b)));

        System.out.println(factorialR(3));

        System.out.println(Arrays.toString(sort(c)));

    }

    public static int[] mergeTwoArrays (int[]a, int []b){
        int[] result = new int[a.length + b.length];
        int aIndex = 0; // counter of elements arrays a
        int bIndex = 0;

        for (int i=0; i<result.length; i++){
            if (aIndex>= a.length){
                result[i]=b[bIndex];
                bIndex ++;
            }else if(bIndex>=b.length){
                result[i] = a[a.length];
                aIndex++;
            }else if(a[aIndex]<b[bIndex]){
    result[i] = a[aIndex];
    aIndex ++;
            }else{
    result[i] = b[bIndex];
    bIndex++;
            }
            }
        return result;
    }

    //factorial

    public static int factorialThisLoop(int n){  //how to build factorial
        int res = 1;
        if (n==0){
            return res;
        }
        for (int i=1; i<=n; i++){
            res = res *i;
        }
        return res;
    }

    //recursion 1

    public static int factorialR (int n){ //recurse method, which calls itself until it's stopped
        if (n<0){
            return -1;
        }
        int res = 1;
        if (n==1 || n==0){  // when n =1, (number and not number of factorial) the method stops calling itself
            return res;
        }
        res = n * factorialR(n-1);
        return res;
    }

    // recursion 2

    public static int[] sort (int[] arr){
        if (arr.length<2) return arr;  // it's where our recursion stops
        int middle = arr.length/2; // we divide it into two parts
        int[]arrFirst = Arrays.copyOfRange(arr, 0, middle); //copies the first part of the old array to the new array
        int[]arrSecond = Arrays.copyOfRange(arr, middle, arr.length);//copies the second part of the old array to the new array
        return merge(sort(arrFirst), sort(arrSecond)); //return the two merged arrays
    }

    public static int[] merge (int[]arrFirst, int[]arrSecond){
        int arrLength = arrFirst.length + arrSecond.length;
        int[] result = new int[arrLength];
        int indexFirst = 0;
        int indexSecond = 0;

        for (int i=0; i<arrLength; i++){
            if (indexFirst==arrFirst.length){
                result[i] = arrSecond[indexSecond];
                indexSecond++;
            }else if(indexSecond == arrSecond.length){
                result[i] = arrFirst[indexFirst];
                indexFirst++;
            }else {
                if (arrFirst[indexFirst]<arrSecond[indexSecond]){
                    result[i] = arrFirst[indexFirst];
                    indexFirst++;
                }else{
                    result[i]=arrSecond[indexSecond];
                    indexSecond++;
                }
            }
        }
        return result;
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
   //     allNumbersN(7);
        System.out.println();
        printFromAtoB(10,5);
        recursion3(5, 10);



    }

 /*   public static void allNumbersN (int n){

        if (n==0) return;
        allNumbersN(n-1);
        System.out.print(n + " ");

    }*/

     public static void printFromAtoB (int a, int b){

         if (a==b) return;

         else if (a<b){
             printFromAtoB(a, b-1);
             System.out.print(b);
         } else {
             printFromAtoB(a, b + 1);
             System.out.print(b);
         }
     }

     public static void recursion3 (int a, int b){
         if (a==b) {
             System.out.println(a + " ");
         }else if (a<b) {
             recursion3(a, b - 1);
             System.out.println(b + " ");
         }else {
             recursion3(a, b+1);
             System.out.println(b + " ");
         }
     }

     public static int sumOfNumbers(int n){
         if (n<10){
             return n;
         }else{
             return n%10 + sumOfNumbers(n/10);
         }
     }





}



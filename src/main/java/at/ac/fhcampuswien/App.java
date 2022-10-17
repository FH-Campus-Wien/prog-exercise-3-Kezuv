package at.ac.fhcampuswien;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void oneMonthCalendar (int days, int startingday) {
        for (int z=0; z<startingday-1;z++){
            System.out.print("   ");
        }
        for (int i =1;i<=days;i++){
            if (i<=9){
                System.out.print(" "+i+" ");
            } else System.out.print(i+" ");
            for (int j=(i+(startingday-1))%7; j==0 ;j++){
                System.out.println();
            }
        }

        if ((days + startingday-1)%7!=0){
            System.out.println();
        }
    }


    public static long[] lcg(long seed) {

        long m = 2147483648L;
        long a = 1103515245L;
        long c = 12345;

        long[] random_array = new long[10];

        // Startwert manuell setzen
        random_array[0]=((seed*a)+c)%m;

        // die folgenden 9 berechnen
        for (int i = 0; i < 9; i++) {
            random_array[i+1] =((random_array[i]*a)+c)%m;
        }

        return random_array;
    }

    public static void guessingGame(int numberToGuess){
        Scanner scanner = new Scanner(System.in);

        for (int count = 1; count <=10; count++){
            System.out.print("Guess number "+count+": ");
            int a= scanner.nextInt();

            if (count <10 && a<numberToGuess){
                System.out.println("The number AI picked is higher than your guess.");
            }
            if (count <10 && a>numberToGuess){
                System.out.println("The number AI picked is lower than your guess.");
            }
            if (count <10 && a == numberToGuess){
                System.out.println("You won wisenheimer!");
                break;
            }
            if (count==10 && a != numberToGuess) {
                System.out.println("You lost! Have you ever heard of divide & conquer?");
                break;
            }
        }
    }

    public static int randomNumberBetweenOneAndHundred(){
        Random random = new Random();
        return random.nextInt(100);
    }

    public  static boolean swapArrays(int []tabelle1, int tabelle2[]){
    if (tabelle1.length != tabelle2.length){
        return false;}
    else {
        int zwischenspeicher;
        for (int i = 0; i < tabelle1.length; i++) {
            zwischenspeicher = tabelle1[i];
            tabelle1[i] = tabelle2[i];
            tabelle1[i] = zwischenspeicher;
        }
        return true;
    }
    }


    public static void checkDigit(int[]Array){

        int sum = 0;

        for (int i=0; i <= Array.length; i++){
            sum = Array[i]+2;
        }
        sum = sum%11;

        if (sum==10){
            sum=0;
        }
        if (sum==1){
            sum=5;
        }
    }
    // Implement all methods as public static

    public static void main(String[] args) {

        // Abruf Kalneder
        oneMonthCalendar(31, 4);

       // lcg Aufruf

        System.out.println();
        System.out.println();
        System.out.println();

        long [] randomnumbers = lcg(0);

        for (int i=1; i <11 ; i++){
            System.out.println(randomnumbers[i-1]);
        }

        //Aufruf GuessingGame
        guessingGame(randomNumberBetweenOneAndHundred());

        // Abruf swapArrays
        int[]Array1 = {10,20,30,40,50};
        int[]Array2 = {100,90,80,70,60};

        swapArrays(Array1, Array2);

        System.out.println(Array1);
        System.out.println(Array2);
        //Abruf checkDigit




       // int []tabelle1 = new int[10];
        //tabelle1[0] = 44;
       // int [] tabelle2 = {4,3,2};
       // boolean returnValue = swapArrays(new int[]{4,3,2}, new int[]{4});


       // String s = "asdfasdasd";
       // char[] text =s.toCharArray();
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }
}
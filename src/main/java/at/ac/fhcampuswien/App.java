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
        for (int i =0; i<tabelle1.length;i++){
            tabelle1[i] = tabelle1[i]^tabelle2[i];
            tabelle2[i] = tabelle1[i]^tabelle2[i];
            tabelle1[i]=tabelle1[i]^tabelle2[i];

        }
        System.out.println("tabbele 1 nach tausch: "+Arrays.toString(tabelle1));
        System.out.println("tabelle 2 nach taush: "+Arrays.toString(tabelle2));
        return true;
    }
    }

    public static String camelCase(String input){
        char[] camelcase = input.toCharArray();
        int laenge = camelcase.length;

        String loesung ="";

       for (int i = 3; i <= camelcase.length; i++){

           if (camelcase[i-3]==' '){

               System.out.println(camelcase[i-2]-(char) 32);

           } else System.out.println(camelcase[i-2]);

       }



        System.out.println(loesung);

        return loesung;
    }
    public static int checkDigit(int[]Array){

        int sum = 0;
        int gewichtung=2;

        for (int i=1; i <= Array.length; i++){
            sum = sum + (Array[i-1]*gewichtung);
            gewichtung++;
        }
        sum = sum%11;
        sum = 11-sum;

        if (sum==10){
            sum=0;
        }
        if (sum==11){
            sum=5;
        }
        System.out.println(sum);
        return sum;
    }
    // Implement all methods as public static

    public static void main(String[] args) {

        // Abruf Kalneder
        oneMonthCalendar(31, 4);

       // lcg Aufruf

       //System.out.println();
       // System.out.println();
       // System.out.println();

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
        //Abruf checkDigit
        int[] input = new int[]{4, 0, 4, 4, 4, 8, 2, 9, 3};
        checkDigit(input);

        camelCase("Was geht ab Mein liEbe TaUfEl");

       // String s = "asdfasdasd";
       // char[] text =s.toCharArray();
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }
}
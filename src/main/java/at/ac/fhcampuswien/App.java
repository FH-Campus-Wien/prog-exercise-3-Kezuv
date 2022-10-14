package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void oneMonthCalendar (int days, int startingday) {
        for (int z=startingday; z>0;z--){
            System.out.print("  ");
        }
        for (int i =1;i<=days;i++){
            if (i<=9){
                System.out.print(" "+i+" ");
            } else System.out.print(i+" ");
            if ((i+(startingday-1))%7==0) {
                System.out.println();
            }
        }
        System.out.println();
        }

    public  static boolean swapArrays(int [] tabelle1, int [] tabelle2){
    if (tabelle1.length != tabelle2.length)
        return false;
    return true;
    }

    // Implement all methods as public static

    public static void main(String[] args) {
        oneMonthCalendar(28, 7);

        int []tabelle1 = new int[10];
        tabelle1[0] = 44;
        int [] tabelle2 = {4,3,2};
        boolean returnValue = swapArrays(new int[]{4,3,2}, new int[]{4});



        String s = "asdfasdasd";
        char[] text =s.toCharArray();
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }
}
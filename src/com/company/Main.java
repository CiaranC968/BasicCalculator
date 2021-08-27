package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    welcome();
    Scanner sc = new Scanner(System.in);



    System.out.print("1: add result\n2: Subtract result\n3: multiply\n0: Quit\n:- ");
    // String input

    int entryInput = sc.nextInt();

    mainMenu(entryInput);

    }

    public static void subtract() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        int entryInput = sc.nextInt();
        System.out.print("Enter second number:- ");
        int entryInput2 = sc.nextInt();
        System.out.println(entryInput - entryInput2);


        System.out.print("Would you to continue or quit:-\n1:- Continue\n0:- Quit\n:- ");
        int inputExit = sc.nextInt();
        if (inputExit == 0) {
            System.exit(0);
        } else if (inputExit == 1)
        {
            mainMenu(entryInput);
        }


    }
    public static void add() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        int entryInput = sc.nextInt();
        System.out.print("Enter second number:- ");
        int entryInput2 = sc.nextInt();
        System.out.println(entryInput + entryInput2);



        System.out.print("Would you to continue or quit:-\n1:- Continue\n0:- Quit\n:- ");
        int inputExit = sc.nextInt();
        if (inputExit == 0) {
            System.exit(0);
        } else if (inputExit == 1)
        {
            mainMenu(entryInput);
        }

    }

    public static void multiply() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        int entryInput = sc.nextInt();
        System.out.print("Enter second number:- ");
        int entryInput2 = sc.nextInt();
        System.out.println(entryInput*entryInput2);

        System.out.print("Would you to continue or quit:-\n1:- Continue\n0:- Quit\n:- ");
        int inputExit = sc.nextInt();
        if (inputExit == 0) {
            System.exit(0);
        } else if (inputExit == 1)
        {
            mainMenu(entryInput);
        }
    }

    public static void mainMenu(int entryInput){
        switch (entryInput) {
            case 1:
                add();
                break;
            case 2:
                subtract();
                break;
            case 3:
                multiply();
                break;
            case 0:
                break;
        }
    }



    public static void welcome(){
        System.out.println("Welcome, pick one of the options");




    }

}

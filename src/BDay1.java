import java.util.Scanner;

/*
Name: Duaa Shahzad
Date: 1/23/2023
Assignment: Birthday Guessing Game
Course Section: CSC-1120-02
*/

public class BDay1
{
    private static int birthday;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int value = 0;
        int card0;
        int card1;
        int card2;
        int card3;
        int card4;

        //display cards
        System.out.println("Is your birthday in Set1? \n 1 3 5 7 \n 9 11 13 15 \n 17 19 21 23 \n 25 27 29 31");
        System.out.println("Enter 0 for No and 1 for Yes: ");
        card0 = scan.nextInt();

        System.out.println("Is your birthday in Set2? \n 2 3 6 7 \n 10 11 14 15 \n 18 19 22 23 \n 26 27 30 31");
        System.out.println("Enter 0 for No and 1 for Yes: ");
        card1 = scan.nextInt();

        System.out.println("Is your birthday in Set3? \n 4 5 6 7 \n 12 13 14 15 \n 20 21 22 23 \n 28 29 30 31");
        System.out.println("Enter 0 for No and 1 for Yes: ");
        card2 = scan.nextInt();

        System.out.println("Is your birthday in Set4? \n 8 9 10 11 \n 12 13 14 15 \n 24 25 26 27 \n 28 29 30 31");
        System.out.println("Enter 0 for No and 1 for Yes: ");
        card3 = scan.nextInt();

        System.out.println("Is your birthday in Set5? \n 16 17 18 19 \n 20 21 22 23 \n 24 25 26 27 \n 28 29 30 31");
        System.out.println("Enter 0 for No and 1 for Yes: ");
        card4 = scan.nextInt();

        //calculate total
        if(card0 == 1)
        {
            value += 1;
        }
        if(card1 == 1)
        {
            value += 2;
        }
        if(card2 == 1)
        {
            value += 4;
        }
        if(card3 == 1)
        {
            value += 8;
        }
        if(card4 == 1)
        {
            value += 16;
        }

        //print birthday
        System.out.println("Your birthday is on: " + value + "!");

    }
}
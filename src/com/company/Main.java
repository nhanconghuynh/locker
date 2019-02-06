package com.company;

/* Write a program to simulate the following experiment. You have 100 closed lockers.
Start with the first locker and for every locker open it.
Now, starting with the second locker, for this locker and every second locker after that,
if the locker is open, close it; if it is closed, open it.
Then, starting with the third locker, for this locker and every third locker after that,
if the locker is open, close it; if it is closed, open it.
Continue with the nth locker changing the “position” of every nth locker until n = 100.
Print out the locker numbers that remain open. What do you notice about the lockers that remain open?
 */

public class Main {

    public static void main(String[] args) {

        boolean[] locker = new boolean[100];

//        for (int i=0; i<100; i++) {
//            locker[i] = false;
//        }

        for (int i = 0; i < 100; i++) {

            locker[i] = true;
        }

     for (int j=1; j<100; j++)
     {
         for (int i = j; i < 100; i=i+j+1) {
             if (locker[i] == true)
                 locker[i] = false;
             else if (locker[i] == false)
                 locker[i] = true;
         }
     }

     System.out.println("Lockers that remain open: ");
        for (int i=0; i<100; i++)
            if (locker[i] == true)
                System.out.print(i + " ");

    }
}

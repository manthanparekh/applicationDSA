/*
* Write a program that inserts 30 random integers from 0 - 100 in order
* in a linked list object. The program should calculate the sum of the element
* and the float of the average of the elements
* */

import java.util.Collections;
import java.util.Random;
import java.util.LinkedList;
class q1 {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<Integer>();
        Random rand_int = new Random();
        int randnum;
        int sum = 0;
        for(int i = 0; i < 30; i++) {
            randnum = rand_int.nextInt(101);
            myList.add(new Integer(randnum));
            sum+=randnum;
        }
        Collections.sort(myList);
        System.out.println(myList);
        System.out.println("Sumation: " + sum);
        System.out.println("Average: "+(float)sum/30);
    }
}


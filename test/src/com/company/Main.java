package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //you need this to get TEXT USER INPUT

        System.out.println("hello world"); //prints a new line at the end of the line (similar to WriteLine
        System.out.print("Type your name: "); //doesn't print a new line at the end (similar to Write)
        String name = input.nextLine(); // this is how to get string input. very similar to c#

        System.out.print("Type your age: ");
        int age = input.nextInt(); // .nextInt() grabs integer input



    }
}

package com.company;

import java.util.Scanner;

public class UserInput implements StringInterface {
    @Override
    public String generateString() {
        return null;
    }

    @Override
    public int getNumber() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of x in between 1 - 230 ");
        int x = scanner.nextInt();
        scanner.nextLine();
        while (x<1 || x>230){
            System.out.println("Enter the number in Valid range");
            x = scanner.nextInt();
            scanner.nextLine();

        }
        System.out.println("Value of X is " + x);

        return x;
        //return 0;
    }
}

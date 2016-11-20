/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparanator;

import java.util.Scanner;

/**
 *
 * @author aleksander
 */
public class Comparanator {

    //declare variables
    private String inputSum;
    private String errorMessage = "It seems that you have not inputted an MD5 sum. MD5 sums should hold 32 characters excluding whitespaces.";
    private String noMatch = "No match detected";
    private String isMatch = "Match detected";

    //construct two Sum objects
    Checksum sumOne = new Checksum();

    Checksum sumTwo = new Checksum();

    //construct input scanner
    Scanner input = new Scanner(System.in);

    //begin main user interaction method
    public void UserIO() {

        do {

            //first part of program
            do {

                System.out.println("Please input the first checksum: \n");

                //check if user input is MD5, print first sum if it is. otherwise print error message
                sumOne.setSum(input.nextLine());
                if (sumOne.checkIfMD5() == true) {
                    System.out.println(sumOne.getSum());

                } else {
                    System.out.println(errorMessage);

                }
            } while (sumOne.checkIfMD5() == false);

            //second part of program
            do {

                //ask for second sum
                System.out.println("Please input the second checksum:");

                //check if user input is MD5, print second sum if it is. otherwise print error message
                sumTwo.setSum(input.nextLine());
                if (sumTwo.checkIfMD5() == true) {
                    System.out.println(sumTwo.getSum());

                } else {
                    System.out.println(errorMessage);
                }
            } while (sumTwo.checkIfMD5() == false);
            //compare the sums and output the results, 

            if (sumOne.getSum().equals(sumTwo.getSum()) == true) {
                System.out.println(isMatch);

            } else {
                System.out.println(noMatch);

            }

            //set two checksums for comparison
            /*
        sumOne.setSum("md5checksum");
        sumTwo.setSum("md5checksum");
             */
            //compare the two by using while statement
        } while (tryAgain() == true);
    }

    public boolean tryAgain() {
        System.out.println("Enter y to compare again, anything else to end");
        return input.next().charAt(0) == 'y';
    }
}

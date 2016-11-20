/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparanator;

/**
 *
 * @author aleksander
 */
public class Checksum {

   
    private String Sum;

//getters and setters
    public String getSum() {
        return Sum;
    }
//remove all eventual whitespace from input then set global sum variable with result

    public void setSum(String Sum) {

        String sumNoSpace = Sum.replaceAll("\\s", "");
        this.Sum = sumNoSpace;

    }
//method for checking if sum is an MD5 by string length, return true or false

    public boolean checkIfMD5() {
        return (32 == this.Sum.length()); 
    }
}

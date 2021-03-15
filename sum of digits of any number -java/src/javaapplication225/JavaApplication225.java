/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication225;

import java.util.Scanner;




/**
 *
 * @author aasla
 */
public class JavaApplication225 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int number=input.nextInt();
    int total=0;
        do {
          total+=number%10;
          number=number/10;
        } while (number>0);
       System.out.println("sum of digits = "+ total);
  }
}

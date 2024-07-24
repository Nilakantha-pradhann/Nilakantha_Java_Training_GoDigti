/*
#############################################################################
******************
Date july 23-2024
@Nilakantha
******************
 Power of 2
a. Desc -> This program takes a command-line argument N and prints a table of the
powers of 2 that are less than or equal to 2^N.
b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
c. Logic -> repeat until i equals N.
################################################################################
 */

import java.util.Scanner;

public class Que6PowerOfTwo {

    public static int pow(int n){

        if(n==0){
            return 1;
        }


            return 2*pow(n-1);



    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Value of N ");
        int n= sc.nextInt();
        //System.out.println(PowerOfTwo.pow(n));
        if(n<31) {
            for (int i = 0; i <n; i++) {
                System.out.println("2^" + i + " = " + Que6PowerOfTwo.pow(i));
            }
        }
        else{
            System.out.println("Enter value less then 31");
        }
    }
}

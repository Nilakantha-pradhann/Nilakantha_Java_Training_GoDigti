/*
#################################################################################
******************
Date july 23-2024
@Nilakantha
******************
Flip Coin and print percentage of Heads and Tails
a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
b. Logic -> Use a Random Function to get a value between 0 and 1. If < 0.5 then tails or
Heads
c. O/P -> Percentage of Head vs Tails




##################################################################################
 */



import java.text.DecimalFormat;
import java.util.*;

public class Que4FlipCoin {

    public  void probability(int n){
         final DecimalFormat twodeci=new DecimalFormat("0.00"); // This acts as a formatter which limits the double value to 2  decimal places
double head=0.0; //initially head count and tail count will be 0
double tail=0.0;
        while(n>0){ //here this loop controls the number of exceution
            double a=Math.random(); //generate random number between 0-1(exclusive 1)

        if(a>0.50){ // checks is its value is less then .5
            head++;
            System.out.println("Its a head "+twodeci.format(a));
        }
        else{
            tail++;
            System.out.println("Its a tail "+twodeci.format(a));
        }
        n--; // decreasing n so that toss will be done N times
       }
        System.out.println("Out of "+(head+tail)+" Toss We got "+head+" head and "+tail+" tail");

        System.out.println("The head % is "+twodeci.format(((head/(head+tail))*100))+" \n"+"The tail % is "+twodeci.format(((tail/(head+tail))*100)));


    }

    public static void main(String[] args) {

Que4FlipCoin dice= new Que4FlipCoin();

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of tosses ");
        int a=sc.nextInt();
        System.out.print(a);
       if(a<=0){
           System.out.println("Cant be zero or less then it");

       }
       else{
           dice.probability(a);
       }

    }
}

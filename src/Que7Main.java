/*
#########################################
******************
Date july 23-2024
@Nilakantha
******************


#######################################
 */


import java.util.Scanner;

public class Que7Main {
    public static void main(String[] args) {

        Rectangle a= new Rectangle();
        Rectangle b= new Rectangle(2,8);
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Length of Rectangle ");
        double len=sc.nextDouble();
        System.out.print("Enter the Width of Rectangle ");
        double wid=sc.nextDouble();


        a.area(len,wid);
        a.perimeter(len,wid);
        b.area();
        b.perimeter();
    }

}
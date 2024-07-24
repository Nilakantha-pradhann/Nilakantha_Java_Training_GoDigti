/*
####################################################
******************
Date july 23-2024
@Nilakantha
******************

 Write a program to check if two strings are equal or not.


#####################################################



 */



import java.util.*;

public class Que3StringCheck {

    public static void Check(String a,String b){
if(a.equals(b)){
    System.out.println("The String "+a+" and "+ b+" are Same");
}


    else{
    System.out.println("The String "+a+" and "+ b+" are not Same");
    }}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the First String ");
String a=sc.nextLine();
        System.out.print("Enter the Second String ");
String b=sc.nextLine();;

Que3StringCheck.Check(a,b);
sc.close();
    }
}

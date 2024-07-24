
/*
######################################################
******************
Date july 23-2024
@Nilakantha
******************
5. Leap Year
a. I/P -> Year, ensure it is a 4-digit number.
b. Logic -> Determine if it is a Leap Year.
c. O/P -> Print the year as a Leap Year or not.
###################################################




 */
import java.util.*;
public class Que5LeapYear {

    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int year= sc.nextInt();
if(year<999){   // checks if the digit is a 4 digit number or not
    System.out.println("enter 4 digit Number");
}
else if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)){ // here is the logic for leap year where its should be divisble by 4 but not 100 and with one excpetion if its also div by 400

    System.out.println(year+ "  is a Leap Year");

}
else{
    System.out.println(year+" Is not a leap Year");
}

    }
}

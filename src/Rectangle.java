/*
##########################################################################
******************
Date july 23-2024
@Nilakantha
******************
Basic Class and Object problem statements:
1. Rectangle Class Implementation with Area and Perimeter Calculation
● Create a class Rectangle with fields length and width.
● Include methods to calculate the area and perimeter.
● Write a Main class to create objects of Rectangle, set their dimensions, and
display the area and perimeter.

###########################################################################
 */

public class Rectangle {
    double length;
    double width;

    public Rectangle() {

    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public void area(){
        System.out.println("The Area of Rectangle with length "+length+" and width "+width+" is "+length*width);
    }

    public void area(double length, double width){
        System.out.println("The Area of Rectangle with length "+length+" and width "+width+" is "+length*width);
    }
    public void perimeter(double length,double width){
        System.out.println("The Perimeter of Rectangle with length "+length+" and width "+width+" is "+2*(length+width));
    }
    public void perimeter(){
        System.out.println("The perimeter of Rectangle with length "+length+" and width "+width+" is "+2*(length+width));
    }

//    public static void main(String[] args) {
//        Rectangle a= new Rectangle();
//
//        a.area(2.5,3.9);
//        a.perimeter(2,3);
//    }

}

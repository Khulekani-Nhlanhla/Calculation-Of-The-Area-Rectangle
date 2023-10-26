import java.util.Scanner;

public class AreaOfRectangle {
     double sideHeight;
     double sideBase;
     double areaOfRectangle;

    public void getData(){
        Scanner Sc = new Scanner(System.in);
        System.out.println("This program calculates the area of a triangle.(base * height)/2");
        System.out.println("Please enter the size of base:");
        sideBase = Sc.nextInt();
        System.out.println("Please enter the size of height:");
        sideHeight = Sc.nextInt();


    }

    public double computeField(){
        areaOfRectangle = sideBase * sideHeight;
        return areaOfRectangle;
    }
    public void fieldDisplay(){
        System.out.println("The area of this triangle is: " + computeField());
    }
}

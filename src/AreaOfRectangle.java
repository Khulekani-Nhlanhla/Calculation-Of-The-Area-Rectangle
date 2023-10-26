public class AreaOfRectangle {
    public static double sideHeight;
    public static double sideBase;
    public static double areaOfRectangle;

    public static void getData(double b, double h){
         sideHeight = h;
         sideBase = b;

    }

    public static double computeField(){
        areaOfRectangle = ((sideHeight*sideBase)/2);
        return areaOfRectangle;
    }
    public static  void fieldDisplay(){
        System.out.println("The area of this triangle is: " + computeField());
    }
}

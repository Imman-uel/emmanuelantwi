import java.util.Scanner;
public class AreaCircumference {

    //A method that calculates the area and circumference of a circle
    public void AreaCircumference(int radius) {
        double pi = 3.14159;
        double Area =pi * (radius *radius);
        double circumference = 2 * pi * radius;

        System.out.println("The area of the circle is " + Math.round(Area*100)/100.f);
        System.out.println("Circumference of the circle is " + Math.round(circumference*100)/100f);
    }


    public static void main(String[] args) {
        AreaCircumference areaCirc = new AreaCircumference();
        //Take user input
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter the radius: ");
        int radius = reader.nextInt();
        areaCirc.AreaCircumference(radius);

    }
}

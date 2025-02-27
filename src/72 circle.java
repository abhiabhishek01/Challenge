import java.util.Scanner;

class circle {

    double radiusInMm;

    circle(double radiusInMm){
        this.radiusInMm = radiusInMm;
    }

    double getCircumference(){
        return 2*radiusInMm*Math.PI;
    }

    double getArea(){
        return Math.PI*Math.pow(radiusInMm,2);
    }

    @Override
    public String toString() {
        return "Circle props: Radius in mm: " + radiusInMm
                + " | circumference in mm: " + getCircumference()
                + " | Area in mm2: " + getArea();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the world of circle: ");
        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();
        circle circle = new circle(radius);
        System.out.println(circle);

    }
}

package Lab_5.Program_5;

interface shape {
    final double PI = 3.141;

    double area();

    double volume();
}

class Cylinder implements shape {
    double radius;
    double height;

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    public double area() {
        return 2 * PI * radius * height;
    }

    public double volume() {
        return PI * radius * radius * height;
    }
}

class Cone implements shape {
    double radius;
    double height;

    Cone(double r, double h) {
        radius = r;
        height = h;
    }

    public double area() {
        return PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }

    public double volume() {
        return PI * radius * radius * height / 3;
    }
}

public class Volume {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(3, 4);
        Cone co = new Cone(2, 3);
        System.out.println("Area of Cylinder: " + c.area());
        System.out.println("Volume of Cylinder: " + c.volume());
        System.out.println("Area of Cone: " + co.area());
        System.out.println("Volume of Cone: " + co.volume());
    }
}
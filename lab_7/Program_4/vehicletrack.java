// On a single track two vehicles are running. As vehicles are going in same direction there is no problem. If the vehicles are running in different direction there is a chance of collision. To avoid collisions write a Java program using exception handling. You are free to make necessary assumptions.

package lab_7.Program_4;

class vehicle {
    public int direction;

    public vehicle(int direction) {
        this.direction = direction;
    }
}

public class vehicletrack {
    public static boolean checkCollision(vehicle a, vehicle b) {
        if (a.direction != b.direction) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws CollisionException {
        vehicle a = new vehicle(0);
        vehicle b = new vehicle(0);
        vehicle c = new vehicle(1);
        if (checkCollision(a, b)) {
            System.out.println("track is good");
        } else {
            throw new CollisionException("Collision is iminent");
        }
        if (checkCollision(a, c)) {
            System.out.println("track is good");
        } else {
            throw new CollisionException("Collision is iminent");
        }
    }
}

class CollisionException extends Exception {
    public CollisionException(String msg) {
        super(msg);
    }
}

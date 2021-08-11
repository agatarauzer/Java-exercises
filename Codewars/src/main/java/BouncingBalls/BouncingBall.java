package BouncingBalls;

public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {
        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) return -1;
        int counter = -1;
        while (h > window) {
            counter += 2;
            h *= bounce;
        }
        return counter;
    }
}

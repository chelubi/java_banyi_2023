/**
 * Бані, компмех, завдання 3.3, лаба 4
 * @author oleksandrbani
 * @version 1.0
 */


package HWs;

public class QuadraticEquation {
    private double a, b, c; // коефіцієнти рівняння ax^2 + bx + c = 0

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double discriminant() {
        return b * b - 4 * a * c;
    }

    public double[] findRoots() {
        double d = discriminant();
        if (d < 0) return new double[]{}; 
        if (d == 0) return new double[]{-b / (2 * a)}; 
        double sqrtD = Math.sqrt(d);
        return new double[]{
            (-b + sqrtD) / (2 * a),
            (-b - sqrtD) / (2 * a)
        };
    }


    @Override
    public String toString() {
        return "QuadraticEquation{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
}

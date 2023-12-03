/**
 * Бані, компмех, завдання 3.3, лаба 4
 * @author oleksandrbani
 * @version 1.0
 */


package HWs;

import java.util.ArrayList;
import java.util.List;

public class HW8__3_3 {
    public static void main(String[] args) {
        List<QuadraticEquation> equations = new ArrayList<>();
        equations.add(new QuadraticEquation(1, -3, 2));
        equations.add(new QuadraticEquation(1, -2, 1));

        double maxRoot = Double.MIN_VALUE;
        double minRoot = Double.MAX_VALUE;

        for (QuadraticEquation equation : equations) {
            double[] roots = equation.findRoots();
            for (double root : roots) {
                if (root > maxRoot) maxRoot = root;
                if (root < minRoot) minRoot = root;
            }
        }

        System.out.println("найбільший корінь: " + maxRoot);
        System.out.println("найменший корінь: " + minRoot);
    }
}
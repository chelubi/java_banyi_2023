/**
 * Бані, компмех, завдання 1.3, лаба 3
 * @author oleksandrbani
 * @version 1.0
 */



package CW5;

import java.util.Scanner;

public class CW5__1_3 {
    static public void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.println("amount of values: ");
        int n = scan.nextInt();
        System.out.println("values separated by space: ");
        int n_arr[] = new int[n];
        for (int i = 0; i < n; i++){
            n_arr[i] = scan.nextInt();
        }
        
       scan.close();
        
        double m  = mean(n_arr);
        System.out.println("Mean is: " + m);
        double ssd = ssd(n_arr);
        System.out.println("ssd is: " + ssd);

    }

    static public double mean(int arr[]){

        double s = 0;
        for (int i = 0; i < arr.length; i++){
            s += arr[i];
        }
        return s / arr.length;

    }

    static public double ssd(int arr[]){

        double m = mean(arr);
        double s = 0;
        for (int i = 0; i < arr.length; i++){
            s += ((arr[i] - m) * (arr[i] - m));
        }
        return s / arr.length;

    }
}

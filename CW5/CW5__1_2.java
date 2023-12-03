/**
 * Бані, компмех, завдання 1.2, лаба 3
 * @author oleksandrbani
 * @version 1.0
 */



package CW5;

import java.util.Scanner;

public class CW5__1_2 {
    static public void main(String args[]){

        int n_arr[] = new int[10000];
        Scanner scan = new Scanner(System.in);
        int num = 1;
        int ind = 0;

        System.out.println("enter ints with 0 end: ");
        while (num != 0){
            n_arr[ind] = scan.nextInt();
            num = n_arr[ind];
            ind++;
        }
        scan.close();
        max(n_arr);
        min(n_arr);      
    }

    static void min(int arr[]){  

        int min = arr[0];  
        for(int i = 1; i < arr.length; i++){

            if (min > arr[i])
            min = arr[i];
            
        }
        System.out.println("min: " + min);

    }
    
    static void max(int arr[]){  

        int max = arr[0];  
        for(int i = 1; i < arr.length; i++){

            if (max < arr[i])
            max = arr[i];
            
        } 
        System.out.println("max: " + max);
    }
}

/**
 * Бані, компмех, завдання 1.4, лаба 3
 * @author oleksandrbani
 * @version 1.0
 */



package CW5;

import java.util.Scanner;

public class CW5__1_4 {
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
	        
	        int max_num = n_arr[0];
	        int tmp = n_arr[0];
	        int count = 1;
	        int max_count = 1;
	        for (int i = 1; i < n_arr.length; i++) {

	            if (n_arr[i] == tmp) {
	                count++;
	            } else {
	                tmp = n_arr[i];
	                count = 1;
	            }
	        
	            if (count > max_count) {
	                max_count = count;
	                max_num = tmp;
	            } else if (count == max_count && tmp > max_num) {
	                max_num = tmp;
	            }
	        }
	        System.out.printf("%d times in a row value \"%d\" has revealed.\n", max_count, max_num);  
	    }
}

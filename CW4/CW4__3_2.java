/**
 * Бані, компмех, завдання 3.2, лаба 2
 * @author oleksandrbani
 * @version 1.0
 */


package CWs.CW4;

import java.util.Random;

public class CW4__3_2 {
    public static void main(String[] args) 
    {

        int rand_nums[] = new int [25];
        Random rand_gen = new Random();
        System.out.print("nums generated: \n");
        for (int i = 0; i < 25; i++){
            rand_nums[i] = rand_gen.nextInt(99 + 100) - 99;
            System.out.print(rand_nums[i] + ", ");
    } 
        
        System.out.print("\n");
        String tab_s = "";
        for (int i = 0; i < 25; i++){
            System.out.printf("%s|", tab_s);
            for (int j = i; j < 25; j++){
                if (rand_nums[i] > rand_nums[j]){
                    System.out.printf("%3d>%3d|",rand_nums[i] ,rand_nums[j]);
                } else if (rand_nums[i] < rand_nums[j]){
                    System.out.printf("%3d<%3d|",rand_nums[i] ,rand_nums[j]);
                } else {
                    System.out.printf("%3d=%3d|",rand_nums[i] ,rand_nums[j]);
                }
            }
            System.out.print("\n");
            tab_s += "        ";
        }
    }
}

/**
 * Бані, компмех, завдання 3.5, лаба 2
 * @author oleksandrbani
 * @version 1.0
 */


package CWs.CW4;

public class CW4__3_5 {
    public static void main(String[] args) {

        int nums[] = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < 5; i++){
            for (int j = i + 1; j < 5; j++){
                if (nums[i] < nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }  
        System.out.println("mediana: " + nums[2]);
    }
}

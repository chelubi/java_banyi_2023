/**
 * Бані, компмех, завдання 1.4, лаба 3
 * @author oleksandrbani
 * @version 1.0
 */


package CW8;

public class CW8__4_1 {
	    
	    public static void main(String[] args) {
	        
	        do {

	            Connection connection = ConnectionManager.getConnection();
	            System.out.println("Got connection: " + (ConnectionManager.connectionIndex - 1));

	        } while (true);

	    }

	}

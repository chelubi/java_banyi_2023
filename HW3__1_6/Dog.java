/**
 * Бані, компмех, завдання 1.6, лаба 2
 * @author oleksandrbani
 * @version 1.0
 */


package HWs;

public class Dog {
	    private String name;
	    private String say;

	    public Dog(String name, String say) {
	        this.name = name;
	        this.say = say;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getSay() {
	        return say;
	    }

	    public static void main(String[] args) {
	        Dog spot = new Dog("spot", "Ruff!");
	        Dog scruffy = new Dog("scruffy", "Wurf!");

	        System.out.printf("Name of first dog - %s\n", spot.getName());
	        System.out.printf("%s says %s\n", spot.getName(), spot.getSay());
	        System.out.printf("Name of second dog - %s\n", scruffy.getName());
	        System.out.printf("%s says %s\n", scruffy.getName(), scruffy.getSay());

	        System.out.printf("spot == scruffy: %b\n", (spot == scruffy));
	        System.out.printf("spot.equals(scruffy): %b\n", spot.equals(scruffy));

	        Dog spot_copy = spot;

	        System.out.printf("spot == spot_copy: %b\n", (spot == spot_copy));
	        System.out.printf("spot.equals(spot_copy): %b\n", spot.equals(spot_copy));
	    }
	}


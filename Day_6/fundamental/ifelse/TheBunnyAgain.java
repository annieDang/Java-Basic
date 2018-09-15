package Day_6.fundamental.ifelse;

public class TheBunnyAgain {
	public static void main(String args[]) {
		int ageOfBunny = 9;
		int averageAgeOfBunny = 5;
		
		// Check if the Bunny is old
		if (ageOfBunny < 0) {
			System.out.println("He died?");
		} else if (ageOfBunny < averageAgeOfBunny) {
			System.out.println("Cool! He isn't really old!");
		} else {
			System.out.println("hmm... Pretty old bunny. Is he going to die soo?");
		}
	}
}

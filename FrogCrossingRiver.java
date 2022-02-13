package lab;

public class FrogCrossingRiver {
	
	public static void main(String[] args) {
		int numberOfFeet = 11;
        System.out.println("There are " + numberOfWays(numberOfFeet) + " ways for the frog to cross the river at a distance of " + 
		numberOfFeet + " feet.");
    }

    public static int numberOfWays(int n) {
        if (n == 1) {
        	return 1;
        }
        if (n == 2) {
        	return 2;
        }
        
        
        return numberOfWays(n-1) + numberOfWays(n-2);
    }
}

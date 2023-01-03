
import java.util.ArrayList;
public class isPrime {
	static ArrayList<String> primes = new ArrayList<>();
	static void numPrime(int nValues) {
		boolean isprime = true;
		for (int i = 2; i <= nValues; i++) {

			isprime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isprime = false;
					break;
				}
			}
			if (isprime) {
				primes.add(String.valueOf(i));
				//primes.removeAll(null);
				
				}
			}
			System.out.println(primes);
		}
	static void getTable(ArrayList<String> temp) {
	int rows = (int) Math.ceil((primes.size() / 5));
	}
	


	public static void main(String[] args) {
		isPrime.numPrime(50);
		//isPrime.getTable(primes);
 
	}
}

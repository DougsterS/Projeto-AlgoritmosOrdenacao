package auxiliares;

import java.util.Random;

public class RandomizarVetor {
	
	public static void randomizar(int [] array) {
		Random r = new Random();
		for(int i = 0; i<array.length; i++) {
			array[i] = r.nextInt();
		}
	}
}

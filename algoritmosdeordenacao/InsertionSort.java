package algoritmosdeordenacao;

public class InsertionSort {
	
	public void organizar(int vetor[]) {
		for(int i = 0; i < vetor.length; i++) {
			int aux = vetor[i];
			for(int j = i-1; j >=0 && vetor[j] > aux; j--) {
				vetor[j+1] = vetor[j];
				vetor[j] = aux;
			}
		}
	}
}

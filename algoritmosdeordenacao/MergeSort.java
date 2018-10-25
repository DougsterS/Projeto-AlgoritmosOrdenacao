package algoritmosdeordenacao;

public class MergeSort {
	
	public void organizar(int vetor[], int inicio, int fim) {
		if(inicio < fim) {
			int aux = (inicio+fim)/2;
			
			organizar(vetor,inicio,aux);
			organizar(vetor,aux+1,fim);
			intercalar(vetor,inicio,aux,fim);
		}	
	}
	
	public void intercalar(int vetor[],int inicio, int aux, int fim) {
		
		int vetorzinho[] = new int[vetor.length];
		
		for(int j = inicio; j<= aux; j++) {
			vetorzinho[j] = vetor[j];
		}
		
		for(int y = aux+1; y<fim;y++) {
			vetorzinho[fim+aux-y] = vetor[y];
		}
		int x = inicio;
		int z = fim-1;
		
		for(int seila = inicio; seila<fim; seila++) {
			if(vetorzinho[x] <= vetorzinho[z]) {
				vetor[seila] = vetorzinho[x];
				x = x+1;
			} else {
				vetor[seila] = vetorzinho[z];
				z = z-1;
			}
		}
	}

}

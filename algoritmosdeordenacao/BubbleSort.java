package algoritmosdeordenacao;

public class BubbleSort{
	
	public void organizar(int vetor[]) {
		int aux = 0;
		for(int i = 0; i<vetor.length; i++) {
			for (int j = 0; j<vetor.length-1;j++){
				if(vetor[j] > vetor[j+1]){
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
		}
	}
}

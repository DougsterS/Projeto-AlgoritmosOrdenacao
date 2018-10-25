package algoritmosdeordenacao;


public class QuickSort {
	
	 private int vetor[];
	    private int length;
	 
	    public void organizar(int[] array) {
	         
	        if (array == null || array.length == 0) {
	            return;
	        }
	        this.vetor = array;
	        length = array.length;
	        quickSort(0, length - 1);
	    }
	 
	    private void quickSort(int inicio, int fim) {
	         
	        int i = inicio;
	        int j = fim;
	        int pivo = vetor[inicio+(fim-inicio)/2];
	        while (i <= j) {
	            while (vetor[i] < pivo) {
	                i++;
	            }
	            while (vetor[j] > pivo) {
	                j--;
	            }
	            if (i <= j) {
	                exchangeNumbers(i, j);
	                i++;
	                j--;
	            }
	        }
	        if (inicio < j)
	            quickSort(inicio, j);
	        if (i < fim)
	            quickSort(i, fim);
	    }
	 
	    private void exchangeNumbers(int i, int j) {
	        int temp = vetor[i];
	        vetor[i] = vetor[j];
	        vetor[j] = temp;
	    }
	     
	
	
}
package principal;

import java.io.IOException;
import java.util.Random;
import algoritmosdeordenacao.BubbleSort;
import algoritmosdeordenacao.InsertionSort;
import algoritmosdeordenacao.MergeSort;
import algoritmosdeordenacao.QuickSort;
import algoritmosdeordenacao.SelectionSort;

public class TestedeVetores {
	
	public static void randomizar(int [] array) {
		Random r = new Random();
		for(int i = 0; i<array.length; i++) {
			array[i] = r.nextInt();
		}
	}
	
	public static double execucao(long x, long y) {
		return((y-x)/1000.0);
	}
	
	public static void main(String[] args) throws IOException {
		BubbleSort bolha = new BubbleSort();
		SelectionSort selecao = new SelectionSort();
		InsertionSort insercao = new InsertionSort();
		MergeSort merge = new MergeSort();
		QuickSort rapido = new QuickSort();
		long inicio;
		long fim;
		
		int array[] = new int[100];
		randomizar(array);
		int aux[] = array;
		
		System.out.println("--Teste de Velocidades--\n\n");
		System.out.println("Array 100:");
		
		inicio = System.currentTimeMillis();
		bolha.organizar(array);
		fim = System.currentTimeMillis();
		System.out.println("Bubble Sort: " + execucao(inicio,fim) + "mls");
		
		array = aux;
		inicio = System.currentTimeMillis();
		selecao.organizar(array);
		fim = System.currentTimeMillis();
		System.out.println("Selection Sort: " + execucao(inicio,fim) +"mls");
		
		array = aux;
		inicio = System.currentTimeMillis();
		insercao.organizar(array);
		fim = System.currentTimeMillis();
		System.out.println("Insertion Sort: " + execucao(inicio,fim) +"mls");
		
		array = aux;
		inicio = System.currentTimeMillis();
		merge.organizar(array,0,100);
		fim = System.currentTimeMillis();
		System.out.println("Merge Sort: " + execucao(inicio,fim) +"mls");
		
		array = aux;
		inicio = System.currentTimeMillis();
		rapido.organizar(array);
		fim = System.currentTimeMillis();
		System.out.println("Quick Sort: " + execucao(inicio,fim) +"mls");
		System.out.println("\n\n");
		
		System.out.println("Array 1.000");
		array = new int[1000];
		randomizar(array);
		aux = array;
		
		inicio = System.currentTimeMillis();
		bolha.organizar(array);
		fim = System.currentTimeMillis();
		System.out.println("Bubble Sort: " + execucao(inicio,fim) + "mls");
		
		array = aux;
		inicio = System.currentTimeMillis();
		selecao.organizar(array);
		fim = System.currentTimeMillis();
		System.out.println("Selection Sort: " + execucao(inicio,fim) +"mls");
		
		array = aux;
		inicio = System.currentTimeMillis();
		insercao.organizar(array);
		fim = System.currentTimeMillis();
		System.out.println("Insertion Sort: " + execucao(inicio,fim) +"mls");
		
		array = aux;
		inicio = System.currentTimeMillis();
		merge.organizar(array,0,1000);
		fim = System.currentTimeMillis();
		System.out.println("Merge Sort: " + execucao(inicio,fim) +"mls");
		
		array = aux;
		inicio = System.currentTimeMillis();
		rapido.organizar(array);
		fim = System.currentTimeMillis();
		System.out.println("Quick Sort: " + execucao(inicio,fim) +"mls");
		System.out.println("\n\n");
		
		System.out.println("Array 5.000");
		array = new int[5000];
		randomizar(array);
		aux = array;
		
		inicio = System.currentTimeMillis();
		bolha.organizar(array);
		fim = System.currentTimeMillis();
		System.out.println("Bubble Sort: " + execucao(inicio,fim) + "mls");
		
		array = aux;
		inicio = System.currentTimeMillis();
		selecao.organizar(array);
		fim = System.currentTimeMillis();
		System.out.println("Selection Sort: " + execucao(inicio,fim) +"mls");
		
		array = aux;
		inicio = System.currentTimeMillis();
		insercao.organizar(array);
		fim = System.currentTimeMillis();
		System.out.println("Insertion Sort: " + execucao(inicio,fim) +"mls");
		
		array = aux;
		inicio = System.currentTimeMillis();
		merge.organizar(array,0,5000);
		fim = System.currentTimeMillis();
		System.out.println("Merge Sort: " + execucao(inicio,fim) +"mls");
		
		array = aux;
		inicio = System.currentTimeMillis();
		rapido.organizar(array);
		fim = System.currentTimeMillis();
		System.out.println("Quick Sort: " + execucao(inicio,fim) +"mls");
		System.out.println("\n\n");
		
		System.out.println("Array 10.000");
		array = new int[10000];
		randomizar(array);
		aux = array;
		
		inicio = System.currentTimeMillis();
		bolha.organizar(array);
		fim = System.currentTimeMillis();
		System.out.println("Bubble Sort: " + execucao(inicio,fim) + "mls");
		
		array = aux;
		inicio = System.currentTimeMillis();
		selecao.organizar(array);
		fim = System.currentTimeMillis();
		System.out.println("Selection Sort: " + execucao(inicio,fim) +"mls");
		
		array = aux;
		inicio = System.currentTimeMillis();
		insercao.organizar(array);
		fim = System.currentTimeMillis();
		System.out.println("Insertion Sort: " + execucao(inicio,fim) +"mls");
		
		array = aux;
		inicio = System.currentTimeMillis();
		merge.organizar(array,0,10000);
		fim = System.currentTimeMillis();
		System.out.println("Merge Sort: " + execucao(inicio,fim) +"mls");
		
		array = aux;
		inicio = System.currentTimeMillis();
		rapido.organizar(array);
		fim = System.currentTimeMillis();
		System.out.println("Quick Sort: " + execucao(inicio,fim) +"mls");
		System.out.println("\n\n");
		
		System.out.println("Array 50.000");
		array = new int[50000];
		randomizar(array);
		aux = array;
		
		inicio = System.currentTimeMillis();
		bolha.organizar(array);
		fim = System.currentTimeMillis();
		System.out.println("Bubble Sort: " + execucao(inicio,fim) + "mls");
		
		array = aux;
		inicio = System.currentTimeMillis();
		selecao.organizar(array);
		fim = System.currentTimeMillis();
		System.out.println("Selection Sort: " + execucao(inicio,fim) +"mls");
		
		array = aux;
		inicio = System.currentTimeMillis();
		insercao.organizar(array);
		fim = System.currentTimeMillis();
		System.out.println("Insertion Sort: " + execucao(inicio,fim) +"mls");
		
		array = aux;
		inicio = System.currentTimeMillis();
		merge.organizar(array,0,50000);
		fim = System.currentTimeMillis();
		System.out.println("Merge Sort: " + execucao(inicio,fim) +"mls");
		
		array = aux;
		inicio = System.currentTimeMillis();
		rapido.organizar(array);
		fim = System.currentTimeMillis();
		System.out.println("Quick Sort: " + execucao(inicio,fim) +"mls");
		System.out.println("\n\n");
		System.out.println("Experimento finalizado!!!!");
	}

}

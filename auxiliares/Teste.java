package auxiliares;

import algoritmosdeordenacao.BubbleSort;
import algoritmosdeordenacao.InsertionSort;
import algoritmosdeordenacao.MergeSort;
import algoritmosdeordenacao.QuickSort;
import algoritmosdeordenacao.SelectionSort;

public class Teste {
	
	public void testar(int x) {
		
		BubbleSort bolha = new BubbleSort();
		SelectionSort selecao = new SelectionSort();
		InsertionSort insercao = new InsertionSort();
		MergeSort merge = new MergeSort();
		QuickSort rapido = new QuickSort();
		RandomizarVetor r = new RandomizarVetor();
		tempoExecucao exe = new tempoExecucao();
		int array[] = new int[x];
		r.randomizar(array);
		int aux[] = array.clone();
		long inicio;
		long fim;
		
		System.out.println("Array " + x + ":");
		
		inicio = System.currentTimeMillis();
		bolha.organizar(array);
		fim = System.currentTimeMillis();
		System.out.println("Bubble Sort: " + exe.execucao(inicio,fim) + "segs");
		
		array = aux.clone();
		inicio = System.currentTimeMillis();
		selecao.organizar(array);
		fim = System.currentTimeMillis();
		System.out.println("Selection Sort: " + exe.execucao(inicio,fim) +"segs");
		
		array = aux.clone();
		inicio = System.currentTimeMillis();
		insercao.organizar(array);
		fim = System.currentTimeMillis();
		System.out.println("Insertion Sort: " + exe.execucao(inicio,fim) +"segs");
		
		array = aux.clone();
		inicio = System.currentTimeMillis();
		merge.organizar(array);
		fim = System.currentTimeMillis();
		System.out.println("Merge Sort: " + exe.execucao(inicio,fim) +"segs");
		
		array = aux.clone();
		inicio = System.currentTimeMillis();
		rapido.organizar(array);
		fim = System.currentTimeMillis();
		System.out.println("Quick Sort: " + exe.execucao(inicio,fim) +"segs");
	}

}

package principal;

import auxiliares.Teste;

public class TestedeVetores {
	
	public static void main(String[] args) {
		Teste t = new Teste();
		
		System.out.println("--Teste de Velocidade--\n");
		t.testar(100);
		System.out.println("\n");
		t.testar(1000);
		System.out.println("\n");
		t.testar(5000);
		System.out.println("\n");
		t.testar(10000);
		System.out.println("\n");
		t.testar(50000);
		System.out.println("\n--Experimento Finalizado com Êxito--");
	}

}

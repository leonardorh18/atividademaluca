class Main {
	public static void main(String[] args) {
	
	int tamanho = 100; 
	int armazena[] = new int[tamanho];
	primos(armazena);
	}

	public static void primos(int[] lista) {
		int qtdPrimes = 0;
		int divisiveisPorDois = 0;
		int tresEcinco = 0;

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == 0) {
				break;
			}
			boolean flag = false;
			for (int j = 2; j <= i / 2; j++) {
				if (lista[i] % j == 0) {
					if (j == 2) {
						divisiveisPorDois++;
					}
					if (i % 3 == 0 && i % 5 == 0) {
						tresEcinco++;
					}
					flag = true;
					break;
				}
			}

			if (!flag) {
				qtdPrimes++;
			}
		}
		System.out.println("primos = " + qtdPrimes);
		System.out.println("Divisiveis por 2: " + divisiveisPorDois);
		System.out.println("Divisiveis por 3 e 5: " + tresEcinco);
	}
}

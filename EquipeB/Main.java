class Main {
	public static void main(String[] args) {
	
	int tamanho = 100; 
	int armazena[] = new int[tamanho];

	System.out.println("Maior: " + maior(armazena));
	System.out.println("Menor: " + menor(armazena));
	System.out.println("Media: " + media(armazena));
	System.out.println("QTD Primos: " + primos(armazena));

	}

	public static int maior(int[] lista) {
		int maior = -9999999;

		for (int i = 0; i < lista.length; i++) {
			if(lista[i] > maior) {
				maior = lista[i];
			}
		}
		return maior;
	}

	public static int menor(int[] lista) {
		int menor = 9999999;

		for (int i = 0; i < lista.length; i++) {
			if(lista[i] < menor) {
				menor = lista[i];
			}
		}
		return menor;
	}

	public static int media(int[] lista) {
		int media = 0;

		for (int i = 0; i < lista.length; i++) {
			media += lista[i];
		}
		return media/lista.length;
	}

	public static int primos(int[] lista) {
		int qtdPrimes = 0;

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == 0){
				break;
			}
			boolean flag = false;
			for (int j = 2; j <= i / 2; j++) {
				if (lista[i] % j == 0) {
					flag = true;
					break;
				}
			}

			if (!flag) {
				qtdPrimes++;
			}
		}
		return qtdPrimes;
	}
}

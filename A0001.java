class Main {
	public static void main(String[] args) {
	int armazena[] = new int[20];

	System.out.println(maior(armazena));
	System.out.println(menor(armazena));

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
}

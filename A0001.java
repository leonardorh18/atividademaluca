class Main {
  public static void main(String[] args) {
    int armazena[] = new int[20];
	int maior = -9999999;
	int menor = 99999999;

	for (int i = 0; i < armazena.length; i++) {
		if(armazena[i] > maior) {
			maior = armazena[i];
		}
		if(armazena[i] < menor) {
			menor = armazena[i];
		}
	}
  }
}

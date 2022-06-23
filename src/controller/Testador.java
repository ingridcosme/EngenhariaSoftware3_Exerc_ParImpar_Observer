package controller;

public class Testador implements ITestador, IObservador {

	@Override
	public void update(int numero) {
		testar(numero);
	}

	@Override
	public void testar(int numero) {
		if(numero % 2 == 0) {
			System.out.println(numero + " é par");
		} else {
			System.out.println(numero + " é ímpar");
		}
	}

}

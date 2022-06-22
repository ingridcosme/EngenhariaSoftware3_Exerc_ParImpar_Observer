package controller;

public class Testador implements ITestador, IObservador {

	@Override
	public void update(String acao, int numero) {
		if(acao.equals("gerado")) {
			testar(numero);
		}
	}

	@Override
	public void testar(int numero) {
		if(numero % 2 == 0) {
			System.out.println(numero + " � par");
		} else {
			System.out.println(numero + " � �mpar");
		}
	}

}

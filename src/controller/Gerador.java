package controller;

public class Gerador implements IGerador, IObservado {

	private int numero;
	private Testador testador;
	
	public Gerador(Testador testador) {
		this.testador = testador;
	}

	@Override
	public void notificaMudanca(int numero) {
		testador.update(numero);
	}

	@Override
	public void gerar(int min, int max) {
		numero = (int)((Math.random() * (max - min + 1)) + min);
		notificaMudanca(numero);
	}
	
	
}

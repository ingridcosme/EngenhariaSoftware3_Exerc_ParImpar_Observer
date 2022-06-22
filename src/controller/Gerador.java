package controller;

public class Gerador implements IGerador, IObservado {

	private String acao;
	private Testador testador;
	
	public Gerador(Testador testador) {
		this.testador = testador;
	}

	@Override
	public void notificaMudanca(String acao, int numero) {
		testador.update(acao, numero);
	}

	@Override
	public void gerar(int min, int max) {
		acao = "gerado";
		int numero = (int)((Math.random() * (max - min + 1)) + min);
		notificaMudanca(acao, numero);
	}
	
	
}

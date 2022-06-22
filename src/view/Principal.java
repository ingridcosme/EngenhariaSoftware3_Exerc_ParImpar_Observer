package view;

import controller.Gerador;
import controller.Testador;

public class Principal {

	public static void main(String[] args) {
		Testador t = new Testador();
		Gerador g = new Gerador(t);
		
		g.gerar(0, 1000);
		g.gerar(0, 1000);
		g.gerar(0, 1000);
		g.gerar(0, 1000);
		g.gerar(0, 1000);
		g.gerar(0, 1000);
		g.gerar(0, 1000);

	}

}

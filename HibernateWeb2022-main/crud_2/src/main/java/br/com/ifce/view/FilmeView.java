package br.com.ifce.view;

import br.com.ifce.controller.FilmeController;
import br.com.ifce.model.Filme;

public class FilmeView {

	public static void main(String[] args) {
		FilmeController filmeController = new FilmeController();

		Filme filme = filmeController.buscarFilmePorIdController((long) 1);

		Filme filme1 = new Filme();

		filme1.setTitulo("Karate Kid");
		filme1.setCategoria("Drama Romantico");
		filme1.setPreco(50);
		filme1.setDuracaoMinutos(140);
		filme1.setDataLançamento("27/08/2010");
		filme1.setId(1);

		filmeController.adicionarController(filme1);
		filme1.setTitulo("Karate Kid");
		filme1.setCategoria("Drama Romantico");
		filme1.setPreco(50);
		filme1.setDuracaoMinutos(140);
		filme1.setDataLançamento("27/08/2010");
		filme1.setId(1);
		
		
		

		Filme filme2 = new Filme();
		
		filme2.setTitulo("Madagascar");
		filme2.setPreco(30);
		filme2.setCategoria("Animacao");
		filme2.setDuracaoMinutos(93);
		filme2.setDataLançamento("24/06/2005");
		filme2.setId(2);

		filmeController.adicionarController(filme2);
		
		// Remover
		// filmeController.removerController((long) 1);

		// Adicionar
		// Filme filme1 = new Filme();

		// filme1.setTitulo("Karate Kid");
		// filme1.setCategoria("Drama Romantico");
		// filme1.setPreco(50);
		// filme1.setDuracao(140);
		// filme1.setData("27/08/2010");

		// filmeController.adicionarController(filme1);

	}
	
}
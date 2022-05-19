package br.com.ifce.controller;

import java.util.List;
import br.com.ifce.model.Filme;
import br.com.ifce.service.FilmeService;


public class FilmeController {
	
	private FilmeService filmeService = new FilmeService();
	
	public void adicionarController(Filme filme) {
		filmeService.adicionarService(filme);
	}
	
	public void removerController (Long id) {
		filmeService.removerService(id);
	}
	
	public void alterarController (Filme filme) {
		filmeService.adicionarService(filme);
	}
	
	public List<Filme> listarController(){
		return filmeService.listarService();
	}
	
	public Filme buscarFilmePorIdController(Long id) {
		return filmeService.buscarFilmePorIdService(id);
	}
	

}
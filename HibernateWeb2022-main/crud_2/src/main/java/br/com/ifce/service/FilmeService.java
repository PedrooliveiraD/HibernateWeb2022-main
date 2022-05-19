package br.com.ifce.service;

import java.util.List;

import br.com.ifce.model.Filme;
import br.com.ifce.repository.FilmeRepository;

public class FilmeService {
	
	private FilmeRepository filmeRepository = new FilmeRepository();
	
	public void adicionarService(Filme filme) {
		filmeRepository.alterarRepository(filme);	
	}
	public void removerService(Long id) {
		filmeRepository.removerRepository(id);
	}
	public void alterarService (Filme filme) {
		filmeRepository.alterarRepository(filme);
	}
	public List<Filme> listarService (){
		return filmeRepository.listarRepository();
	}
	public Filme buscarFilmePorIdService(Long id) {
		return filmeRepository.buscarFilmePorIdRepository(id);
	}
		
}

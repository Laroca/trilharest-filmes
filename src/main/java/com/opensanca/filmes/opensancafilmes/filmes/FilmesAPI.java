package com.opensanca.filmes.opensancafilmes.filmes;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.opensanca.filmes.opensancafilmes.filmes.comum.Pagina;
import com.opensanca.filmes.opensancafilmes.filmes.comum.ParametrosDePaginacao;



@RestController
@RequestMapping("/filmes") // controla tudo que contem filmes
public class FilmesAPI {

	@Autowired //injeção de dependencia
	private FilmesRepository filmesRepository;
	
	@RequestMapping (path="em-exibicao", method=RequestMethod.GET)
	public Pagina<Filme> getEmExibicao(
			ParametrosDePaginacao parametrosDePaginacao){
		if (parametrosDePaginacao==null) {
			parametrosDePaginacao = new ParametrosDePaginacao();
		}
		return this.filmesRepository.buscarPaginaEmExibicao(parametrosDePaginacao, LocalDate.now());
	}
	@GetMapping("/{id}") // Capture por parametro
	public Filme getPorId(@PathVariable() UUID id) {
		return this.filmesRepository.buscarPorId(id);
	}

}

package com.opensanca.filmes.opensancafilmes.filmes;

import java.time.LocalDate;
import java.util.UUID;

import com.opensanca.filmes.opensancafilmes.filmes.comum.Pagina;
import com.opensanca.filmes.opensancafilmes.filmes.comum.ParametrosDePaginacao;

public interface FilmesRepository {
	
	Pagina <Filme>buscarPaginaEmExibicao(
			ParametrosDePaginacao parametrosDePaginacao, LocalDate referencia);
	
	/**
	 * @throws IllegalArgumentException Se n�o encontrar pelo ID
	 * 
	 */
	
	Filme buscarPorId (UUID id);

}

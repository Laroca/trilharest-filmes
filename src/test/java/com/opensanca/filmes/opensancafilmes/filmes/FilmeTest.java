package com.opensanca.filmes.opensancafilmes.filmes;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class FilmeTest {
	
	@Test
	public void foraDeExibicaoSeDatasNulas() {
		// preparação
		Filme filme = new Filme( );
		LocalDate referencia = LocalDate.of(2017, 10, 21);
	    // processamento
	    boolean resultado = filme.emExibicao(referencia);
	    //verificação
	    Assert.assertFalse(resultado);
						
	}
	@Test
	public void emExibicaoSeDentrodeIntervalosDeDatas() {
		// preparação
		Filme filme = new Filme( null, null, null, null, LocalDate.of(2017, 10, 1), LocalDate.of(2017, 10, 30) );
		LocalDate referencia = LocalDate.of(2017, 10, 21);
	    // processamento
	    boolean resultado = filme.emExibicao(referencia);
		//verificação
		Assert.assertTrue(resultado);
	}
	@Test
	public void emExibicaoSeForadeIntervalosDeDatas() {
		// preparação
		Filme filme = new Filme( null, null, null, null, LocalDate.of(2016, 10, 1), LocalDate.of(2016, 10, 30) );
		LocalDate referencia = LocalDate.of(2017, 10, 21);
	    // processamento
	    boolean resultado = filme.emExibicao(referencia);
		//verificação
		Assert.assertFalse(resultado);
	}
	@Test
	public void foraDeExibicaoSeForaDeIntervaloDeDatas() {
		// preparação
		Filme filme = new Filme( null, null, null, null, LocalDate.of(2016, 10, 1), LocalDate.of(2016, 10, 30) );
		LocalDate referencia = LocalDate.of(2017, 10, 21);
	    // processamento
	    boolean resultado = filme.emExibicao(referencia);
		//verificação
		Assert.assertFalse(resultado);
	}

	
	@Test
	public void foraDeExibicaoSeInicioExibicaoNulo() {
		// preparação
		Filme filme = new Filme( null, null, null, null, LocalDate.of(2016, 10, 1), null );
		LocalDate referencia = LocalDate.of(2017, 10, 21);
	    // processamento
	    boolean resultado = filme.emExibicao(referencia);
		//verificação
		Assert.assertFalse(resultado);
		
	}
	@Test
	public void foraDeExibicaoSeFimExibicaoNulo() {
		// preparação
		Filme filme = new Filme( null, null, null, null, LocalDate.of(2017, 10, 21), LocalDate.of(2016, 10, 30) );
		LocalDate referencia = LocalDate.of(2017, 10, 21);
	    // processamento
	    boolean resultado = filme.emExibicao(referencia);
		//verificação
		Assert.assertFalse(resultado);
		
	}
	@Test
	public void emExibicaoSeInicioExatamentoHoje() {
		// preparação
		Filme filme = new Filme( null, null, null, null, LocalDate.of(2017, 10, 1), LocalDate.of(2017, 10, 30) );
		LocalDate referencia = LocalDate.of(2017, 10, 21);
	    // processamento
	    boolean resultado = filme.emExibicao(referencia);
		//verificação
		Assert.assertTrue(resultado);
		
	}
	@Test
	public void emExibicaoSeFimExatamentoHoje() {
		// preparação
		Filme filme = new Filme( null, null, null, null, LocalDate.of(2017, 10, 20), LocalDate.of(2017, 10, 21) );
		LocalDate referencia = LocalDate.of(2017, 10, 21);
	    // processamento
	    boolean resultado = filme.emExibicao(referencia);
		//verificação
		Assert.assertTrue(resultado);
		
	}
	
}

package com.opensanca.filmes.opensancafilmes.filmes;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class FilmeTest {
	
	@Test
	public void foraDeExibicaoSeDatasNulas() {
		// prepara��o
		Filme filme = new Filme( );
		LocalDate referencia = LocalDate.of(2017, 10, 21);
	    // processamento
	    boolean resultado = filme.emExibicao(referencia);
	    //verifica��o
	    Assert.assertFalse(resultado);
						
	}
	@Test
	public void emExibicaoSeDentrodeIntervalosDeDatas() {
		// prepara��o
		Filme filme = new Filme( null, null, null, null, LocalDate.of(2017, 10, 1), LocalDate.of(2017, 10, 30) );
		LocalDate referencia = LocalDate.of(2017, 10, 21);
	    // processamento
	    boolean resultado = filme.emExibicao(referencia);
		//verifica��o
		Assert.assertTrue(resultado);
	}
	@Test
	public void emExibicaoSeForadeIntervalosDeDatas() {
		// prepara��o
		Filme filme = new Filme( null, null, null, null, LocalDate.of(2016, 10, 1), LocalDate.of(2016, 10, 30) );
		LocalDate referencia = LocalDate.of(2017, 10, 21);
	    // processamento
	    boolean resultado = filme.emExibicao(referencia);
		//verifica��o
		Assert.assertFalse(resultado);
	}
	@Test
	public void foraDeExibicaoSeForaDeIntervaloDeDatas() {
		// prepara��o
		Filme filme = new Filme( null, null, null, null, LocalDate.of(2016, 10, 1), LocalDate.of(2016, 10, 30) );
		LocalDate referencia = LocalDate.of(2017, 10, 21);
	    // processamento
	    boolean resultado = filme.emExibicao(referencia);
		//verifica��o
		Assert.assertFalse(resultado);
	}

	
	@Test
	public void foraDeExibicaoSeInicioExibicaoNulo() {
		// prepara��o
		Filme filme = new Filme( null, null, null, null, LocalDate.of(2016, 10, 1), null );
		LocalDate referencia = LocalDate.of(2017, 10, 21);
	    // processamento
	    boolean resultado = filme.emExibicao(referencia);
		//verifica��o
		Assert.assertFalse(resultado);
		
	}
	@Test
	public void foraDeExibicaoSeFimExibicaoNulo() {
		// prepara��o
		Filme filme = new Filme( null, null, null, null, LocalDate.of(2017, 10, 21), LocalDate.of(2016, 10, 30) );
		LocalDate referencia = LocalDate.of(2017, 10, 21);
	    // processamento
	    boolean resultado = filme.emExibicao(referencia);
		//verifica��o
		Assert.assertFalse(resultado);
		
	}
	@Test
	public void emExibicaoSeInicioExatamentoHoje() {
		// prepara��o
		Filme filme = new Filme( null, null, null, null, LocalDate.of(2017, 10, 1), LocalDate.of(2017, 10, 30) );
		LocalDate referencia = LocalDate.of(2017, 10, 21);
	    // processamento
	    boolean resultado = filme.emExibicao(referencia);
		//verifica��o
		Assert.assertTrue(resultado);
		
	}
	@Test
	public void emExibicaoSeFimExatamentoHoje() {
		// prepara��o
		Filme filme = new Filme( null, null, null, null, LocalDate.of(2017, 10, 20), LocalDate.of(2017, 10, 21) );
		LocalDate referencia = LocalDate.of(2017, 10, 21);
	    // processamento
	    boolean resultado = filme.emExibicao(referencia);
		//verifica��o
		Assert.assertTrue(resultado);
		
	}
	
}
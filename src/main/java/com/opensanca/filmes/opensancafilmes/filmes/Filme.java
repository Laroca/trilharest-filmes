package com.opensanca.filmes.opensancafilmes.filmes;

import java.time.Duration;
import java.time.LocalDate;
import java.util.UUID;

import org.springframework.expression.spel.ast.BooleanLiteral;


public class Filme {
	private UUID id;
	private String nome;
	private String sinome;
	private Duration duracao;
	private LocalDate inicioExibicao;
	private LocalDate fimExibicao;
	
	
	
	public Filme(UUID id, String nome, String sinome, Duration duracao, LocalDate inicioExibicao,
			LocalDate fimExibicao) {
	
		this.id = id;
		this.nome = nome;
		this.sinome = sinome;
		this.duracao = duracao;
		this.inicioExibicao = inicioExibicao;
		this.fimExibicao = fimExibicao;
	}
	
	public Filme() {
		// TODO Auto-generated constructor stub
	}

	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSinome() {
		return sinome;
	}
	public void setSinome(String sinome) {
		this.sinome = sinome;
	}
	public Duration getDuracao() {
		return duracao;
	}
	public void setDuracao(Duration duracao) {
		this.duracao = duracao;
	}
	public LocalDate getInicioExibicao() {
		return inicioExibicao;
	}
	public void setInicioExibicao(LocalDate inicioExibicao) {
		this.inicioExibicao = inicioExibicao;
	}
	public LocalDate getFimExibicao() {
		return fimExibicao;
	}
	public void setFimExibicao(LocalDate fimExibicao) {
		this.fimExibicao = fimExibicao;
	}

	public boolean emExibicao(LocalDate referencia) {		
		if( getInicioExibicao() == null || getFimExibicao() == null){
			return false;
		}
		LocalDate referenciahoje = LocalDate.now();
		boolean hojeAntesInicio = ( getInicioExibicao().isEqual(referencia) || getInicioExibicao().isBefore(referencia) );
		boolean hojeAntesFim = ( getFimExibicao().isEqual(referencia) || getFimExibicao().isAfter(referencia) );
		return hojeAntesInicio && hojeAntesFim;

	}
}
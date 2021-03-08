package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

//POJO- plan old java object
//Java Bean
//Semplice contenitore di dati, non ha logica

/**
 * Memorizza risultato di un esame singolo
 * @author Federica
 *
 */

public class Voto {
	
	private String nome;
	private int voto; //30L come lo reppresento?
	private LocalDate data; // data superamento esame
	
	/**
	 * Costruttore classe Voto
	 * @param nome  nome del corso superato
	 * @param voto voto ottenuto
	 * @param data data di superamento
	 */
	public Voto(String nome, int voto, LocalDate data) {
		super();
		this.nome = nome;
		this.voto = voto;
		this.data = data;
	}


	public String getNome() {
		return nome;
	}


	public int getVoto() {
		return voto;
	}


	public LocalDate getData() {
		return data;
	}
	


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setVoto(int voto) {
		this.voto = voto;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return "Esame " + nome + " superato con " + voto + " il " + data ;
	}
	
	
	
	

}

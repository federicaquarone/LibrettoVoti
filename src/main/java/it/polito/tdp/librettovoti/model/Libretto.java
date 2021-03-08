package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List <Voto> voti;

	public Libretto() {
		this.voti= new ArrayList<>(); //fino a quando non faccio NEW non c'è nessun oggetto
		//obbligato a scegliere tra arraylist o linkedlist, busogna scegliere che classe specifica sarà
	}
	

	public void  add(Voto v) {
		this.voti.add(v);
		
	}
	
	/*
	public void stampaVotiUguali(int punteggio) {
		System.out.println();
	}
	
	public String votiUguali(int punteggio) {
		//calcola una stringa che contiene i voti
		//sarà poi il chiamante a stamparli
		//-->soloNOME?
		//--> tutto il voto.toString()
	}*/
	
	public List<Voto> listaVotiUguali(int punteggio){
		List <Voto> risultato= new ArrayList<>();
		for (Voto v: voti) {
			if (v.getVoto()==punteggio) {
				risultato.add(v);
			}
		}
		return risultato;
		
		
	}
	
	
	public Libretto votiUguali(int punteggio) {
		//metodo migliore tra tutti
		Libretto risultato= new Libretto();
		for (Voto v: voti) {
			if (v.getVoto()==punteggio) {
				risultato.add(v);
			}
		}
		return risultato;
	}
	
	public String toString() {
		String s = "" ;
		for(Voto v: this.voti) {
			s = s + v.toString() + "\n" ;
		}
		return s ;
	}
	}
	
	



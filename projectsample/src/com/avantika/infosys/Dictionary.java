package com.avantika.infosys;

public class Dictionary {
	String noun,verb,synonym,antonym;

	public Dictionary(String noun, String verb, String synonym, String antonym) {
	
		this.noun = noun;
		this.verb = verb;
		this.synonym = synonym;
		this.antonym = antonym;
	}

	@Override
	public String toString() {
		return "Dictionary [meaning=" + noun + ", adjective=" + synonym + ", synonym=" + synonym + ", antonym="
				+ antonym + "]";
	}
	

}

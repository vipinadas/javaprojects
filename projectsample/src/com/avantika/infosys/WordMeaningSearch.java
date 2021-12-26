package com.avantika.infosys;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WordMeaningSearch {
	public static void main(String args[])
	{
		Dictionary word1=new Dictionary("somebody has done something that you do not like", "anger","acrimony", "calm");
		Dictionary word2=new Dictionary("one's life", "live","soul","apathy");
		Dictionary word3=new Dictionary("to pray to and show respect for god ","worshiped","rite","disdain");
		Dictionary word4=new Dictionary("Disappear", "vanish","fury","ease");
		Dictionary word5=new Dictionary("to get away", "escaped","desertion", "directness");
		Dictionary word6=new Dictionary("way ", "to travel","idea", "reality");
		Word w1=new Word(1010,"Anger");
		Word w2=new Word(1020,"Life");
		Word w3=new Word(1030,"Worship");
		Word w4=new Word(1040,"Vanish");
		Word w5=new Word(1050,"Escape");
		Word w6=new Word(1060,"Path");
		Map<Word,Dictionary> search=new HashMap<>();
		search.put(w1, word1);
		search.put(w2, word2);
		search.put(w3, word3);
		search.put(w4, word4);
		search.put(w5, word5);
		search.put(w6, word6);
		Iterator wrds=search.keySet().iterator();
		while(wrds.hasNext())
			System.out.println(wrds.next());	
	}
	
}

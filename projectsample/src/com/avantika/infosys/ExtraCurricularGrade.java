package com.avantika.infosys;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExtraCurricularGrade {
	private String musicGrade,petGrade,supwGrade,artGrade;
	public ExtraCurricularGrade(String musicGrade, String petGrade, String supwGrade, String artGrade) {
		super();
		this.musicGrade = musicGrade;
		this.petGrade = petGrade;
		this.supwGrade = supwGrade;
		this.artGrade = artGrade;
	}


	public String extra_acivity()
	{
		Set<String> extra=new LinkedHashSet<>();
		extra.add(musicGrade);
		extra.add(petGrade);
		extra.add(supwGrade);
		extra.add(artGrade);
		return ("Music Grade:"+musicGrade +"PET grade:"+petGrade +"SUPW Grade:"+supwGrade+"Art Grade:" +artGrade);	
	}

}

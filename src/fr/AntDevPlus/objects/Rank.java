package fr.AntDevPlus.objects;

public class Rank {
	
	public String NAME;
	public Elo ELO;
	
	
	public Rank(String name, Elo elo) {
		this.NAME = name;
		this.ELO = elo;
	}

	public Elo getELO() {
		return ELO;
	}		
	
	public String getNAME() {
		return NAME;
	}
	
	public void setELO(Elo eLO) {
		ELO = eLO;
	}
	
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	
}

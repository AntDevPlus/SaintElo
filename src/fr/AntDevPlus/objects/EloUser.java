package fr.AntDevPlus.objects;

public class EloUser {
	
	public String NAME;
	public Elo ELO;
	public String ID;
	
	Elo EloBI = new Elo(500);
	Rank BronzeI = new Rank("Bronze I", EloBI);
	
	Elo EloBII = new Elo(600);
	Rank BronzeII = new Rank("Bronze II", EloBII);
	
	Elo EloBIII = new Elo(700);
	Rank BronzeIII = new Rank("Bronze III", EloBIII);
	
	Elo EloBIV = new Elo(800);
	Rank BronzeIV = new Rank("Bronze IV", EloBII);
	
	Elo EloBV = new Elo(900);
	Rank BronzeV = new Rank("Bronze V", EloBI);
	
	Elo EloSI = new Elo(1050);
	Rank SilverI = new Rank("Silver I", EloSI);
	
	Elo EloSII = new Elo(1200);
	Rank SilverII = new Rank("Silver II", EloSII);
	
	Elo EloSIII = new Elo(1300);
	Rank SilverIII = new Rank("Silver III", EloSIII);
	
	Elo EloSIV = new Elo(1400);
	Rank SilverIV = new Rank("Silver IV", EloSIV);
	
	Elo EloSV = new Elo(1500);
	Rank SilverV = new Rank("Silver V", EloSV);
	
	
	public EloUser(String name, Elo elo, String id) {
		
		this.NAME = name;
		this.ELO = elo;
		this.ID = id;
	}

	public int getELO() {
		return ELO.getElo();
	}
	
	public String getNAME() {
		return NAME;
	}
	
	public String getID() {
		return ID;
	}
	
	public void setELO(Elo eLO) {
		ELO = eLO;
	}
	
	public void setID(String iD) {
		ID = iD;
	}
	
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	
	public String getRankByUserElo(EloUser user){	
		
		if(user.getELO() < 500){
			return BronzeI.getNAME();
		}
		if(user.getELO() < 600){
			return BronzeII.getNAME();
		}
		if(user.getELO() < 700){
			return BronzeIII.getNAME();
		}
		if(user.getELO() < 800){
			return BronzeIV.getNAME();
		}
		if(user.getELO() < 900){
			return BronzeV.getNAME();
		}
		if(user.getELO() < 1050){
			return SilverI.getNAME();
		}
		if(user.getELO() < 1200){
			return SilverII.getNAME();
		}
		if(user.getELO() < 1300){
			return SilverIII.getNAME();
		}
		if(user.getELO() < 1400){
			return SilverIV.getNAME();
		}
		if(user.getELO() < 1500){
			return SilverV.getNAME();
		}
		
		return "Legend";
	}
	
}

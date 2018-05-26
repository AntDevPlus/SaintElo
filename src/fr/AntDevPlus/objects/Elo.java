package fr.AntDevPlus.objects;

public class Elo {
	
	public int Elo = 1000;
	public EloUser eloUser;
	
	public Elo(int Elo) {
		this.Elo = Elo;
	}
	
	public int getElo() {
		return Elo;
	}
}

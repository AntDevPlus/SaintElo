package fr.AntDevPlus;

import fr.AntDevPlus.objects.Elo;
import fr.AntDevPlus.objects.EloUser;

public class Main {

	static EloUser user;
	static Elo elo;
	
	public static void main(String[] args) {
		System.out.println("Elo World");	
		elo = new Elo(1589);
		user = new EloUser("LouposKoala", elo, "1");
		System.out.println(user.getRankByUserElo(user));
	}
	

}

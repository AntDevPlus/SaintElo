package fr.AntDevPlus;

import java.io.IOException;

import fr.AntDevPlus.events.FileEvent;
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
		String currentDir = System.getProperty("user.dir");
		System.out.println(user.getRank(user));
		
		try {
			FileEvent fileEvent = new FileEvent();
			fileEvent.saveRank(currentDir, user.getRank(user));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileEvent fileEvent = new FileEvent();
			fileEvent.LoadRank(currentDir, user.getRank(user));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}

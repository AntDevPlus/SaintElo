package fr.AntDevPlus.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import fr.AntDevPlus.objects.EloUser;
import fr.AntDevPlus.objects.Rank;

public class ObjectSerializationManager {
	
	private Gson gson;
	
	public ObjectSerializationManager() {
		this.gson = loadGsonInstance();
	}

	private Gson loadGsonInstance() {
		return new GsonBuilder()
				.setPrettyPrinting()
				.serializeNulls()
				.disableHtmlEscaping().create();
	}
	
	public String serializeRank(Rank rank){
		return this.gson.toJson(rank);
	}
	
	public String serializeEloUser(EloUser user){
		return this.gson.toJson(user);
	}
	
	public Rank deserializeRank(String json){
		return this.gson.fromJson(json, Rank.class);
	}
	
	public EloUser deserializeEloUser(String json){
		return this.gson.fromJson(json, EloUser.class);
	}
}

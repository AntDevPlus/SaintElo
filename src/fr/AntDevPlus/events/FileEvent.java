package fr.AntDevPlus.events;

import java.io.File;
import java.io.IOException;

import fr.AntDevPlus.data.FileUtils;
import fr.AntDevPlus.data.ObjectSerializationManager;
import fr.AntDevPlus.objects.Rank;

public class FileEvent {
	
	public FileEvent() {
	}
	
	public void saveRank(String path, Rank rank) throws IOException{
			final File file = new File(path, rank.getNAME() + ".json");
			final ObjectSerializationManager manager = null;
			@SuppressWarnings("null")
			final String json = manager.serializeRank(rank);
			
			FileUtils.saveFile(file, json);
	}

	public Rank LoadRank(String path, Rank rank) throws IOException{
		final File file = new File(path, rank.getNAME() + ".json");
		final ObjectSerializationManager manager = null;
		final String json = FileUtils.loadContentInFile(file);
		return rank = manager.deserializeRank(json);
}
	
}

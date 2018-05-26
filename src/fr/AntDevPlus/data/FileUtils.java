package fr.AntDevPlus.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {

		public static void createFile (File file) throws IOException{
			if(!file.exists()){
				file.getParentFile();
				file.createNewFile();
			}
		}
		
		@SuppressWarnings("null")
		public static void saveFile(File file, String text) throws IOException  {		
			final FileWriter fw = null;
			
			try {
				createFile(file);
				fw.write(text);
				fw.flush();
				fw.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public static String loadContentInFile(File file) throws IOException{
						
			if(file.exists()){
				
			 try {
				 final BufferedReader reader = new BufferedReader(new FileReader(file));
				 final StringBuilder builder = new StringBuilder();
				
				 String textline;
				 
				 while((textline = reader.readLine()) != null){
					 builder.append(textline);
				 }
				 
				 reader.close();
				 return builder.toString();
				 
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
	
			}
		return null;
	}
}

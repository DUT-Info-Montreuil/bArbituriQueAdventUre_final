package application.modele;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Terrain {
	
	
	private List<String> listeTerrain;

	public Terrain() throws IOException {
		String file = Parametres.getCheminTerrain();
		
		this.listeTerrain = readFile(file);
	}

	public List<String> readFile(String file) throws IOException {
	
		List<String> listeParLigne = new ArrayList<String>();
		List<String> resultat = new ArrayList<String>();
	    String val = " ";
	    int i=0;
	    FileReader fr = new FileReader(file);
	    BufferedReader br = new BufferedReader(fr);
	    
	    for (String line = br.readLine(); line != null; line = br.readLine()) {
	        listeParLigne.add(line);
	        val = listeParLigne.get(i);
	    	List<String> list = new ArrayList<String>(Arrays.asList(val.split(",")));
	    	resultat.addAll(list);
	    	i++;
	    }
	    
	    br.close();
	    fr.close();

	    return resultat;
	}
	
	public List<String> getListeTerrain(){
		return this.listeTerrain;
	}
	
	public int trouverTuileSelonLIndice(int indice) {
		return Integer.parseInt(this.listeTerrain.get(indice));
	}
	
	public void détuireBlocsSelonLIndice(int indice) {
		this.listeTerrain.set(indice, "-1");
	}
	
	


}
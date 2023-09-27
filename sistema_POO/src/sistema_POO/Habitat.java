package sistema_POO;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Habitat {
    private String nombreHabitat;
    private List<Especie> listaEspecies = new ArrayList<>();
    private String[] especiesArray;
    
    JSONParser jsonParser = new JSONParser();

    public Habitat(String nombre) {
    	this.nombreHabitat = nombre;
        cargarDatosDesdeJSON("C:\\Users\\Hellish\\Desktop\\Sistema_POO\\sistema_POO\\src\\habitats.json");
        agregarEspecies(especiesArray, nombreHabitat);  
    }
    
    private void cargarDatosDesdeJSON(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            // Analizar el archivo JSON
            Object obj = jsonParser.parse(reader);

            // Convertir el objeto JSON en JSONObject. 
            JSONObject jsonObject = (JSONObject) obj;

            // Obtener la matriz JSON bajo la clave correspondiente.
            JSONArray especiesJSON = (JSONArray) jsonObject.get(nombreHabitat);
            
            // Convertir array de json en array de java.
            especiesArray = new String[especiesJSON.size()];
            for (int i = 0; i < especiesJSON.size(); i++) {
                especiesArray[i] = (String) especiesJSON.get(i);
            }
       
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
    
    private void agregarEspecies(String[] arrayNombreEspecies, String nombreHabitatActual) {
    	int sizeArray = arrayNombreEspecies.length;	
    	
    	for (int i = 0; i < sizeArray; i++) {
    		Especie especieHabitat = new Especie(arrayNombreEspecies[i], false, 0, nombreHabitatActual);   	
    		listaEspecies.add(especieHabitat);
    	}
    	for (int i = 0; i < sizeArray; i++) {
    		Especie especieObj = listaEspecies.get(i);
    		System.out.println("Habitat: "+ nombreHabitat + ". Especie objeto nombre: "+ especieObj.especie);	
    	}
    }
    public String getNombre() {
        return nombreHabitat;
    }
    
    public List<Especie> getListaEspecies() {
        return listaEspecies;
    }
}


	


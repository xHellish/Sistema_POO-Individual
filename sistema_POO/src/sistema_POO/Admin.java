package sistema_POO;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Admin {
	public String nombre;
	private String[] habitatsNombres;
	private List<Habitat> listaHabitats = new ArrayList<>();
	
	JSONParser jsonParserAdmin = new JSONParser();
	
	Admin(String _nombre){
		this.nombre = _nombre;
		parsearJsonAdmin("C:\\Users\\Hellish\\Desktop\\Sistema_POO\\sistema_POO\\src\\admin.json");
	}
	
	private void parsearJsonAdmin(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            // Analizar el archivo JSON
            Object obj = jsonParserAdmin.parse(reader);

            // Convertir el objeto JSON en JSONObject. 
            JSONObject _jsonObject = (JSONObject) obj;

            // Obtener la matriz JSON bajo la clave correspondiente.
            JSONArray habitatsJSON = (JSONArray) _jsonObject.get("hábitats");
            
            // Convertir array de json en array de java.
            
            habitatsNombres = new String[habitatsJSON.size()];
            
            for (int i = 0; i < habitatsNombres.length; i++) {
            	habitatsNombres[i] = (String) habitatsJSON.get(i);
            }
            for (int i = 0; i < habitatsNombres.length; i++) {
            	Habitat _habitatObjeto = new Habitat(habitatsNombres[i]);
            	listaHabitats.add(_habitatObjeto);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
	
    public List<Habitat> getListaHabitats() {
        return listaHabitats;
    } 
}

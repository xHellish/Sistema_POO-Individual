package sistema_POO;

import java.util.ArrayList;
import java.util.List;

public class Habitat {
	
	private String nombre;
	private List<String> listaEspecies = new ArrayList<>();
	
	public Habitat(String _nombre) {
		this.nombre = _nombre;
		
	}
}

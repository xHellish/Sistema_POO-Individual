package sistema_POO;

public class Especie extends Animal{
	
	public Especie (String _especie, boolean extinta, int _poblacion, String _habitat) {
		this.especie = _especie;
		this.extinta = extinta;
		this.poblacion = _poblacion;
		this.habitat = _habitat;
	}
	
	public void extinguir() {
		this.extinta = true;
	}
}

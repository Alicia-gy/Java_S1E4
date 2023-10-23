package n1e1;

import java.util.ArrayList;

public class Meses {
	
	private ArrayList<String> listaMeses;
	
	public Meses() {
		listaMeses = new ArrayList<String>();
		listaMeses.add("Enero");
		listaMeses.add("Febrero");
		listaMeses.add("Marzo");
		listaMeses.add("Abril");
		listaMeses.add("Mayo");
		listaMeses.add("Junio");
		listaMeses.add("Julio");
		listaMeses.add("Agosto");
		listaMeses.add("Septiembre");
		listaMeses.add("Octubre");
		listaMeses.add("Noviembre");
		listaMeses.add("Diciembre");
	}
	
	public ArrayList<String> getMeses() {
		return listaMeses;
	}
	

}

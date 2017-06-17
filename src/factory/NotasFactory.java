package factory;

import java.util.HashMap;
import java.util.Map;

import notasMusicais.Do;
import notasMusicais.Fa;
import notasMusicais.La;
import notasMusicais.Mi;
import notasMusicais.Nota;
import notasMusicais.Re;
import notasMusicais.Si;
import notasMusicais.Sol;

public class NotasFactory {

	public static Map<String, Nota> notasMusicais  = new HashMap<>();
	
	
	static{
		notasMusicais.put("Do", new Do());
		notasMusicais.put("Re", new Re());
		notasMusicais.put("Mi", new Mi());
		notasMusicais.put("Fa", new Fa());
		notasMusicais.put("Sol", new Sol());
		notasMusicais.put("La", new La());
		notasMusicais.put("Si", new Si());
	}
	
	public Nota busca(String cod){
		return notasMusicais.get(cod);
	}
}

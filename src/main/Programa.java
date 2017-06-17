package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import factory.NotasFactory;
import instrumento.Piano;
import notasMusicais.Nota;

public class Programa {

	public static void main(String[] args) {
		NotasFactory notas = new NotasFactory();
		List<Nota> musica = Arrays.asList(
							notas.busca("Do"),
							notas.busca("Re"),
							notas.busca("Mi"),
							notas.busca("Fa"),
							notas.busca("Sol"),
							notas.busca("La"),
							notas.busca("Si"),
							notas.busca("Do"));
		
		Piano piano = new Piano();
		piano.tocar(musica);
	}

}

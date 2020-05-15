package Campeonato.main;

import java.util.*;

public class SorteoCampeonato {

	public static void main(String[] args) {

		String[] Equipo = { "Equipo A", "Equipo B", "Equipo C", "Equipo D", "Equipo E", "Equipo F", "Equipo G", "Equipo H", "Equipo I" };
		List<String> emparejados = new ArrayList<String>();
		Random rand = new Random();
		int randomNum = rand.nextInt(((Equipo.length - 1) - 0) + 1);
		int equiposExtraidos = 0;

//BUCLE WHILE PARA CREAR ALEATORIOS
		while (equiposExtraidos < Equipo.length) {
			if (emparejados.size() == Equipo.length - 1)
				break;

			String equipo1 = "";
			do {
				randomNum = rand.nextInt(((Equipo.length - 1) - 0) + 1);
				equipo1 = Equipo[randomNum];
			} while (emparejados.contains(Equipo[randomNum]));

			emparejados.add(equipo1);

			String equipo2 = "";
			do {
				randomNum = rand.nextInt(((Equipo.length - 1) - 0) + 1);
				equipo2 = Equipo[randomNum];
			} while (emparejados.contains(Equipo[randomNum]));

			emparejados.add(equipo2);
			System.out.println(equipo1 + " vs " + equipo2);
			equiposExtraidos++;
		}

		for (String equipo : Equipo)
			if (!emparejados.contains(equipo))
				System.out.println("- Exento: " + equipo);
	}
}

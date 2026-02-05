package main;

import java.util.*;

public class Torneo {

	public static void main(String[] args) {
		//ATRIBUTOS DE LA CLASE
		HashMap<String, Integer> hallOfFame = new HashMap<>();
//		Combate combate = new Combate();
//		LinkedList<Luchador> luchadores = new LinkedList<>();
		
		
		System.out.println("*** BIENVENIDO AL TORNEO DE LUCHA LIBRA DAWWE ***");
		menuPrincipal();
	}
	
	//METODOS DE LA CLASE TORNEO
	public static void menuPrincipal() {
		System.out.println("\n** MENÚ PRINCIPAL **");
		System.out.println("1 - Mostrar luchadores");
		System.out.println("2 - Añadir luchador");
		System.out.println("3 - Ready? FIGHT!");
		System.out.println("4 - Mostrar Hall of Fame");
		System.out.println("5 - Salir");
	}
	
	
	public static void añadirLuchador(LinkedList<Luchador> luchadores) {
		
	}

}

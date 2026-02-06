package main;

import java.util.*;

import pojos.Luchador;

public class Torneo {

	public static final Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// ATRIBUTOS DE LA CLASE
		HashMap<String, Integer> hallOfFame = new HashMap<>();
//		Combate combate = new Combate();
		LinkedList<Luchador> luchadores = new LinkedList<>();

		int opcion = -1;

		System.out.println("*** BIENVENIDO AL TORNEO DE LUCHA LIBRA DAWWE ***");
		// menuPrincipal();

		do {
			menuPrincipal();
			opcion = Integer.parseInt(teclado.nextLine());
			// Imprimimos menu

			switch (opcion) {
			case 1: mostrarLista(luchadores);
				break;
			case 2:	anadirLuchador(luchadores);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			default:
				System.out.println("Opcion inválida");
			}
		} while (opcion != 5);
	}

	// METODOS DE LA CLASE TORNEO
	/**
	 * Metodo para imprimir el menu principal
	 */
	public static void menuPrincipal() {
		System.out.println("\n** MENÚ PRINCIPAL **");
		System.out.println("1 - Mostrar luchadores");
		System.out.println("2 - Añadir luchador");
		System.out.println("3 - Ready? FIGHT!");
		System.out.println("4 - Mostrar Hall of Fame");
		System.out.println("5 - Salir");
	}

	public static void anadirLuchador(LinkedList<Luchador> luchadores) {
		System.out.println("** LUCHADOR NUEVO **");

		System.out.print("Nombre: ");
		String nombre = teclado.nextLine();

		System.out.println("Categoria: ");
		System.out.println("1: Peso mosca");
		System.out.println("2: Peso pluma");
		System.out.println("3: Peso ligero");
		System.out.println("4: Peso medio");
		System.out.println("5. Peso pesado");

		int categoria = Integer.parseInt(teclado.nextLine());

		Luchador luchador = new Luchador(nombre, categoria);
		luchadores.add(luchador);
	}
	
	public static void mostrarLista(LinkedList<Luchador> luchadores) {
		System.out.println("\n** LISTA DE LUCHADORES **");

		if (luchadores.size() == 0) {
			System.out.println("La lista esta vacia.");
		} else {
			for (Luchador luchador1 : luchadores) {
				luchador1.info();
				System.out.println();
			}
		}
		System.out.println();
	}

}

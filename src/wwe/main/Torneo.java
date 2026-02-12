/**
 * @author Diego Librado Lopez
 */
package wwe.main;

import java.util.*;

import wwe.pojos.Combate;
import wwe.pojos.Luchador;

public class Torneo {

	public static final Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// ATRIBUTOS DE LA CLASE
		HashMap<String, Integer> hallOfFame = new HashMap<>();
		Combate combate = new Combate();
		LinkedList<Luchador> luchadores = new LinkedList<>();

		int opcion = -1;

		System.out.println("*** BIENVENIDO AL TORNEO DE LUCHA LIBRA DAWWE ***");

		do {
			// Muestra el menu principal
			menuPrincipal();
			// inicializamos una variable como falso para no salir hasta que el valor de la
			// opción sea válido
			boolean valido = false;
			while (!valido) {
				try {
					opcion = Integer.parseInt(teclado.nextLine());
					// cambiamos el valor para salir del bucle
					valido = true;
				} catch (NumberFormatException e) {
					System.out.print("Opcion no valida, introduzca un numero: ");
				}
			}

			switch (opcion) {
			case 1:
				// Mostrar lista de luchadores
				mostrarLista(luchadores);
				break;
			case 2:
				// Añadir un luchador nuevo
				anadirLuchador(luchadores);
				break;
			case 3:
				// Realizar combate
				realizarCombate();
				break;
			case 4:
				// Mostrar Hall of Fame
				hallOfFame(hallOfFame);
				break;
			case 5:
				// Salir
				System.out.println("\nTORNEO FINALIZADO");
				break;
			default:
				System.out.println("El numero debe estar entre 1 y 5");
				break;
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
		System.out.print("Opcion → ");
	}

	/**
	 * Metodo para añadir nuevos luchadores a la lista
	 * 
	 * @param luchadores LinkedList en la que se almacenan los luchadores creados
	 */
	public static void anadirLuchador(LinkedList<Luchador> luchadores) {
		System.out.println("\n** LUCHADOR NUEVO **");

		System.out.print("Nombre: ");
		String nombre = teclado.nextLine();

		int categoria = -1;
		do {
			menuCategorias();
			try {
				categoria = Integer.parseInt(teclado.nextLine());
				if (categoria < 1 || categoria > 5) {
					System.out.println("La categoria introducida no es valida, introduzca una de las siguientes: ");
				}
			} catch (NumberFormatException e) {
				System.out.print("Opcion no valida, introduzca un numero: ");
			}
		} while (categoria < 1 || categoria > 5);
		Luchador luchador = new Luchador(nombre, categoria);
		luchadores.add(luchador);
	}

	/**
	 * Método para mostrar la lista de los luchadores
	 * 
	 * @param luchadores LinkedList en la que se almacenan los luchadores creados
	 */
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

	/**
	 * Método para imprimir los luchadores y sus combates ganados
	 * 
	 * @param hallOfFame HashMap en la que se almacena el nombre y los combates
	 *                   ganados de cada luchador
	 */
	public static void hallOfFame(HashMap<String, Integer> hallOfFame) {
		System.out.println("\n** HALL OF FAME **");

		if (hallOfFame.size() == 0) {
			System.out.println("Aun no hay peleadores en el Hall Of Fame");
		} else {
			// Usando keySet(), imprimimos el Key (nombre del luchador), y con
			// hallOfFame.get(nombre), accedemos al valor de dicha key imprimiedo asi el
			// nombre y sus victorias
			for (String nombre : hallOfFame.keySet()) {
				System.out.println(nombre + ": " + hallOfFame.get(nombre) + " victorias");
			}
		}
	}

	public static void realizarCombate() {
		// TODO Auto-generated method stub

	}

	/**
	 * Método para imprimir el menu de seleccion de la categoria
	 */
	public static void menuCategorias() {
		System.out.println("Categoria: ");
		System.out.println("1: Peso mosca");
		System.out.println("2: Peso pluma");
		System.out.println("3: Peso ligero");
		System.out.println("4: Peso medio");
		System.out.println("5. Peso pesado");
	}
}

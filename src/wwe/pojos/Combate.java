/**
 * @author Diego Librado Lopez
 */
package wwe.pojos;

import java.util.*;

import wwe.exception.ContrincantesInsuficientesException;

public class Combate {
	// ATRIBUTOS DE LA CLASE
	private LinkedList<Luchador> rivales;
	private Luchador ganador;

	public Combate(LinkedList<Luchador> rivales) {
		// (rivales) para que se haga una copia de la lista luchadores
		this.rivales = new LinkedList<>(rivales);
		// El ganador empieza vacio, hasta que se ejecute el metodo fight()
		this.ganador = null;
	}

	// MÉTODOS DE LA CLASE
	/**
	 * Metodo para realizar el combate
	 * 
	 * @throws ContrincantesInsuficientesException Excepcion que vamos a lanzar
	 *                                             cuando los dos luchadores
	 *                                             elegidos aleatorioamente sean los
	 *                                             mismos
	 */
	public void fight() throws ContrincantesInsuficientesException {
		Random aleatorio = new Random();
		/*
		 * Elegir un atacante y un oponente de la lista de rivales, tienen que ser
		 * diferentes. el atacante elige uno de sus ataques aleatoriamente. Ese ataque
		 * se lanza contra el rival. Con eso obtenemos la fuerza que va a tener el
		 * ataque. El rival recibe el golpe con esa fuerza. Comprobamos si esta ko.
		 */
		if (rivales.size() < 2) {
			throw new ContrincantesInsuficientesException();
		}

		while (rivales.size() > 1) {
			int numAtacante = aleatorio.nextInt(rivales.size());
			int numRival = aleatorio.nextInt(rivales.size());

			// Hacemos un bucle para generar un numero nuevo en caso de que lo dos
			// luchadores sean los mismos
			while (numAtacante == numRival) {
				numRival = aleatorio.nextInt(rivales.size());
			}

			// Cogemos de la LinkedList los luchadores DIFERENTES seleccionados
			// aleatorioamente
			Luchador atacante = rivales.get(numAtacante);
			Luchador rival = rivales.get(numRival);

			// Elegimos el ataque del atacante, numero aleatorio entre cero y el tamaño del
			// ArrayList de ataques de cada luchador, hay que usar un Get
			int numAtaque = aleatorio.nextInt(atacante.getAtaques().size());

			// aqui elegimos el ataque correspondiente al indice que acabamos de generar con
			// la linea anterior, hay que usar un getter para acceder a esa posicion del
			// ArrayList
			Ataque ataqueAtacante = atacante.getAtaques().get(numAtaque);

			// Calculamos el daño de ataque que vamos a hacer e imprimimos el mensaje
			// correspondiente al tipo de Ataque que sea, y el daño se lo hacemos al
			// objeto rival, que pasa por parametro. Hay que pasar el rival por parametor
			// porque en el metodo lanzarAtaque el numero de daño se genera automaticamente
			// entre el cero y la salud del rival
			int fuerzaAtaque = ataqueAtacante.lanzarAtaque(rival);

			// El rival va a recibir el golpe con la fuerza antes calculada, aqui vamos a
			// ver si el metodo ataqueBloqueado ha salido true o false. Y gestionaremos
			// dependiendo del resultado.
			boolean bloqueaAtaque = ataqueAtacante.ataqueBloqueado(fuerzaAtaque, rival);
			if (bloqueaAtaque) {
				// En caso de que el rival reciba el golpe, el daño que recibe se reduce a la
				// mitad
				System.out.println("¡ATAQUE BLOQUEADO!");
				rival.recibeGolpe(fuerzaAtaque / 2);
			} else {
				System.out.println("¡EL ATAQUE NO HA SIDO BLOQUEADO!");
				rival.recibeGolpe(fuerzaAtaque);
			}
			System.out.println("Salud de " + rival.getNombre() + "= " + rival.getSalud());

			// Por ultimo comprobaremos si esta KO o no, es decir, si tiene 0 o menos de
			// salud
			System.out.println();
			if (rival.getSalud() <= 0) {
				System.out.println(rival.getNombre() + " esta KO.");
				// Cuando un rival este KO, hay que eliminarlo de la LinkedList con un remove
				rivales.remove(rival);
			}
			System.out.println();

		}
		// Como solo queda un luchador, el ganador lo asignamos a la posicion numero 0
		// del ArrayList
		ganador = rivales.get(0);
	}

	public Luchador ganador() {
		return ganador;
	}

}

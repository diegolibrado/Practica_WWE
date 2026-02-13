/**
 * @author Diego Librado Lopez
 */
package wwe.pojos;

import java.util.*;

public class Luchador {

	// ATRIBUTOS DE LA CLASE LUCHADOR
	private String nombre;
	private int categoria;
	private int fuerza;
	private int salud;
	private boolean ko;
	private ArrayList<Ataque> ataques;

	/**
	 * Constructor de la clase Luchador
	 * 
	 * @param nombre
	 * @param categoria
	 */
	public Luchador(String nombre, int categoria) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.fuerza = categoria * 10 + 10;
		this.salud = 300;
		this.ko = false;
		this.ataques = new ArrayList<>();
	}

	// METODOS DE LA CLASE LUCHADOR
	/**
	 * Método para generar los ataques y rellenar el ArrayList de ataques
	 * 
	 * @param ataques
	 */
	public void generarAtaques() {
		Random aleatorio = new Random();

		for (int i = 0; i < categoria; i++) {
			// Generamos un numero aleatorio (0, 1 o 2) ya que solo tenemos 3 tipos de
			// ataque.
			int num_ataque = aleatorio.nextInt(3);
			switch (num_ataque) {
			case 0:
				ataques.add(new Patada(fuerza));
				break;
			case 1:
				ataques.add(new Punch(fuerza));
				break;
			case 2:
				ataques.add(new Salto(fuerza));
				break;
			}
		}
	}

	/**
	 * Método para recibir el daño y restar salud
	 * 
	 * @param daño daño causado la luchador
	 */
	public void recibeGolpe(int dano) {
		salud -= dano;
		if(salud <= 0) {
			ko = true;
		}
	}

	/**
	 * Método para recuperar salud tras un combate
	 */
	public void enfermeria() {
		salud = 300;
		ko = false;
	}

	/**
	 * Método para mostrar la informacion del luchador
	 */
	public void info() {
		System.out.println("* " + nombre + " *");
		System.out.println("Categoría: " + categoria);
		System.out.println("Ataques disponibles: " + ataques);
	}

	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public boolean getKo() {
		return ko;
	}

	public void setKo(int ko) {
		this.ko = false;
	}

}

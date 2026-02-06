package pojos;

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
	 * @param ataques
	 */
	public void generarAtaques() {
		Random aleatorio = new Random();
		
		for(int i = 0; i < categoria; i++) {
			// Generamos un numero aleatorio (0, 1 o 2) ya que solo tenemos 3 tipos de ataque.
			int num_ataque = aleatorio.nextInt(3);
			switch(num_ataque) {
			case 0: ataques.add(new Punch (fuerza));
			break;
			}
//			if(num_ataque == 0) {
//				ataques.add(new Punch(Punch.getPotencia()));
//			}
		}
	}

	public void recibeGolpe(int daño) {

	}

	public void enfermeria() {

	}

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

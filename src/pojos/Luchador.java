package pojos;

import java.util.*;

public class Luchador {
	
	//ATRIBUTOS DE LA CLASE LUCHADOR
	private String nombre;
	private String categoria;
	private int fuerza;
	private int salud;
	private int ataquesDisponibles;
	private int ko;
	private ArrayList<Ataque> ataques = new ArrayList<>();
	
	/**
	 * Constructor de la clase Luchador
	 * @param nombre
	 * @param categoria
	 * @param fuerza
	 * @param salud
	 * @param ataquesDisponibles
	 * @param ko
	 */
	public Luchador (String nombre, String categoria, int fuerza, int salud, int ataquesDisponibles, int ko) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.fuerza = fuerza;
		this.salud = salud;
		this.ataquesDisponibles = ataquesDisponibles;
		this.ko = ko;
	}
	
	//METODOS DE LA CLASE LUCHADOR
	
	
	public static void rellenarAtaques() {
		
	}
	
	
	public static void recibeGolpe(int daño) {
		
	}
	
	
	public static void recuperarse() {
		
	}
	
	public void info() {
		System.out.println("*" + nombre + "*");
	}

	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
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

	public int getAtaquesDisponibles() {
		return ataquesDisponibles;
	}

	public void setAtaquesDisponibles(int ataquesDisponibles) {
		this.ataquesDisponibles = ataquesDisponibles;
	}

	public int getKo() {
		return ko;
	}

	public void setKo(int ko) {
		this.ko = ko;
	}

	public ArrayList<Ataque> getAtaques() {
		return ataques;
	}

	public void setAtaques(ArrayList<Ataque> ataques) {
		this.ataques = ataques;
	}
	
	
	
	
	
	
	
	

}

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
	private ArrayList
	
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
	
	
	public static void info() {
//		System.out.println("*" + nombre + "*");
	}
	
	
	
	
	
	

}

package creacion.abstractFactory;

public abstract class Avion {
	
	/* Attributes */ 
	private String marca;
	private String modelo;
	private int alas;
	private int velocidad;
	private int altura;
	private int longitud;
	private int anchura;
	
	/* Getters and setters */
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAlas() {
		return alas;
	}
	public void setAlas(int alas) {
		this.alas = alas;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public int getAnchura() {
		return anchura;
	}
	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}

}

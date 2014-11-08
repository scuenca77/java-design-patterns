package singleton;

public class Coche {
	
	/* Fields */
	private static Coche coche = null;
	private String marca;
	private String modelo;
	private int cilindrada;
	private int consumo;
	
	/* Private constructor */
	private Coche(){}
	
	/* Retrieves instance */
	public static synchronized Coche getInstance(){
		if(coche==null){
			System.out.println("Devolviendo un coche nuevo.");
			coche = new Coche();
		} else {
			System.out.println("Devolviendo coche existente.");
		}
		return coche;
	}
	
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
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public int getConsumo() {
		return consumo;
	}
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

}

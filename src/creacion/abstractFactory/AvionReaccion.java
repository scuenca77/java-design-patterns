package creacion.abstractFactory;

public class AvionReaccion extends Avion {
	
	/* Attributes */
	private int numeroMotores;
	private String marcaMotor;
	
	/* Getters and setters */
	public int getNumeroMotores() {
		return numeroMotores;
	}
	public void setNumeroMotores(int numeroMotores) {
		this.numeroMotores = numeroMotores;
	}
	public String getMarcaMotor() {
		return marcaMotor;
	}
	public void setMarcaMotor(String marcaMotor) {
		this.marcaMotor = marcaMotor;
	}
	
}

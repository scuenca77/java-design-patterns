package creacion.abstractFactory;

public class AvionReaccionFactory extends AvionAbstractFactory {
	
	AvionReaccion avion;
	
	@Override
	public AvionReaccion crearAvion(){
		
		avion = new AvionReaccion();
		
		avion.setNumeroMotores(2);
		avion.setMarcaMotor("Marca");
		
		return avion;
		
	}
	
}

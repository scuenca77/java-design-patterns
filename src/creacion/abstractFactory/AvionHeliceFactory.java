package creacion.abstractFactory;

public class AvionHeliceFactory extends AvionAbstractFactory {
	
	AvionHelice avion;
	
	@Override
	public AvionHelice crearAvion(){
		
		avion = new AvionHelice();
		
		avion.setNumeroHelices(2);
		
		return avion;
		
	}
	
}

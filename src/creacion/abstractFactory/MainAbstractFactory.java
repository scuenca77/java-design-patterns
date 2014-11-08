package creacion.abstractFactory;

public class MainAbstractFactory {
	
	public MainAbstractFactory(){
		
		// Se crea una instancia de la fábrica de aviones de hélice, que por
		// defecto nos crea y devuelve un avión de dos hélices. Luego le
		// modificamos atributos a nuestro gusto.
		AvionHeliceFactory fabricaDeAvionesDeHelice = new AvionHeliceFactory();
		AvionHelice avionDeHelice = fabricaDeAvionesDeHelice.crearAvion();
		System.out.println("El número de hélices de este avión de hélices es: "
				+ avionDeHelice.getNumeroHelices());
		avionDeHelice.setNumeroHelices(6);
		System.out.println("El número de hélices ha cambiado a: "
				+ avionDeHelice.getNumeroHelices());

		// Se crea una instancia de la fábrica de aviones a reacción, que por
		// defecto nos crea y devuelve un avión de dos motores. Luego le
		// modificamos atributos a nuestro gusto.
		AvionReaccionFactory fabricaDeAvionesDeReaccion = new AvionReaccionFactory();
		AvionReaccion avionDeReaccion = fabricaDeAvionesDeReaccion.crearAvion();
		System.out.println("El número de motores de este avión a reacción es: "
				+ avionDeReaccion.getNumeroMotores());
		avionDeHelice.setNumeroHelices(4);
		System.out.println("El número de motores ha cambiado a: "
				+ avionDeHelice.getNumeroHelices());
		
	}
	
	public static void main(String args[]){
		new MainAbstractFactory();
	}
	
}

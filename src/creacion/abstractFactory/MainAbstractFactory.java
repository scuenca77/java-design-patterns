package creacion.abstractFactory;

public class MainAbstractFactory {
	
	public MainAbstractFactory(){
		
		// Se crea una instancia de la f�brica de aviones de h�lice, que por
		// defecto nos crea y devuelve un avi�n de dos h�lices. Luego le
		// modificamos atributos a nuestro gusto.
		AvionHeliceFactory fabricaDeAvionesDeHelice = new AvionHeliceFactory();
		AvionHelice avionDeHelice = fabricaDeAvionesDeHelice.crearAvion();
		System.out.println("El n�mero de h�lices de este avi�n de h�lices es: "
				+ avionDeHelice.getNumeroHelices());
		avionDeHelice.setNumeroHelices(6);
		System.out.println("El n�mero de h�lices ha cambiado a: "
				+ avionDeHelice.getNumeroHelices());

		// Se crea una instancia de la f�brica de aviones a reacci�n, que por
		// defecto nos crea y devuelve un avi�n de dos motores. Luego le
		// modificamos atributos a nuestro gusto.
		AvionReaccionFactory fabricaDeAvionesDeReaccion = new AvionReaccionFactory();
		AvionReaccion avionDeReaccion = fabricaDeAvionesDeReaccion.crearAvion();
		System.out.println("El n�mero de motores de este avi�n a reacci�n es: "
				+ avionDeReaccion.getNumeroMotores());
		avionDeHelice.setNumeroHelices(4);
		System.out.println("El n�mero de motores ha cambiado a: "
				+ avionDeHelice.getNumeroHelices());
		
	}
	
	public static void main(String args[]){
		new MainAbstractFactory();
	}
	
}

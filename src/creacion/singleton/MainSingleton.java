package creacion.singleton;

public class MainSingleton {
	
	private Coche primerCoche;
	private Coche segundoCoche;
	private Coche tercerCoche;
	
	public MainSingleton(){
		primerCoche = Coche.getInstance();
		segundoCoche = Coche.getInstance();
		tercerCoche = Coche.getInstance();
	}
	
	public static void main(String args[]){
		new MainSingleton();
	}
	
}
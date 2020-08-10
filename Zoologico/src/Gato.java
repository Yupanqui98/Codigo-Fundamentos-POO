package Zoologico;

public class Gato extends Felino {
	
	public void sonido() {
		//con Super llamas al metodo del padre superior
		//en este caso a "Felino".
		super.sonido();
		System.out.println("Sonido de gato");
	}
}	
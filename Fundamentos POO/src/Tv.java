
//estado-caracter�stica-Variables
// comportamiento-funciones o m�todos

	public class Tv {
	//atributos
	public boolean encendido;
	public int volumen;
	public int canal;
	
	//m�todos
	public void apagar() {
		encendido = false;
	}
	public void encender() {
		encendido = true;
}
	public void avanzarCanal() {
		if(encendido) 
			canal++;			
}
	public void SubirVolumen() {
		if(encendido && volumen <100) 
			volumen++;	
	}
	public void bajarVolumen() {
		if(encendido && volumen <0) 
			volumen--;	
	}
}
package main.java.Batalla.naval.TPFinal;
import java.util.ArrayList;

public class Tablero implements Observer {
	public static final int CANT_BARCOS = 6;
	DisplayDelTablero display;
	public Tablero(DisplayDelTablero display) {
		this.display = display;
		this.display.registerObserver(this);
		colocarBarcos();
	}

	public void update() {

	}
    public void colocarBarcos() {
    	BarcosFactory factory = new BarcosFactory();
		ArrayList<Barco> barcos = new ArrayList<Barco>();
		
		barcos.add(factory.createBarco("corbeta"));
		barcos.add(factory.createBarco("corbeta"));
		barcos.add(factory.createBarco("corbeta"));
		barcos.add(factory.createBarco("fragata"));
		barcos.add(factory.createBarco("fragata"));
		barcos.add(factory.createBarco("destructor"));
		display.colocarBarcos(barcos, 0); //esto esta harcodeado, como se me borro lo soluciono rapido asi
    }
	public void checkDisparo(int a, int b) {
		// TODO implement here
	}


	public void getBarco(int a, int b) {
		// TODO implement here
	}

}
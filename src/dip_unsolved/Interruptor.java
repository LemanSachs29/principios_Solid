package dip_unsolved;

//Clase Interruptor que depende de Bombilla (violación del DIP)
public class Interruptor {
	private Bombilla bombilla;

	public Interruptor(Bombilla bombilla) {
		this.bombilla = bombilla;
	}

	public void operar() {
		bombilla.encender();
//Más tarde: bombilla.apagar();
	}
}
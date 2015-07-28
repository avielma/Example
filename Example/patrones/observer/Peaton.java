package patrones.observer;

import java.util.Observer;
import java.util.Observable;
import patrones.observer.Semaforo;


/**
*
*
*Clase que representa  a un peaton 
*
*
**/

public class Peaton implements Observer{


	/**
	*
	*
	*
	*Implementacion del metodo que provee Observer 
	*Con este se notifica al peaton cuando el semaforo a cambiado, permitiendole al peaton verificar si es su turno para cruzar o detenerse. 
	*
	*
	*
	*
	**/


	public void update(Observable o , Object arg){
		
		if (o instanceof Semaforo){
			System.out.println("Peaton llegando al semaforo");
			Semaforo sf=(Semaforo)o;
			if (sf.getLuz().equals("Verde.")){
				System.out.println("Peaton Cruzando en luz Verde.");
			}if (sf.getLuz().equals("Roja.")){
				System.out.println("Peaton Detenido en luz Roja");
			}
		}
	}
}

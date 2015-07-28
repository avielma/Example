package patrones.observer;
import java.util.Observable;
import java.lang.Runnable;




/**
*
*
*
*
*Clase que implementa el interface Observable correspondiente al patron de diseño Observer 
*Esta clase representa un semaforo peatonal cuando su luz esta en roja informa a los peatones 
*que no es posible cruzar la avenida en ese momento.Cuando cambia a Verde le informa a los peatones 
*que ya es posible cruzar.
*
*
*
*
**/
public class Semaforo extends Observable implements Runnable{
	public String luz;

	/**
	*
	*Construcctor
	*
	**/

	public Semaforo(){
		super();
		luz=new String("Roja.");

	}
	/**
	*
	*metodo encargado de retornar el valor de la luz 
	*
	*
	**/

	public String getLuz(){
		return luz;
	}
	/**
	*
	*
	*Metodo que representa el comportamiento de cambio a luz verde de un semaforo.
	*
	*
	**/

	public void changeGreen(){
		System.out.println("Cambiando semaforo a luz Verde.");
		luz="Verde.";
		this.setChanged();
		this.notifyObservers();

	}
	/**
	*
	*
	*
	*Metodo que representa el comportamiento de cambio a luz Roja de un semaforo.
	*
	*
	*
	**/
	public void changeRed(){
		System.out.println("Cambiando Semaforo a luz Roja");
		luz="Roja.";
		this.setChanged();
		this.notifyObservers();
	}


	/**
	*	
	*Implementacion del metodo run de la interface runnable 
	*aqui se encuentra la funcionalidad del cambio de luz del semaforo 
	*verde, espera, rojo, en 10 ciclos.
	*
	*
	**/

	public  void run(){
		System.out.println("Iniciando el funcionamiento del semaforo");
		for (int i=0; i<10;i++){
			this.changeGreen();
			try{
				Thread.sleep(4000);
			}catch(Exception e){
				e.printStackTrace();
			}
			this.changeRed();
		}
	}
}

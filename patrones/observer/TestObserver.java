package patrones.observer;

import patrones.observer.*;
import java.lang.Thread;

public class TestObserver{
	/**
	*
	*
	*
	*Metodo que permite verificar y probar el comportamiento del patron de diseño observer, 
	*en este se crea un semaforo se le añaden varios observadores que son representados como 
	*los peatones y se implementa con un hilo la funcionalidad de cambiar de luz al semaforo 
	*permitiendo apreciar el comportamiento de los peatones al momento de ser notificados de que el semaforo a cambiado. 
	*
	*
	*
	*
	**/
	public static void main(String... arg){
		Semaforo semaforo = new Semaforo();
		Peaton p1 = new Peaton();
		Peaton p2 = new Peaton();
		Peaton p3 = new Peaton();
		Peaton p4 = new Peaton();
		semaforo.addObserver(p1);
		semaforo.addObserver(p2);
		semaforo.addObserver(p3);
		semaforo.addObserver(p4);
		Thread t = new Thread(semaforo);
		t.start();
	}
}

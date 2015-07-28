package patrones.factory;

import patrones.factory.Auto;


/**
*
*Definimos un tipo de Auto en este caso un Mercedes. Esta CLase implementa un Auto
*
*
*
**/
public class BMW implements Auto{
	/**
	*
	*Implementando la aceleracion de un BMW.
	*
	*
	**/

	public void acelera(){
		int ac=0;
		while(ac<100){
			ac++;
			System.out.println("acelerando BMW : "+ac );
		}
	}
}

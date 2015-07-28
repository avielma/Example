package patrones.factory;

import patrones.factory.Auto;


/**
*
*Definimos un tipo de Auto en este caso un Mercedes. Esta CLase implementa un Auto
*
*
*
**/
public class Mercedes implements Auto{
	/**
	*
	*Implementando la aceleracion de un mercedes.
	*
	*
	**/

	public void acelera(){
		int ac=0;
		while(ac<100){
			ac+=ac;
			System.out.print("acelerando Mercedes : "+ac );
		}
	}
}

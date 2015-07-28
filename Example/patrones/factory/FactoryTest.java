package patrones.factory;

import patrones.factory.*;




/**
*
*
*Clase que me permite demostrar la implementacion de un patron factory.
*Tenemos una estructura de herencia donde definimos un auto a traves de una interface y 
*posteriormente definimos sus especializaciones como BMW y Mercedes. 
*A continuacion definimos una interface Factory que define su comportamiento 
*create() y que luego es implementado por sus factorias especializadas 
*FactoryBMW
*
**/
public class FactoryTest{
	static FactoryBMW factory = new FactoryBMW();
	/**
	*
	*Se prueba la creacion de un BMW sin la utilizacion del operador new
	*y luego probamos su aceleracion.
	*
	**/

	public static void main(String... arg){
		BMW bmw =(BMW) factory.create();
		bmw.acelera();
	}

}

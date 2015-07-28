package patrones.factory;

import patrones.factory.BMW;
import patrones.factory.Auto;

/**
*Clase que viene a implementar la factoria de objetos tipo BMW
*
**/
public class FactoryBMW implements FactoryAuto{
	/**
	*
	*Metodo donde se implementa la creacion de BMW.
	**/

	public  Auto create(){
		return new BMW();
	}
}

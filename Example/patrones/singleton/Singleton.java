package patrones.singleton;


/**
*
*singleton (instancia única) está diseñado para restringir la creación de 
*objetos pertenecientes a una clase o el valor de un tipo a un único objeto.
*Su intención consiste en garantizar que una clase sólo tenga una instancia 
*y proporcionar un punto de acceso global a ella
*
*
**/



public class Singleton{

private static Singleton s;
private String nombre;

/**
*Constructor de la Clase declarado private 
**/
private Singleton(){
	nombre="Soy un patron de diseño Singleton...";
}

/**
*Metodo publico estatico que permite y regula la instanciacion de la clase
**/
public static Singleton getInstance(){
	if (s==null){
		s=new Singleton();
	}
	return s;
}
public String getNombre(){
   return nombre;
}

}

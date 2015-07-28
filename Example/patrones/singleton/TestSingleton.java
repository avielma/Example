package patrones.singleton;
import patrones.singleton.Singleton;

public class TestSingleton{
 
 /**
  * La finalidad de esta clase es la de apreciar el comportmaineto del patron Singleto.
  * creamos varias referencias al objeto marcado como singleton y comparamos las posiciones de memoria de esas referencias
  * pudiendo concluir que es el mismo sobjeto 
  * */
 public static void main (String... arg){
    Singleton s = Singleton.getInstance();
    Singleton s1 = Singleton.getInstance();
    System.out.println("Primera Referencia de Singleton s "+s.getNombre());
    System.out.println("Primera Referencia de Singleton s1 "+s1.getNombre());
    System.out.println("Comparando Referencias de Singleton "+ (s==s1));//Se comprueba de que nos referimos al mismo Objeto
 }
}

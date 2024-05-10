/*Se pide crear dos métodos, uno que cuente los números impares de una lista y otro que retorne los números consecutivos que hay en una lista.
Adjuntamos como debería ser el main para que puedan auto evaluarse.
Es una actividad diagnóstico por lo que les pedimos que la realicen de manera individual, si no les sale entregan lo que pudieron hacer. 
Entregar en un repositorio de GitHub.
 */
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> miLista = new ArrayList<>();
        miLista.add(27);
        miLista.add(6);
        miLista.add(14);
        miLista.add(8);
        miLista.add(9);
        miLista.add(12);
        miLista.add(13);


        int cantidad = ListAnalyzer.contadorImpares(miLista);
        System.out.println( "Cantidad de números impares: " + cantidad ); 
        // Salida: Cantidad de núemeros impares: 3

        List<Integer> numConsecutivos = ListAnalyzer.numerosConsecutivos(miLista);
        System.out.println("Números consecutivos de la lista: " + numConsecutivos);
        //Salida: Números consecutivos de la lista: [8, 9, 12, 13]
    }

    public class ListAnalyzer{
        public static int contadorImpares(List<Integer> lista){// con el static podemos llamar el metodo sin necesidad de crear el objeto
            int contador = 0;
            for (int i = 0; i < lista.size(); i++){
                if (lista.get(i) % 2 != 0){
                    contador++;
                }
            }
            return contador;
        }
    
        public static List<Integer> numerosConsecutivos(List<Integer> lista){
            List<Integer> consecutivos = new ArrayList<>();
            for (int i = 0; i < lista.size() - 1; i++){
                if (lista.get(i) + 1 == lista.get(i + 1)){
                    consecutivos.add(lista.get(i));
                    consecutivos.add(lista.get(i + 1));
                }
            }
            return consecutivos;
        }
    }
}




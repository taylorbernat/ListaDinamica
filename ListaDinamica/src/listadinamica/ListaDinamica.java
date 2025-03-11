package listadinamica;

import java.util.ArrayList;
import java.util.Arrays;

public class ListaDinamica {
    public static void main(String[] args) {
        Metodos metodos = new Metodos();

        
        metodos.add("Elemento 1");
        metodos.add("Elemento 2");
        metodos.add("Elemento 3");

        
        System.out.println("Elemento en indice 1: " + metodos.get(1));

        
        metodos.set(1, "Elemento Modificado");
        System.out.println("Elemento en indice 1 despues de modificar: " + metodos.get(1));

        
        metodos.remove("Elemento 3");
        System.out.print("Elemento eliminado::::::");
        metodos.mostrarLista();

        
        System.out.println("Tamano de la lista: " + metodos.size());

        
        ArrayList<String> nuevaColeccion = new ArrayList<String>();
        
        nuevaColeccion.add("Elemento 3");
        nuevaColeccion.add("Elemento 4");
        
        
        metodos.addAll(nuevaColeccion);
        metodos.mostrarLista();

        
        System.out.println("Array de la lista: " + Arrays.toString(metodos.toArray()));

        
        metodos.clear();
        System.out.println("Lista despues de limpiar: ");
        metodos.mostrarLista();

        
        System.out.println("¿Contiene 'Elemento 1'? " + metodos.contains("Elemento 1"));

    
        System.out.println("¿Esta vacia la lista? " + metodos.isEmpty());

      
        metodos.add("Elemento 3");
        metodos.add("Elemento 1");
        metodos.add("Elemento 2");
        System.out.println("sin ordenar");
        metodos.mostrarLista();
        metodos.sort();
        System.out.println("Ordenados");
        metodos.mostrarLista();
    }
}

package listadinamica;

import java.util.ArrayList;  
import java.util.Collections;

public class Metodos {
    private ArrayList<String> lista;

    public Metodos() {
        this.lista = new ArrayList<>();
    }

   
    public void add(String elemento) {
        this.lista.add(elemento); 
    }

   
    public String get(int indice) {
        if (indice >= 0 && indice < this.lista.size()) {
            return this.lista.get(indice); 
        } else {
            return "Índice fuera de rango";
        }
    }

    
    public void set(int indice, String nuevoElemento) {
        if (indice >= 0 && indice < this.lista.size()) {
            this.lista.set(indice, nuevoElemento); 
        } else {
            System.out.println("Índice fuera de rango");
        }
    }

   
    public void remove(String elemento) {
        this.lista.remove(elemento); 
    }

  
    public int size() {
        return this.lista.size(); 
    }

    
    public void addAll(java.util.Collection<? extends String> c) {
        this.lista.addAll(c);
    }


    public String[] toArray() {
        return this.lista.toArray(new String[0]); 
    }

    
    public void clear() {
        this.lista.clear(); 
    }

    
    public boolean contains(String o) {
        return this.lista.contains(o); 
    }

    
    public boolean isEmpty() {
        return this.lista.isEmpty(); 
    }

  
    public void sort() {
        Collections.sort(this.lista);
    }

   
    public void mostrarLista() {
        System.out.println("Contenido de la lista: " + this.lista); 
    }
}

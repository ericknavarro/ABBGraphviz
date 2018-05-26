/*
 * Ejemplo desarrollado por Erick Navarro
 * Blog: e-navarro.blogspot.com
 * Octubre - 2015
 */

package abbgraphviz;

import abb.ArbolBinarioBusqueda;

/**
 * Clase principal de la aplicación.
 * @author Erick Navarro
 */
public class ABBGraphviz {

    /**
     * Método principal de la aplicación
     * @param args los argumentos de la línea de comando
     */
    public static void main(String[] args) {
        //Creamos un árbol cuyos nodos contendrán solamente texto
        ArbolBinarioBusqueda arbol_texto=new ArbolBinarioBusqueda();
        //Llenamos con información el árbol
        arbol_texto.insertar("Juan");
        arbol_texto.insertar("Pedro");
        arbol_texto.insertar("María");
        arbol_texto.insertar("Roberto");
        arbol_texto.insertar("Teodoro");
        arbol_texto.insertar("Manuel");
        arbol_texto.insertar("Diego");
        arbol_texto.insertar("Alejandro");
        //Graficamos el árbol generando la imagen arbol_texto.jpg
        arbol_texto.graficar("arbol_texto.jpg");
        //Imprimimos el contenido del árbol ordenado
        arbol_texto.inorden();
        
        System.out.println();
        //Creamos un árbol cuyos nodos contendrán solamente numeros
        ArbolBinarioBusqueda arbol_numeros=new ArbolBinarioBusqueda();
        //Llenamos con información el árbol
        arbol_numeros.insertar(12);
        arbol_numeros.insertar(5);
        arbol_numeros.insertar(26);
        arbol_numeros.insertar(33);
        arbol_numeros.insertar(59);
        arbol_numeros.insertar(27);
        arbol_numeros.insertar(15);      
        //Graficamos el árbol generando la imagen arbol_numeros.jpg
        arbol_numeros.graficar("arbol_numeros.jpg");
        //Imprimimos el contenido del árbol ordenado
        arbol_numeros.inorden();
    }
    
}

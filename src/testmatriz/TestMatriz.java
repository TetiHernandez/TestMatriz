// Author: Hernandez Amura Gilberto
package testmatriz;

public class TestMatriz {

    public static void main(String[] args) {
        Matriz m1 = new Matriz();
        m1.armar();
        m1.mostrar();
        System.out.println("Filtrar pares: ");
        m1.mostrarPares();
    }
    
}

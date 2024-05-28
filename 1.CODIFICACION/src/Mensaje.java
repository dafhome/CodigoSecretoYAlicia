import java.util.Scanner;

import codificacion.Metodos;
import codificacion.Programa;

public class Mensaje {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Metodos.limpiarPantalla();
        String frase;
        System.out.println();
        Metodos.imprimir("Como ya sabras hemos entrado en Guerra con Corea del Norte.", 1, 1);
        Metodos.imprimir("Estoy aquí para ayudarte a codificar y decodificar el mensaje a enviar a nuestros aliados.",
                1, 1);
        System.out.println("--------------------------------------------------------------------------------");
        Metodos.imprimir(
                "Primero de todo debes indicarme cual es la clave de encriptación. Recuerda que puedes indicarme un valor numerico que usaras después para decodificar el mensaje con este programa. ",
                1, 1);
        System.out.println();
        Metodos.imprimir("Clave: ", 0, 1);

        int clave = scan.nextInt();
        scan.nextLine();
        Metodos.imprimir("Guarda esta clave en un lugar seguro.", 1, 1);
        System.out.println("--------------------------------------------------------------------------------");
        boolean validar = false;

        while (!validar) {
            System.out.println();
            Metodos.imprimir("¿Que quieres hacer?\n1.Codificar\n2.Descodificar\n3.Cambiar Clave\n0.Salir", 1, 1);
            Metodos.imprimir("Opcion: ", 0, 1);
            int opcion = Metodos.validarInt(scan);

            switch (opcion) {
                case 1:
                    Metodos.imprimir("Indicame la frase: ", 0, 1);
                    frase = scan.nextLine();
                    System.out.println(Programa.codificar(frase, clave));
                    break;
                case 2:
                    Metodos.imprimir("Indicame la frase: ", 0, 1);
                    frase = scan.nextLine();
                    System.out.println(Programa.descodificar(frase, clave));
                    break;
                    case 3:
                    Metodos.imprimir("Vamos a cambiar la clave.", 1, 1);
                    Metodos.imprimir("Clave: ", 0, 1);
                    clave = scan.nextInt();
                    scan.nextLine();
                    break;
                case 0:
                    Metodos.imprimir("Nos vemos pronto cuando tengas el mensaje.", 1, 1);
                    validar = true;
                    break;
                default:
                    Metodos.imprimir("No es una opción valida. Prueba de nuevo!", 1, 1);

                    break;
            }

        }

    }
}
// Hemos entrado en guerra con Corea del Norte y necesitamos codificar nuestros
// mensajes para evitar que nuestros planes sean interceptados.

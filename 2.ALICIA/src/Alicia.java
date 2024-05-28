import java.util.Scanner;

public class Alicia {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        final int HORA = 20;

        System.out.println();
        System.out.println("Bienvenid@! ¿Como te llamas?");
        System.out.print("Cliente: ");
        String nombre = scan.nextLine();

        boolean validarBucle = false;
        int cont = 0;
        boolean cerveza = false;
        boolean alcohol = false;
        boolean alicia = false;


        if (!nombre.equalsIgnoreCase("Alicia")) {
            System.out.println("Camarero: Gracias por venir! Estamos esperando a Alicia.");

        }

        else {
            alicia = true;
            
            System.out.println("Camarero: Hola Alicia! Puedes pasar!");
            System.out.println("Camarero: Que te apetece tomar?");
            System.out.print("Alicia: ");
            String bebida = scan.nextLine();

            if (!bebida.equalsIgnoreCase("birra") && !bebida.equalsIgnoreCase("cerveza")) {
                System.out.println("Camarero: Alicia, gracias por venir pero no tenemos " + bebida
                        + " solamente tenemos cervezas para beber!");
                cerveza = false;
            }

            else {
                cerveza = true;
                System.out.println("Camarero: Perfecto te pongo una cerveza");
                System.out.println("Camarero: ¿Quieres con alcohol o no?");
                System.out.println("Alicia: Mmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
                System.out.println("Alicia: Pues no lo se.");

                do {
                    System.out.println("Alicia: ¿Bailarias para mi?");
                    System.out.print("Camarero: ");
                    String baile = scan.nextLine();
                    if (baile.equalsIgnoreCase("si")) {
                        System.out.println(
                                "Alicia: Como has bailado para mi me tomaré una cerveza con alcohol! Una IPA.");
                        validarBucle = true;
                        alcohol = true;
                    } else {
                        System.out.println("Alicia: Por cierto, ¿Que hora es?");
                        System.out.print("Camarero: Son las ");
                        int horaRespuesta = scan.nextInt();
                        scan.nextLine();

                        if (horaRespuesta == HORA) {
                            System.out.println("Alicia: Ya son las 20h? Ponme una paulaner!");
                            validarBucle = true;
                            alcohol = true;
                        } else if(cont == 2){
                            System.out.println("Ponme una SanMiguel sin alcohol. ");
                            alcohol = false;
                        }
                        cont++;

                    }
                } while (!validarBucle && cont < 3);

                
            }

        }

        if (alicia) {
            if (cerveza) {
                if (alcohol) {
                    System.out.println("Ha venido Alicia y se ha tomado una cerveza con alcohol.");
                }
                else{
                    System.out.println("Ha venido Alicia y se ha tomado una cerveza sin alcohol.");
                }
            }
            else{
                System.out.println("Ha venido Alicia pero no quería cerveza.");
            }
        }
        else{
            System.out.println("No ha venido Alicia! Seguiremos esperandola.");
        }

        scan.close();
    }

}

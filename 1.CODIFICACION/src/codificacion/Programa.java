package codificacion;

import java.util.ArrayList;

public class Programa {
    public static String codificar(String frase, int codigo){
        ArrayList<Character> caracteres = new ArrayList<>();
        ArrayList<Character> caracteresCodif = new ArrayList<>();
        char x;
        int c =(codigo%9);

        for (int i=0;i<frase.length();i++){
            caracteres.add(frase.charAt(i));
        }
        char letra;
        for (int i = 0; i<caracteres.size();i++){
            letra = caracteres.get(i);
            x = (char) (caracteres.get(i)+c);
            if (x>126){
                x = (char) (x+1);
            }
            caracteresCodif.add(x);
        }
        String codificado = "";
        for (Character ch : caracteresCodif) {
            codificado += ch;
        }
        return codificado;
    }
    public static String descodificar(String frase, int codigo){
        ArrayList<Character> codif = new ArrayList<>();
        ArrayList<Character> descodif = new ArrayList<>();
        char x;
        int c =(codigo%9);

        for (int i=0;i<frase.length();i++){
            codif.add(frase.charAt(i));
        }
        char letra;
        for (int i = 0; i<codif.size();i++){
            letra = codif.get(i);
            if (letra>126) {
                letra=(char)(letra-1);
            }
            x = (char) (letra-c);
            
            descodif.add(x);
        }
        String descodificado = "";
        for (Character ch : descodif) {
            descodificado += ch;
        }
        return descodificado;
    }
}

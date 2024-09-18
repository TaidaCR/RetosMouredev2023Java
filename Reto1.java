
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

/*
# Reto #1: EL "LENGUAJE HACKER"
#### Dificultad: Fácil | Publicación: 02/01/23 | Corrección: 09/01/23

 * Escribe un programa que reciba un texto y transforme lenguaje natural a
 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
 *  se caracteriza por sustituir caracteres alfanuméricos.
 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/) 
 *   con el alfabeto y los números en "leet".
 *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
 */

public class Reto1 {

    private static Scanner scanner = new Scanner(System.in);

    public static String translate(){

        Map <String, String> leetDictionary=new HashMap<>();

        leetDictionary.put("a", "4");
        leetDictionary.put("b", "I3");
        leetDictionary.put("c", "[");
        leetDictionary.put("d", ")");
        leetDictionary.put("e", "3");
        leetDictionary.put("f", "|=");
        leetDictionary.put("g", "&");
        leetDictionary.put("h", "#");
        leetDictionary.put("i", "1");
        leetDictionary.put("j", ",_|");
        leetDictionary.put("k", ">|");
        leetDictionary.put("l", "1");
        leetDictionary.put("m", "/|/|");
        leetDictionary.put("n", "^/");
        leetDictionary.put("o", "0");
        leetDictionary.put("p", "|*");
        leetDictionary.put("q", "(_,)");
        leetDictionary.put("r", "I2");
        leetDictionary.put("s", "5");
        leetDictionary.put("t", "7");
        leetDictionary.put("u", "(_)");
        leetDictionary.put("v", "|/");
        leetDictionary.put("w", "|/|/");
        leetDictionary.put("x", "><");
        leetDictionary.put("y", "j");
        leetDictionary.put("z", "2");
        leetDictionary.put("1", "L");
        leetDictionary.put("2", "R");
        leetDictionary.put("3", "E");
        leetDictionary.put("4", "A");
        leetDictionary.put("5", "S");
        leetDictionary.put("6", "b");
        leetDictionary.put("7", "T");
        leetDictionary.put("8", "B");
        leetDictionary.put("9", "g");
        leetDictionary.put("0", "o");
        leetDictionary.put(" ", " ");

        System.out.println("Introduce un mensaje: ");
        String msg=scanner.nextLine();

        boolean seguirBucle=true;
        String msgLeet="";
        
        while (seguirBucle){
            if (msg.isEmpty()){
                System.out.println("Introduce una palabra válida: ");
                    msg = scanner.nextLine();
            } else {
                    for (int lp = 0; lp < msg.length(); lp++) {
                        char c = msg.toLowerCase().charAt(lp);
                        String cString=String.valueOf(c).toLowerCase();
                        if (!leetDictionary.containsKey(cString)){
                            msgLeet+=c;
                        } else{
                            String ll=leetDictionary.get(cString);
                            msgLeet+=ll;
                        }
                    }
                    seguirBucle=false;
            }
        }
        return msgLeet;
        
    }
    public static void main(String[] args) {
        System.out.println(translate()); 
    }
}



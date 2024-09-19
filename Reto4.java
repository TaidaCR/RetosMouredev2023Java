import java.util.InputMismatchException;
import java.util.Scanner;
/*
# Reto #4: PRIMO, FIBONACCI Y PAR
#### Dificultad: Media | Publicación: 23/01/23 | Corrección: 30/01/23

## Enunciado
 * Escribe un programa que, dado un número, compruebe y muestre si es primo, fibonacci y par.
 * Ejemplos:
 * - Con el número 2, nos dirá: "2 es primo, fibonacci y es par"
 * - Con el número 7, nos dirá: "7 es primo, no es fibonacci y es impar"
 */
public class Reto4 {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(checkTheNumber());
    }

    private static String primeNumber (Double num){
        String msg=" is a prime number, ";

        if (num<2){
            msg=" isn't a prime number,";
        } else if (num==2){
            msg=" is a prime number,";
        } else if (num%2==0){
            msg=" isn't a prime number,";
        } else {
            for (int i=3 ;i<num; i=i+2){   
                if ((num%i==0)){
                    msg = " isn't a prime number,";
                    break;
                }
            }
        }
        return msg;
    }

    private static String fibonacciNumber(Double num){
        String msg1="";
        Double n1=5*num*num-4;
        Double n2=5*num*num+4;

        int r1= (int) Math.sqrt(n1);
        int r2=(int) Math.sqrt(n2);

        msg1=(((r1*r1==n1 || r2*r2==n2)&& (num>0))? (msg1+= " and it's a fibonacci number.") : (msg1+= " and it isn't a fibonacci number."));
        return msg1;
    }

    private static String evenNumber(Double num){
        String msg1="";
        msg1=(num%2==0 ? (msg1+= " it's an even number"):(msg1 += " it isn't an even number"));
        return msg1;
    }

    private static String checkTheNumber(){
        Double num=0.0;
        String msg1="";
        boolean keep=true;

        while (keep){
            try {
                System.out.println("Please, insert a number: ");
                num=scanner.nextDouble();
                scanner.close();
                keep=false;
            }catch (InputMismatchException e){
                System.out.println("Wrong input.");
                scanner.nextLine();
            }
        }
        msg1= "The number " + num + primeNumber(num) + evenNumber(num)+ fibonacciNumber(num);  
        return msg1;
    }
}

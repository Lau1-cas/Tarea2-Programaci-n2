import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Clase2Progra2 {

    private static Scanner teclado = new Scanner(System.in);

    public static String codifica(String palabra) {

        int codificar = 0;
        String resultado = "";

        int llave = 9;

        for (int x = 0; x < (int) palabra.length(); x++) {

            codificar = (int) palabra.charAt(x);
            codificar = codificar + llave;
            char caracter = (char) codificar;

            resultado = resultado + caracter;

        }
        return resultado;
    }

    public static void main(String[] args) {
        String res;
        String pal;
        System.out.println("Ingresa una palabra");
        pal = teclado.nextLine();
        res = codifica(pal);
        System.out.println("res palabra codificada =" + res);
        
         byte[] byt = res.getBytes(StandardCharsets.US_ASCII);
          
        System.out.println("ASCII  :"+byt[0]);
        System.out.println("ASCII  : "+byt[1]);
        System.out.println("ASCII  : "+byt[2]);
        System.out.println("ASCII  : "+byt[3]);
       
    }
}

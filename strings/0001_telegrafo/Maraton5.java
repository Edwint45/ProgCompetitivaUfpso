
package maraton.pkg5;

import java.util.Scanner;


public class Maraton5 {


    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        String palabra=sc.nextLine();
        int precio=0;
        for (int i = 0; i < palabra.length(); i++) {
            String letra=String.valueOf(palabra.charAt(i));
            if (letras(letra)) {
                precio+=10;
            }else if(numeros(letra)){
                precio+=20;
            }else if(letra.equals(" ")){
                continue;
            }else{
                precio+=30;
            }
            
        }
        System.out.println(precio);
    }

    private static boolean letras(String letra) {
        String letras[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for (int i = 0; i < letras.length; i++) {
            if (letra.equalsIgnoreCase(letras[i])) {
                return true;
            }
        }
        return false;
    }

    private static boolean numeros(String letra) {
        String numero[]={"1","2","3","4","5","6","7","8","9","0"};
        for (int i = 0; i < numero.length; i++) {
            if (letra.equals(numero[i])) {
                return true;
            }
        }
        return false;
    }
    
}

package maraton;
import java.util.*;
public class Maraton {
    public static void main(String[] args) {
        Scanner mc= new Scanner(System.in);
        char []valetra= {'a','e','i','o','u','b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
        char []vaEspecial={'�','!','#','$','%','&','/','(',')','=','*','+','{','}','[',']',',','-',';','<','>','_','|'};
        char[]vanumero={'1','2','3','4','5','6','7','8','9','0'};
        System.out.println("Ingrese su mensaje");
        String mensaje=mc.nextLine();
        String men=mensaje.toLowerCase();
        System.out.println(men);
        System.out.println(vaEspecial[0]);
        char [] charMen= men.toCharArray();
        int suma1=0,suma2=0,suma3=0;
        for (int i = 0; i < charMen.length; i++) {
             for (int j = 0; j < valetra.length; j++) {
                 if (charMen[i]==valetra[j]) {
                     suma1+=10;
                 }
            }
        }
        for (int i = 0; i < charMen.length; i++) {
            for (int k = 0; k < vanumero.length; k++) {
                if (charMen[i]==vanumero[k]) {
                     suma2+=20;
                 }
            }
        }
        for (int i = 0; i < charMen.length; i++) {
            for (int j = 0; j < vaEspecial.length; j++) {
                if (charMen[i]==vaEspecial[j]) {
                    suma3+=30;
                }
            }
            
        }
        int sumaTotal=suma1+suma2+suma3;
        System.out.println("El dinero total es: " + sumaTotal);
    }
}

package palindromojava;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
         sc.nextLine();
        for (int i = 0; i < n; i++) {
            String cadena=sc.nextLine();
            boolean si=false;
            cadena=cadena.replaceAll("[^a-zA-Z_0-9]", "");
            String reversa=String.valueOf(new StringBuilder(cadena).reverse());
            if (reversa.equalsIgnoreCase(cadena)) {
                System.out.println("palindromo");
            }else{
                System.out.println("no palindromo");
            }

        }
    }
    
}

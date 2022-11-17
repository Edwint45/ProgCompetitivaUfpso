
package palindromo.palabara;


public class PalindromoPalabara {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena=sc.nextLine();
        cadena.replace(" ", "");
        String reverso=String.valueOf(new StringBuilder(cadena).reverse());
        if (reverso.equals(cadena)) {
            System.out.println(cadena+" es palindromo");
        }else{
            System.out.println(cadena+" no es palindromo");
        }
        
    }
    
}

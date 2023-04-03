import java.util.Scanner;
import java.util.Stack;

public class Atv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<String> fraseInicial = new Stack<String>();
        Stack<String> fraseFinal = new Stack<String>();

        System.out.println("DIGITE A FRASE: ");
        String fraseD = input.nextLine();
        String[] frase = fraseD.split(" ");

        for(int i = 0; i < frase.length; i++){
            fraseInicial.push(new StringBuilder(frase[i]).reverse().toString());
        }

        for(int i = 0; i < frase.length; i++){
            String topo = fraseInicial.peek();
            fraseFinal.push(topo);
            fraseInicial.pop();
        }
        for(int i = 0; i < frase.length; i++){
            String topo2 = fraseFinal.peek();
            System.out.printf(topo2 + " ");
            fraseFinal.pop();
        }
    }
}

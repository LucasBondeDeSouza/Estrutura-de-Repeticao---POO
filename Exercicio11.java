import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int numero, maiorNum;

        maiorNum = 0;

        do{
            System.out.println("Digite um número (Digite '-1' para sair do Programa): ");
            numero = (sc.nextInt());
            if(numero > maiorNum){
                maiorNum = numero;
            }
        } while (numero != -1);

        System.out.println("O Maior número é: "+maiorNum);
    }
    
}

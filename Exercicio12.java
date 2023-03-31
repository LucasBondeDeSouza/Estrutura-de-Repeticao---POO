import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int numero, i, numeroNeg;

        numeroNeg = 0;

        for(i=1; i<=5; i++){
            System.out.println("Digite um número: ");
            numero = (sc.nextInt());

            if(numero < 0){
                numeroNeg = numeroNeg + 1;
            }
        }

        System.out.println("Foram Digitados "+numeroNeg+ " Números Negativos");
    }
    
}

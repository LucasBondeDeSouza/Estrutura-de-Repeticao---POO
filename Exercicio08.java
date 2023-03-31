import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int num, res;

        res = 0;

        do{
            System.out.println("Digite um número ou '0' para encerrar o Programa: ");
            num = (sc.nextInt());

            if(num >= 100 && num <= 200){
                res = res + 1;
            }
        } while(num != 0);

        System.out.println("Quantidade de Números entre 100 e 200: "+res);
    }
}

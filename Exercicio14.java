import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int numero, totNum , medNum, qtdNum;

        medNum = 0;
        qtdNum = 0;
        totNum = 0;

        do{
            System.out.println("Digite um número: ");
            numero = (sc.nextInt());
            if(numero >= 0){
                qtdNum = qtdNum + 1;
                totNum = totNum + numero;
                medNum = totNum / qtdNum;
            }
            
        } while(numero >= 0);

        System.out.println("Média: "+medNum);
    }
    
}

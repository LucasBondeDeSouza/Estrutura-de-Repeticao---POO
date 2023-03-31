import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int i, num, res;

        res = 0;
        num = 0;
 
        while(num < 1 || num > 10){
            System.out.println("Digite um número de 1 á 10:");
            num = (sc.nextInt());  
        }

        for(i=0; i<=10; i++){
            res = i*num;
            System.out.println(i+ " X "+ num+ " = "+res);
        }

    }
}

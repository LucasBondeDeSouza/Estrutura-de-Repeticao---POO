import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int i;

        System.out.println("Números Ímpares de 100 á 200");

        for(i=100; i<= 200; i++){

            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
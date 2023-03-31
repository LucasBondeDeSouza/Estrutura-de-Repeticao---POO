import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int i, cart, nmult,mcart, mnmult;
        float valor, total, totalGeral;
        mnmult = 0;
        totalGeral = 0;
        mcart = 0;

        do{
            System.out.println("Digite o numero da carteira do motorista ou 0 (zero) para terminar: ");
            cart = (sc.nextInt());
        } while (cart < 1 || cart > 4327);
        
        while(cart != 0){
            total = 0;
            System.out.println("Digite o número de multas: ");
            nmult = (sc.nextInt());

            for(i=1; i<=nmult; i++){
                System.out.println("Digite o valor da multa: ");
                valor = (sc.nextFloat());
                total = total + valor;
            }

            if(nmult > mnmult){
                mnmult = nmult;
                mcart = cart;
            }

            System.out.println("Carteira de motorista: "+cart);
            System.out.println("Valor á pagar: "+total);
            do{
                System.out.println("Digite o numero da carteira do motorista ou 0 (zero) para terminar: ");
                cart = (sc.nextInt());
            } while (cart < 1 || cart > 4327);
            totalGeral = totalGeral + total;
        }

        System.out.println("Numero da carteira com maior numeros de multas: "+mcart);
        System.out.println("Valor total arrecadado: "+totalGeral);
    }
    
}

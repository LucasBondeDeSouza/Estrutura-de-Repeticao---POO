import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        
        int fah;
        float cen;

        for(fah= 50; fah <= 70; fah++){
            cen = fah / 1.8f + 32;

            System.out.println(fah+ " Fahrenheit é igual á "+cen+ " graus Centígrados");
        }
    }
}

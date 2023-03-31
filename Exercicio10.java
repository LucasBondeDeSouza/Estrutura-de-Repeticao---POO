public class Exercicio10 {
    public static void main(String[] args) throws Exception{

        int i, total;

        total = 1;

        for(i=2; i<=64; i++){
            total = total + 2*i;
        }
        System.out.println("A Rainha pagará "+total+" grãos de Trigo ao monge");
    }
    
}

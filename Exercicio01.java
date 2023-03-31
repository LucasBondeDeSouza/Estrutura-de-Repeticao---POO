public class Exercicio01 {
    public static void main(String[] args) throws Exception {

        int i, soma;
        soma = 0;

        for(i=1; i<=500; i++){

            if(i%2!=0){
                soma += i;
                System.out.println(soma);
            }
        }
        
    }
}

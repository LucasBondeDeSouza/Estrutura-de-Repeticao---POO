import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int i, feminino, masculino;
        float maiorAltura, menorAltura, alturaMasculina, alturaFeminina, altura, sexo, mediaMulheres, mediaPopulacao, mediaHomensPorcentagem; 

        maiorAltura = 0;
        menorAltura = 1000;
        alturaMasculina = 0;
        alturaFeminina = 0;
        masculino = 0;
        feminino = 0;

        for(i = 1; i <= 50; i++){
            System.out.println("Entre com '0' para sexo MASCULINO e '1' para sexo FEMININO");
            sexo = (sc.nextInt());
            System.out.println("Entre com a altura: ");
            altura = (sc.nextFloat());

            if(sexo == 0){
                masculino = masculino + 1;
                alturaMasculina = alturaMasculina +altura;
            } else if(sexo == 1){
                feminino = feminino + 1;
                alturaFeminina = alturaFeminina + altura;
            }

            if(altura > maiorAltura){
                maiorAltura = altura;
            } else if(altura < menorAltura){
                menorAltura = altura;
            }
        }

        mediaMulheres = alturaFeminina / feminino;
        mediaPopulacao = (alturaFeminina + alturaMasculina) / 50;
        mediaHomensPorcentagem = (100/50) * masculino;

        System.out.println("Maior Altura: "+maiorAltura);
        System.out.println("Menor Altura: "+menorAltura);
        System.out.println("Média Mulheres: "+mediaMulheres);
        System.out.println("Média da Populção: "+mediaPopulacao);
        System.out.println("Porcentagem de Homens: "+mediaHomensPorcentagem+"%");
    }
}

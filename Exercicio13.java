import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        float salario, medSalario, salario100, totSalario, maiorSalario, porcSalario;
        int filhos, medFilhos, totPessoa, totFilho;

        medSalario = 0;
        salario = 0;
        totSalario = 0;
        porcSalario = 0;
        maiorSalario = 0;
        salario100 = 0;
        medFilhos = 0;
        totPessoa = 0;
        totFilho = 0;

        while(salario >= 0){
            do{
                System.out.println("Digite o salario: ");
                salario = (sc.nextFloat());
                totSalario = totSalario + salario;
                totPessoa = totPessoa + 1;
                medSalario = totSalario / totPessoa;
                if(salario > maiorSalario){
                maiorSalario = salario;
                }
                if(salario >= 0 && salario <= 100){
                salario100 = salario100 + 1;
                }
                porcSalario = salario100 / totPessoa;

            }while (salario >= 0);

            System.out.println("Digite a quantidade de Filhos: ");
            filhos = (sc.nextInt());
            totFilho = totFilho + filhos;
            medFilhos = totFilho / totPessoa;
        }
        


        System.out.println("Média Salarial da População: "+medSalario);
        System.out.println("Média de números de Filhos: "+medFilhos);
        System.out.println("O Maior salário é: "+maiorSalario);
        System.out.println("Perentual de pessoas com salário ate R$100,00: " +porcSalario);
    }   
}
public class Exercicio07 {

    public static void main(String[] args) throws Exception{

        int anos;
        float c, j;

        c = 1.50f;
        j = 1.10f;
        anos = 0;

        while(j <= c){
            c = c + 0.02f;
            j = j + 0.03f;
            anos = anos + 1;
        } 
        System.out.println("Serão necessários "+anos);

    }
}
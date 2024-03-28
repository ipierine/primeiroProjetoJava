import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento? ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Qual sua avalição do filme de 0 a 10? ");
        double avalicao = leitura.nextDouble();

        System.out.println(filme + " " + anoDeLancamento + " " + avalicao);
    }
}

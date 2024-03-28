public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        System.out.println("Nota Do Filme: " + notaDoFilme);

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Depois de mais de 30 anos de serviço como um dos principais aviadores da Marinha, 
                Pete "Maverick" Mitchell está de volta, rompendo os limites como um piloto de testes corajoso. 
                No mundo contemporâneo das guerras tecnológicas, 
                Maverick enfrenta drones e prova que o fator humano ainda é essencial.
                """;

        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media/2);
        System.out.println(classificacao);
    }
}
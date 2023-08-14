import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        //FILME 1
        Filme novoFilme1 = new Filme();

        novoFilme1.setNome("Velozes e Furiosos");
        novoFilme1.setAnoDeLancamento(2001);
        novoFilme1.setDuracaoEmMinutos(180);

        novoFilme1.exibeFichaTecnica();
        System.out.println("Duração do filme: " + novoFilme1.getDuracaoEmMinutos());

        novoFilme1.avalia(8);
        novoFilme1.avalia(9);
        novoFilme1.avalia(9);
        System.out.println("Total de avaliações: " + novoFilme1.getTotalDeAvaliacoes());
        System.out.println(novoFilme1.pegaMedia());

        //FILME 2
        Filme novoFilme2 = new Filme();
        novoFilme2.setDuracaoEmMinutos(200);

        // SÉRIE

        Serie novaSerie1 = new Serie();

        novaSerie1.setNome("Dragon Ball Z");
        novaSerie1.setAnoDeLancamento(1999);

        novaSerie1.exibeFichaTecnica();

        novaSerie1.setTemporadas(10);
        novaSerie1.setEpisodiosPorTemporada(8);
        novaSerie1.setMinutosPorEpisodio(30);
        System.out.println("Duração para maratonar " + novaSerie1.getNome() + ", "+ novaSerie1.getDuracaoEmMinutos() + " minutos.");

        // CALCULADORA DE TEMPO
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(novoFilme1);
        calculadora.inclui(novoFilme2);
        calculadora.inclui(novaSerie1);

        System.out.println(calculadora.getTempoTotal());

    }
}
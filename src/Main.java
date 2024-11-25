import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Artista> artistas = new ArrayList<>();
    private static List<Disco> discos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        while(true){
            System.out.println("1 - Cadastrar Artista");
            System.out.println("2 - Cadastrar Disco");
            System.out.println("3 - Listar Artistas");
            System.out.println("4 - Listar Discos");
            System.out.println("5 - Editar disco e artista");
            System.out.println("6 - Sair");
            System.out.println("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if(opcao == 1){
                cadastrarArtista();
            } else if(opcao == 2){
                cadastrarDisco();
            } else if(opcao == 3){
                listarArtistas();
            } else if(opcao == 4){
                listarDiscos();
            } else if(opcao == 5){
                editarArtistaEDisco();
            }else{
                break;
            }
        }
    }

    private static void cadastrarArtista(){
        System.out.println("Digite o nome do artista: ");
        String nomeArtista = scanner.nextLine();
        System.out.println("Digite o estilo musical do artista: ");
        String estiloMusical = scanner.nextLine();

        Artista artista = new Artista(nomeArtista, estiloMusical);
        artistas.add(artista);
    }

    private static void cadastrarDisco(){
        System.out.println("Digite o nome do disco: ");
        String tituloDisco = scanner.nextLine();
        System.out.println("Digite o ano de lançamento do disco: ");
        int anoLancamentoDisco = scanner.nextInt();
        scanner.nextLine();

        Disco disco = new Disco(tituloDisco, anoLancamentoDisco);

        System.out.println("Digite o nome do artista para associar ao disco : ");
        String nomeArtista = scanner.nextLine();
        Artista artista = null;
        for(Artista art : artistas){
            if(art.getNomeArtista().equals(nomeArtista)){
                artista = art;
                break;
            }
        }

        if(artista == null){
            System.out.println("Artista não encontrado");
            return;
        }

        disco.setArtista(artista);

        while(true){
            System.out.println("Digite o nome da faixa: ");
            String nomeFaixa = scanner.nextLine();
            System.out.println("Digite a duração da faixa: ");
            int duracaoFaixa = scanner.nextInt();
            
            scanner.nextLine();
            FaixaDisco faixa = new FaixaDisco(nomeFaixa, duracaoFaixa);
            disco.adicionarFaixas(faixa);

            System.out.println("Deseja adicionar mais faixas? (s/n)");
            String opcao = scanner.nextLine();
            if(opcao.equals("n")){
                break;
            }
        }

        discos.add(disco);
    }

    private static void editarArtistaEDisco(){
        System.out.println("Digite o nome do artista que deseja editar: ");
        String nomeArtista = scanner.nextLine();
        Artista artista = null;
        for(Artista art : artistas){
            if(art.getNomeArtista().equals(nomeArtista)){
                artista = art;
                break;
            }
        }

        if(artista == null){
            System.out.println("Artista não encontrado");
            return;
        }

        System.out.println("Digite o novo nome do artista: ");
        String novoNomeArtista = scanner.nextLine();
        artista.setNomeArtista(novoNomeArtista);

        System.out.println("Digite o novo estilo musical do artista: ");
        String novoEstiloMusical = scanner.nextLine();
        artista.setEstiloMusical(novoEstiloMusical);

        System.out.println("Digite o nome do disco que deseja editar: ");
        String nomeDisco = scanner.nextLine();
        Disco disco = null;
        for(Disco disc : discos){
            if(disc.getTituloDisco().equals(nomeDisco)){
                disco = disc;
                break;
            }
        }

        if(disco == null){
            System.out.println("Disco não encontrado");
            return;
        }

        System.out.println("Digite o novo nome do disco: ");
        String novoNomeDisco = scanner.nextLine();
        disco.setTituloDisco(novoNomeDisco);

        System.out.println("Digite o novo ano de lançamento do disco: ");
        int novoAnoLancamentoDisco = scanner.nextInt();
        disco.setAnoLancamentoDisco(novoAnoLancamentoDisco);

    }


    private static void listarArtistas(){
        for(Artista artista : artistas){
            System.out.println(artista);
        }
    }

    private static void listarDiscos(){
        for(Disco disco : discos){
            System.out.println(disco);
        }
    }
}


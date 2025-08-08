package br.com.alura.screensound.principal;

import java.util.Scanner;

public class Principal {

    Scanner leitura = new Scanner(System.in);

    public void exibeMenu(){
        var opcao = -1;

        while(opcao != 9){
            var menu = """
                    *** Screen Sound Músicas ***
                    
                    1 - Cadastrar Artistas
                    2 - Cadastrar Músicas
                    3 - Listar Músicas
                    4 - Buscar Músicas por Artistas
                    5 - Pesquisar Dados Sobre um Artista
                    
                    9 - Sair
                    """;

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarArtistas();
                    break;
                case 2:
                    cadastrarMusicas();
                    break;
                case 3:
                    listarMusicas();
                    break;
                case 4:
                    buscarMusicaPorArtista();
                    break;
                case 5:
                    pesquisarDadosDoArtista();
                    break;
                case 9:
                    System.out.println("Encerrando a aplicação");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void cadastrarArtistas() {
    }

    private void cadastrarMusicas(){

    }

    private void listarMusicas(){

    }

    private void buscarMusicaPorArtista(){

    }

    private void pesquisarDadosDoArtista(){

    }
}

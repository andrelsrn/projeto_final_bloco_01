import controller.ProdutoController;
import model.Produto;
import model.Tenis;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Instancia a classe controladora
        ProdutoController produtos = new ProdutoController();
        int opcao;

        while (true) {

            System.out.println("*****************************************************");
            System.out.println("                -     SHOES TO U     -               ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Cadastrar produtos                   ");
            System.out.println("            2 - Buscar produtos por ID               ");
            System.out.println("            3 - Listar todos os produtos             ");
            System.out.println("            4 - Atualizar dados do Produto           ");
            System.out.println("            5 - Deletar Produto                      ");
            System.out.println("            0 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção desejada:                          ");
            System.out.println("                                                     ");

            // Exception: Captura erro caso o usuário digite texto em vez de número
            try {
                opcao = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\nErro: Digite apenas números inteiros!");
                sc.nextLine();
                opcao = -1;
            }

            if (opcao == 0) {
                System.out.println("\nSHOES TO U - CONFORTO E ESTILO PARA SEUS PÉS!");
                sobre();
                sc.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("\n[Cadastrar produto]\n");
                    try {
                        System.out.print("Digite o ID do Produto: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Digite o Nome do Produto: ");
                        String nome = sc.nextLine();
                        System.out.print("Digite o Preço: ");
                        double preco = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Digite o Material do Tênis: ");
                        String material = sc.nextLine();

                        // Envia os dados coletados para a Controller salvar na Collection
                        produtos.cadastrar(new Tenis(id, nome, 1, preco, material));
                    } catch (InputMismatchException e) {
                        System.out.println("\nErro de digitação nos dados do produto. Cadastro cancelado.");
                        sc.nextLine(); // Limpa o buffer de segurança
                    }
                    keyPress();
                    break;

                case 2:
                    System.out.println("\n[Listar produtos por ID]\n");
                    try {
                        System.out.print("Digite o ID do produto desejado: ");
                        int buscaId = sc.nextInt();
                        sc.nextLine();
                        produtos.listarPorId(buscaId);
                    } catch (InputMismatchException e) {
                        System.out.println("\nID inválido!");
                        sc.nextLine();
                    }
                    keyPress();
                    break;

                case 3:
                    System.out.println("\n[Listar todos os produtos]\n");
                    produtos.listarTodos();
                    keyPress();
                    break;

                case 4:
                    System.out.println("\n[Atualizar dados de produto]\n");
                    try {
                        System.out.print("Digite o ID do produto que deseja atualizar: ");
                        int altId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Digite o Novo Nome: ");
                        String novoNome = sc.nextLine();
                        System.out.print("Digite o Novo Preço: ");
                        double novoPreco = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Digite o Novo Material: ");
                        String novoMaterial = sc.nextLine();

                        produtos.atualizar(new Tenis(altId, novoNome, 1, novoPreco, novoMaterial));
                    } catch (InputMismatchException e) {
                        System.out.println("\nErro na entrada de dados. Atualização cancelada.");
                        sc.nextLine();
                    }
                    keyPress();
                    break;

                case 5:
                    System.out.println("\n[Deletar produto]\n");
                    try {
                        System.out.print("Digite o ID do produto a ser apagado: ");
                        int delId = sc.nextInt();
                        sc.nextLine();
                        produtos.deletar(delId);
                    } catch (InputMismatchException e) {
                        System.out.println("\nID inválido!");
                        sc.nextLine();
                    }
                    keyPress();
                    break;

                default:
                    if (opcao != -1) {
                        System.out.println("\nOpção Inválida!\n");
                    }
                    keyPress();
                    break;
            }
        }
    }

    public static void sobre() {
        System.out.println("\n*********************************************************");
        System.out.println("Projeto Desenvolvido por: André Nunes ");
        System.out.println("Generation Brasil - Turma 85 Java ");
        System.out.println("github.com/andrel.srn");
        System.out.println("*********************************************************");
    }

    public static void keyPress() {
        System.out.println("Pressione Enter para continuar...");
        sc.nextLine();
    }
}
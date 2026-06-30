import model.Produto;
import model.Tenis;

import java.util.Scanner;

public class Menu {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 1. Instanciando um objeto do tipo Tenis
        // Sintaxe: Classe objeto = new Construtor(atributos);
        Tenis t1 = new Tenis(1, "Nike Air Max", 1, 599.90, "Mesh Respirável");

        // 2. Testando o Polimorfismo / Herança
        // Criando uma referência do tipo da classe mãe (Produto), apontando para a filha (Tenis)
        Produto t2 = new Tenis(2, "Adidas UltraBoost", 1, 899.90, "Primeknit");

        // 3. Chamando o método visualizar de cada um
        System.out.println("--- TESTANDO PRODUTO 1 ---");
        t1.visualizar(); // Vai mostrar os dados base + o material específico do tênis

        System.out.println("\n--- TESTANDO PRODUTO 2 ---");
        t2.visualizar();

            int opcao;

            while (true) {

                System.out.println("*****************************************************");
                System.out.println("                -     SHOES TO U     -               ");
                System.out.println("*****************************************************");
                System.out.println("                                                     ");
                System.out.println("            1 - Cadastrar produtos                   ");
                System.out.println("            2 - Listar produtos por ID               ");
                System.out.println("            3 - Listar todos os produtos             ");
                System.out.println("            4 - Atualizar dados do Produto           ");
                System.out.println("            5 - Deletar Produto                      ");
                System.out.println("            0 - Sair                                 ");
                System.out.println("                                                     ");
                System.out.println("*****************************************************");
                System.out.println("Entre com a opção desejada:                          ");
                System.out.println("                                                     ");

                opcao = sc.nextInt();

                if (opcao == 0) {
                    System.out.println("\nSHOES TO U - CONFORTO E ESTILO PARA SEUS PÉS!");
                    sobre();
                    sc.close();
                    System.exit(0);
                }

                switch (opcao) {
                    case 1:
                        System.out.println("Cadastrar produto!\n\n");
                        keyPress();
                        break;
                    case 2:
                        System.out.println("Listar produtos por ID\n\n");
                        keyPress();
                        break;
                    case 3:
                        System.out.println("Listar todos os produtos!\n\n");
                        keyPress();
                        break;
                    case 4:
                        System.out.println("Atualizar dados de produto!\n\n");
                        keyPress();
                        break;
                    case 5:
                        System.out.println("Deletar produto!\n\n");
                        keyPress();
                        break;

                    default:
                        System.out.println("\nOpção Inválida!\n");
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
            System.out.println("\n\nPressione Enter para continuar...");
            sc.nextLine();
        }


    }

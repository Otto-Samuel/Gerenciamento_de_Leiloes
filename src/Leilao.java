package src;

import java.util.Scanner;

public class Leilao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Edital edital = new Edital();
        Sessao sessao = new Sessao();

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=====================\n\tMenu:\n=====================\n");
            System.out.println("1. Adicionar item ao edital");
            System.out.println("2. Remover item do edital");
            System.out.println("3. Mostrar próximo item em leilão");
            System.out.println("4. Adicionar lance a um item");
            System.out.println("5. Mostrar último lance dado");
            System.out.println("6. Escolher cliente para dar lance");
            System.out.println("7. Passar para o próximo item");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    scanner.nextLine(); // Limpa o buffer
                    System.out.print("Digite o nome do item: ");
                    String nomeItem = scanner.nextLine();
                    edital.adicionarItem(new Item(nomeItem));
                    System.out.println("\n[ Item adicionado ao edital. ]");
                    break;
                case 2:
                    // Remover item do edital
                    if (edital.proximoItem() != null) {
                        edital.removerItem();
                        System.out.println("\n[ Item removido do edital. ]");
                    } else {
                        System.out.println("\n[ Não há itens no edital para remover. ]");
                    }
                    break;
                case 3:
                    // Mostrar próximo item em leilão
                    Item proximoItem = edital.proximoItem();
                    if (proximoItem != null) {
                        System.out.println("\n[ Item leiloado: " + proximoItem.getNome() + " ]");
                        System.out.println("[ Lance atual: " + proximoItem.getLanceAtual() + " ]");
                        System.out.println("[ Cliente que deu o último lance: " + (proximoItem.getClienteAtual() != null ? proximoItem.getClienteAtual().getId() : "Nenhum") + " ]");
                    } else {
                        System.out.println("\n[ Não há itens em leilão.]");
                    }
                    break;
                case 4:
                    // Adicionar lance a um item
                    if (edital.proximoItem() != null) {
                        System.out.print("Digite o valor do lance: ");
                        double valorLance = scanner.nextDouble();
                        sessao.adicionarUltimoLance(valorLance);
                        edital.proximoItem().definirLance(valorLance, null);
                        System.out.println("\n[ Lance adicionado com sucesso. ]");
                    } else {
                        System.out.println("\n[ Não há itens em leilão. ]");
                    }
                    break;
                case 5:
                    // Mostrar último lance dado
                    double ultimoLance = sessao.obterUltimoLance();
                    System.out.println("\n-> Último lance dado: " + (ultimoLance != 0.0 ? ultimoLance : "Nenhum lance foi dado ainda."));
                    break;
                case 6:
                    // Escolher cliente para dar lance
                    System.out.print("\nDigite o ID do cliente: ");
                    int idCliente = scanner.nextInt();
                    Cliente clienteSelecionado = new Cliente(idCliente);
                    System.out.print("Digite o valor do lance: ");
                    double valorLance = scanner.nextDouble();
                    sessao.adicionarUltimoLance(valorLance);
                    if (edital.proximoItem() != null) {
                        edital.proximoItem().definirLance(valorLance, clienteSelecionado);
                            System.out.println("\n[ Lance adicionado com sucesso. ]");
                    } else {
                        System.out.println("\n[ Não há itens em leilão. ]");
                    }
                    break;
                case 7:
                    // Passar para o próximo item
                    edital.passarParaProximoItem();
                    break;
                case 8:
                    continuar = false;
                    System.out.println("\nSaindo do programa...");
                    break;
                default:
                    System.out.println("\nOpção inválida.");
            }
        }

        scanner.close();
    }
}

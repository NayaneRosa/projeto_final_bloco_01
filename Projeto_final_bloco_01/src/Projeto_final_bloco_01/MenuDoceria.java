package Projeto_final_bloco_01;

import java.util.Scanner;

import Doceria_UT.Cores;

public class MenuDoceria {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int opcao;

		while (true) {
			
			System.out.println(Cores.ANSI_TEXT_RED__BACKGROUND + Cores.ANSI_TEXT_BLACK_BACKGROUND);
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("           DOCERIA DORY                              ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("\n         === Menu Princial ===                     ");
			System.out.println("                                                     ");
			System.out.println("           1 - Adicionar Produtos                    ");
			System.out.println("           2 - Listar todos os Produtos do Estoque   ");
			System.out.println("           3 - Buscar Produto                        ");
			System.out.println("           4 - Atualizar Produtos no Estoque         ");
			System.out.println("           5 - Excluir Produto do Estoque            ");
			System.out.println("           6 - Atualizar Valor do Produto            ");
			System.out.println("           7 - Sair                                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Escolha uma opção:                                   ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
						
			opcao = leia.nextInt();
			
			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nSeja Bem-Vindo a Doceria Doly!");
				leia.close();
				System.exit(0);
			}
			switch (opcao) {
			case 1: 
				System.out.println(Cores.TEXT_WHITE_BOLD + "adicionar produtos \n\n");
				
				break;
			case 2: 
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todos os produtos do Estoque\n\n");
				
				break;
			case 3: 
				System.out.println(Cores.TEXT_WHITE_BOLD + "Buscar Produto \n\n");
				
				break;
			case 4: 
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar Produtos no Estoque \n\n");
				
				break;
			case 5: 
				System.out.println(Cores.TEXT_WHITE_BOLD + "Excluir Produto do Estoque \n\n");
				
				break;
			case 6: 
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar Valor do Produto \n\n");
				
				
				break;
			default: 
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
				break;
			}
			
		}
		
	}
		 

	}


package Livros;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    public Biblioteca(ArrayList<Autores> autores, ArrayList<Livros> livros) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Boolean> disponiveis = new ArrayList<>();

        for (int i = 0; i < livros.size(); i++) {
            disponiveis.add(true);
        }

        System.out.println("==================================");
        System.out.println("      BEM-VINDO À BIBLIOTECA");
        System.out.println("==================================");

        while (true) {

            System.out.print("\nDeseja visualizar os autores cadastrados? (sim/nao): ");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {

                System.out.println("\n----- AUTORES CADASTRADOS -----");

                for (Autores autor : autores) {
                    System.out.println(
                            "Nome: " + autor.getNome()
                            + " | Nascimento: " + autor.getAnoDeNascimento()
                            + " | Idade: " + autor.getIdade());
                }

                break;

            } else if (resposta.equalsIgnoreCase("nao")) {

                break;

            } else {

                System.out.println("Resposta inválida.");

            }
        }

        while (true) {

            System.out.print("\nDeseja visualizar os livros cadastrados? (sim/nao): ");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {

                System.out.println("\n----- LIVROS DISPONÍVEIS -----");

                for (int i = 0; i < livros.size(); i++) {

                    System.out.println(
                            "ID: " + livros.get(i).getID()
                            + " | Livro: " + livros.get(i).getNomeLivro()
                            + " | Disponível: " + (disponiveis.get(i) ? "Sim" : "Não"));
                }

                break;

            } else if (resposta.equalsIgnoreCase("nao")) {

                break;

            } else {

                System.out.println("Resposta inválida.");

            }
        }

        while (true) {

            System.out.print("\nDeseja alugar um livro? (sim/nao): ");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("nao")) {
                System.out.println("Obrigado por utilizar a biblioteca!");
                break;
            }

            if (!resposta.equalsIgnoreCase("sim")) {
                System.out.println("Resposta inválida.");
                continue;
            }

            System.out.print("Digite o ID do livro: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            boolean encontrado = false;

            for (int i = 0; i < livros.size(); i++) {

                Livros livro = livros.get(i);

                if (livro.getID() == id) {

                    encontrado = true;

                    if (disponiveis.get(i)) {

                        disponiveis.set(i, false);

                        System.out.println("\nLivro alugado com sucesso!");
                        System.out.println("Livro: " + livro.getNomeLivro());

                    } else {

                        System.out.println("\nEste livro já está alugado.");

                    }

                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Nenhum livro encontrado com esse ID.");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {

        Autores epiteto = new Autores("Epiteto", 120, "25 A.C");
        Autores marcoAurelio = new Autores("Marco Aurélio", 58, "121 D.C");
        Autores seneca = new Autores("Sêneca", 69, "4 A.C");

        Livros pequenoPrincipe = new Livros("O Pequeno Príncipe", 1);
        Livros bibliaEstoica = new Livros("Bíblia Estoica", 2);
        Livros diarioBanana = new Livros("Diário de um Banana", 3);

        ArrayList<Autores> autores = new ArrayList<>();
        autores.add(epiteto);
        autores.add(marcoAurelio);
        autores.add(seneca);

        ArrayList<Livros> livros = new ArrayList<>();
        livros.add(pequenoPrincipe);
        livros.add(bibliaEstoica);
        livros.add(diarioBanana);

        new Biblioteca(autores, livros);
    }
}
import java.util.Scanner;

public class Professor {
    public String nome;
    public int idade;
    public String especialidade;

    public Professor (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Professor (String nome) {
        this.nome = nome;
    }

    public static void ensinar(Scanner scanner) {
        System.out.println("professor está ensinando os conteúdos");
    }
}

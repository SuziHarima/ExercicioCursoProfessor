import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    public String nome;
    public String descricao;
    public Professor professor;
    public int cargaHoraria;

    public Curso(String nome) {
        this.nome = nome;
    }

    public static void progresso (Scanner scanner, ArrayList<Curso> cursos) {
        System.out.println("O curso está em andamento");
    }

    public static void notas(Scanner scanner){
        System.out.println("Digite a nota: ");
        int notaAluno = scanner.nextInt();
        System.out.println("A nota é: " + notaAluno);
    }

    public static void participacao(Scanner scanner) {
        System.out.println("Aluno está participando");
    }
}

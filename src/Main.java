import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Curso> cursos = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Curso> cursosConcluidos = new ArrayList<>();

        boolean continuarLoop = true;

        do {
            System.out.println("Selecione uma opção");
            System.out.println("1 - Listar");
            System.out.println("2 - Adicionar Item");
            System.out.println("3 - Remover Item");
            System.out.println("4 - Marcar como concluído");
            System.out.println("5 - Listar concluídos");
            System.out.println("0 - Sair");

            int menuSelecao = scanner.nextInt();

            switch (menuSelecao) {
// -------------------------------------- EX2 LISTAR ITENS --------------------------------------------
                case 1:
                    listarCursos(scanner, cursos);
                    listarProfessores(scanner, professores);
                    break;
// ------------------------------------ EX 1 ADICIONAR ITEM ÀS LISTAS ---------------------------------
                case 2:
                    adicionarLista(scanner, cursos, professores);
                    break;
// ----------------------------------- EX3 REMOVER ITEM DAS LISTAS -------------------------------------
                case 3:
                    removerLista(scanner, cursos, professores);
                    break;
//------------------------------------ EX4 MARCAR COMO CONCLUÍDO ----------------------------------------
                case 4:
                    marcarConcluido(scanner, cursos, cursosConcluidos);
                    break;
// ----------------------------------- EX4 LISTAR CONCLUÍDOS --------------------------------------------
                case 5:
                    listarConcluidos(scanner, cursosConcluidos);
                    break;
// ------------------------------------ EX2 SAIR DA LISTA -----------------------------------------------
                case 0:
                    System.out.println("Sistema Encerrado");
                    continuarLoop = false;
                    break;
                default:
                    System.out.println("Comando inválido");
                    break;
            }
        } while (continuarLoop);

    }

    // ----------------------------- EX2 LISTAR ITENS ----------------------------------------------------
    public static void listarCursos(Scanner scanner, ArrayList<Curso> cursos) {
        System.out.println("\n Cursos: ");
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println(i + " - " + cursos.get(i).nome);
        }
    }

    public static void listarProfessores(Scanner scanner, ArrayList<Professor> professores) {
        System.out.println("\n Professores: ");
        for (int i = 0; i < professores.size(); i++) {
            System.out.println(i + " - " + professores.get(i).nome);
        }

    }

    // ------------------------------------ FIM EX2 LISTAR ITENS ---------------------------------------

    // ------------------------------------- EX1 ADICIONAR ITEM À LISTA --------------------------------
    public static void adicionarCurso(Scanner scanner, ArrayList<Curso> cursos) {
        System.out.print("Digite o curso: ");
        String nomeCurso = scanner.next();
        Curso curso = new Curso(nomeCurso);
        cursos.add(curso);
    }

    public static void adicionarProfessor(Scanner scanner, ArrayList<Professor> professores) {
        System.out.print("Digite o nome do professor: ");
        String nomeProfessor = scanner.next();
        Professor professor = new Professor(nomeProfessor);
        professores.add(professor);
    }

    public static void adicionarLista(Scanner scanner, ArrayList<Curso> cursos, ArrayList<Professor> professores) {

        do {
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Adicionar Curso");
            System.out.println("2 - Adicionar Professor");
            System.out.println("0 - Voltar");

            int menuAdicionar = scanner.nextInt();

            switch (menuAdicionar) {
                case 1:
                    adicionarCurso(scanner, cursos);
                    break;
                case 2:
                    adicionarProfessor(scanner, professores);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Comando inválido");
                    break;
            }
        } while (true);
    }

    // ------------------ FIM EX1 ADICIONAR ITEM À LISTA -----------------------------------------------


    // ------------------ EX 3 REMOVER ITEM LISTA -------------------------------------------------------
    public static void removerCurso(Scanner scanner, ArrayList<Curso> cursos) {
        listarCursos(scanner, cursos);
        System.out.println("Selecione o número para remover da lista: ");
        int indiceCurso = scanner.nextInt();
        cursos.remove(indiceCurso);
    }

    public static void removerProfessor(Scanner scanner, ArrayList<Professor> professores) {
        listarProfessores(scanner, professores);
        System.out.println("Selecione o número para remover da lista: ");
        int indiceProfessor = scanner.nextInt();
        professores.remove(indiceProfessor);
    }

    public static void removerLista(Scanner scanner, ArrayList<Curso> cursos, ArrayList<Professor> professores) {
        do {
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Remover Curso");
            System.out.println("2 - Remover Professor");
            System.out.println("0 - Voltar");

            int menuRemover = scanner.nextInt();

            switch (menuRemover) {
                case 1:
                    removerCurso(scanner, cursos);
                    break;
                case 2:
                    removerProfessor(scanner, professores);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Comando inválido");
                    break;
            }
        } while (true);
    }
// ----------------------------------------- FIM EX3 REMOVER LISTA ------------------------------------

// ----------------------------------------- EX5 MARCAR COMO CONCLUÍDO --------------------------------
    public static void marcarConcluido(Scanner scanner, ArrayList<Curso> cursos, ArrayList<Curso> cursosConcluidos) {
        listarCursos(scanner, cursos);
        System.out.println("Selecione curso pelo índice para marcar como concluído");
        int indiceCursoConcluido = scanner.nextInt();
        Curso cursoSelecionado = cursos.get(indiceCursoConcluido);
        cursosConcluidos.add(cursoSelecionado);
        cursos.remove(cursoSelecionado);
    }
//---------------------------------------- FIM EX5 MARCAR COMO CONCLUÍDO ------------------------------

// ---------------------------------------- EX5 LISTAR CURSOS CONCLUÍDOS ------------------------------

        public static void listarConcluidos (Scanner scanner, ArrayList<Curso> cursosConcluidos) {
            System.out.println("\n Cursos: ");
            for (int i = 0; i < cursosConcluidos.size(); i++) {
                System.out.println(i + " - " + cursosConcluidos.get(i).nome);
            }
        }
}





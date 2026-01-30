import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> listaAlunos = new ArrayList<>();
    public static void main(String[] args) {

        String aluno1= "victor";
        String aluno2= "kaique";
        String aluno3= "davi";
        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        listaAlunos.add(aluno3);

        menuLoop: while(true) {
            System.out.println("Bem-vindo ao Gerenciador de Alunos\nSelecione o que quer fazer:\n[1]Listar Aluno\n[2]Excluir Aluno\n[3]Editar Aluno\n[4]Adicionar Aluno\n[5]Sair");


            String escolha = scanner.nextLine();

            switch (escolha) {
                case "1":
                    escolha = "1";
                    listarAlunos();
                    System.out.println("Voltando ao menu...");
                    break;

                case "2":
                    escolha = "2";
                    excluirAluno();
                    System.out.println("Voltando ao menu...");
                    break;

                case  "3":
                    escolha = "3";
                    editarAluno();
                    System.out.println("Voltando ao menu...");
                    break;
                case "4":
                    escolha ="4";
                    addAluno();
                    System.out.println("Voltando ao menu...");
                    break;
                case "5":
                    escolha="5";
                    System.out.println("Saindo...");
                    break menuLoop;
            }
        }
    }
    public static void listarAlunos(){
        System.out.println(listaAlunos);

    }
    public static void excluirAluno() {
        String alunoParaExcluir = null;
        while (!listaAlunos.contains(alunoParaExcluir)) {
            listarAlunos();
            System.out.println("Selecione qual aluno excluir:");
            alunoParaExcluir = scanner.nextLine();
            if (!listaAlunos.contains(alunoParaExcluir)){
                System.out.println("O aluno escolhido não está na lista!");
            }
        }
        listaAlunos.remove(alunoParaExcluir);

    }
    public static void editarAluno() {
        String alunoParaEditar=null;
        while (!listaAlunos.contains(alunoParaEditar)) {
            listarAlunos();
            System.out.println("Selecione o aluno para editar:");
        alunoParaEditar = scanner.nextLine();
        if(!listaAlunos.contains(alunoParaEditar)){System.out.println("O nome inserido não está na lista");}
        }
        listaAlunos.remove(alunoParaEditar);
        System.out.println("Escreva o novo nome do aluno:");
        String novoNome = scanner.nextLine();
        listaAlunos.add(novoNome);
    }
    public static void addAluno() {
        String novoAluno = null;
        listarAlunos();
        System.out.println("Escreva um nome para adicionar á lista de alunos:");
        novoAluno = scanner.nextLine();
        listaAlunos.add(novoAluno);

    }}

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<String> listaAlunos = new ArrayList<>();
    public static void main(String[] args) {

        String aluno1= "victor";
        String aluno2= "kaique";
        String aluno3= "davi";
        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        listaAlunos.add(aluno3);
        System.out.println("Bem-vindo ao Gerenciador de Alunos\nSelecione o que quer fazer:\n[1]Listar Aluno\n[2]Excluir Aluno\n[3]Editar Aluno\n[4]Adicionar Aluno");

        Scanner sc = new Scanner(System.in);
        String escolha = sc.nextLine();

        switch (escolha){
            case "1":
                escolha= "1";
            listarAlunos();
            break;
            case "2":
                escolha="2";
            listarAlunos();
            System.out.println("Selecione qual aluno excluir");
            Scanner scan = new Scanner(System.in);
            String aluno = scan.nextLine();
            listaAlunos.remove(aluno);
        }
    }
    public static void listarAlunos(){
        System.out.println(listaAlunos);
    }
    }
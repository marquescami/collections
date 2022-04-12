import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();
		alunos.add("Paulo");
		alunos.add("Alberto");
		alunos.add("Pedro");
		alunos.add("Nico");
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");

		System.out.println(alunos.size());
		alunos.add("Nico Steppat");
		System.out.println(alunos.size());

		for (String aluno : alunos) {
			System.out.println(aluno);
		}
	}
}

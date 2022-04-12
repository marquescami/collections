
public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

		Aluno a1 = new Aluno("Camila Marques", 34672);
		Aluno a2 = new Aluno("Maria de Jesus", 34621);
		Aluno a3 = new Aluno("Ricardo Loureiro", 34665);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a ->{
			System.out.println(a);
		});
				
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		
		Aluno camila = new Aluno("Camila Marques", 34672);
		System.out.println("Camila está matriculada?");
		System.out.println(javaColecoes.estaMatriculado(camila));
		System.out.println("É IGUAL?");
		System.out.println(a1.equals(camila));
	}
}

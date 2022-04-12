
public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 22));

		Aluno a1 = new Aluno("Camila Marques", 5617);
		Aluno a2 = new Aluno("Maria de Jesus", 34621);
		Aluno a3 = new Aluno("Ricardo Loureiro", 34665);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem e o aluno 5617?" );
		Aluno aluno = javaColecoes.buscaMatriculado(5617);
		System.out.println(aluno);
	}
}

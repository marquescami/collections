import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Map<Integer, Aluno> matriculaParaAluno =  new HashMap<>();
	
	//nao possui ordenacao, nao aceita elementos duplicados,buscas rapidas - conjunto
	private Set<Aluno> alunos = new HashSet<>();
	
	//mantem os elementos na ordem inserida, nao aceita elementos duplicados,buscas rapidas - conjunto
	//private Set<Aluno> alunos = new LinkedHashSet<>();
	

	//ordena os seus elementos na hora da inserção. O criterio da ordenação depende e pode ser definido atraves de um Comparator.
	//private Set<Aluno> alunos = new TreeSet<>();
	

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	@Override
	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + getTempoTotal() + ", aulas: [" + this.aulas + "] ]";
	}

	public void matricula(Aluno aluno) {
	    // adiciona no Set de alunos
		this.alunos.add(aluno);
		
		//mapeia e associa aluno a matricula - relacao no Map
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
		
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
		if(!matriculaParaAluno.containsKey(numero)) {
			throw new NoSuchElementException();
		}
		return matriculaParaAluno.get(numero);
	}
}

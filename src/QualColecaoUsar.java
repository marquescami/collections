import java.util.Collection;
import java.util.HashSet;

public class QualColecaoUsar {

	public static void main(String[] args) {
		Collection<Aluno> alunos = new HashSet<>();
		alunos.size();

		/*
		 * Provavelmente, caso a modelagem do sistema ainda n�o esteja bem definida,
		 * deve-se ir� utilizar a interface Collection<E>. Dessa maneira, existe o acesso
		 * aos m�todos b�sicos de todas as implementa��es, como size(), add(), remove()
		 * e contains(). Conforme for sentindo necessidade em algo espec�fico, o
		 * desenvolvedor far� poucas mudan�as em seu c�digo.
		 * 
		 * Caso sinta necessidade de fazer uma requisi��o a um elemento espec�fico
		 * atrav�s da sua posi��o, trocar� de Collection<E> para List<E>. Caso perceba
		 * que ordem n�o importa, por�m � necess�ria uma busca bem r�pida (e sem
		 * repeti��es), um Set<E> � mais apropriado.
		 * 
		 * Enquanto n�o sentir essa necessidade, provavelmente a Collection<E> ser� a
		 * melhor escolha.
		 */
	}

}

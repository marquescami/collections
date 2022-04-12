package TreeSetComparator;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Teste {

    public static void main(String args[]) {

        Funcionario f1 = new Funcionario("Camila", 12);
        Funcionario f2 = new Funcionario("Mariana", 9);
        Funcionario f3 = new Funcionario("Jorge", 13);

        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);

        Iterator<Funcionario> iterador = funcionarios.iterator();

        while (iterador.hasNext()) {
            System.out.println(iterador.next().getNome());
        } 
    }
}
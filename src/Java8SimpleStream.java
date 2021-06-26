import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Java8SimpleStream {
    public static void main(String[] args) {
        List<Curso> cursos = Arrays.asList(
                new Curso("Python", 45),
                new Curso("JavaScript", 150),
                new Curso("Java 8", 113),
                new Curso("C", 55)
        );

        System.out.println("Todos os cursos:");
        cursos.sort(Comparator.comparing(Curso::getAlunos));
        cursos.forEach(curso -> System.out.println(curso.getNome()));

        System.out.println("\n\nCursos com mais de 50 alunos:");
        cursos.stream()
                .filter(curso -> curso.getAlunos() > 50)
                .forEach(curso -> System.out.println(curso.getNome()));

        System.out.println("\n\nMap para extrair o nome dos cursos");
        cursos.stream()
                .map(Curso::getNome)
                .forEach(System.out::println);
    }
}

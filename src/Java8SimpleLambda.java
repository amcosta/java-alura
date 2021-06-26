import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Java8SimpleLambda {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("alura online");
        words.add("casa do código");
        words.add("caelum");

        words.sort(Comparator.comparingInt(String::length));
        words.forEach(System.out::println);
    }
}

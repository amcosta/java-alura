import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Java8DefaultInterfaces {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("alura online");
        words.add("casa do código");
        words.add("caelum");

        Comparator<String> comparator = new StringSortLengthAsc();
        words.sort(comparator);

        Consumer<String> print = new PrintInLine();
        words.forEach(print);
    }
}

class PrintInLine implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class StringSortLengthAsc implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()) {
            return -1;
        }

        if (s1.length() > s2.length()) {
            return 1;
        }

        return 0;
    }
}

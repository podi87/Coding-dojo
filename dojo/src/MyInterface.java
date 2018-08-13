import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public interface MyInterface {
    String printHello();

    default String printWorld() {
        return "World!";
    }

    default boolean removeIf (List<Integer> intList, Predicate<? super Integer> predicate) {
        Objects.requireNonNull(predicate);
        boolean result = false;
        for(int i = 0; i < intList.size(); i++) {
            Integer next = intList.get(i);
            if (predicate.test(next)) {
                intList.remove(next);
                result = true;
            }
        }
        return result;
    }
}

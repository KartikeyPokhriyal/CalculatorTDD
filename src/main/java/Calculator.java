import java.util.Comparator;
import java.util.List;

public class Calculator {

    public int calculateMinimum(List<Integer> listOfIntegers) {

        return listOfIntegers.stream().min(Comparator.naturalOrder()).orElse(1);
    }

}

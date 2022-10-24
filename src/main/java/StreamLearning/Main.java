package StreamLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        CREATION
        Integer[] scores = new Integer[]{1,2,3,4,5};
        Stream<Integer> scoresStream = Arrays.stream(scores);

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("bread");
        shoppingList.add("pineapple");
        shoppingList.add("milk");
        shoppingList.add("pasta");
        List<String> sortedShoppingList = shoppingList.stream().sorted()
                .map(item -> item.toUpperCase())
                .filter(item -> item.startsWith("P"))
                .collect(Collectors.toList());
        System.out.println(sortedShoppingList);
        Stream<String> lettersString = Stream.of("a", "b", "c");
    }
}

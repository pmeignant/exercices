package exerciceTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class SplitTwoList {
    /**
     * trouve la valeur la plus proche de la moyenne de la liste et sépare en deux listes les autres valeurs de la liste
     * left: inférieur (ou égal si doublon) au pivot
     * right: supérieur au pivot
     * @param vals list d'entier qui vont être séparer en deux
     * @return {@link TwoList} avec le pivot qui est la valeur la plus proche de la moyenne
     */
    public static TwoList twoList(List<Integer> vals) {
        return new TwoList();
    }

    public static void main (String[] args) {
        List<Integer> dataTest1 = null;

        List<Integer> dataTest2 = List.of();

        List<Integer> dataTest3 = List.of(7, 4, 42, 8, 32, 36, 3, 73, 200, 10);

        List<Integer> dataTest4 = List.of(9, -245, 46, -193, 32, -12, 3, 73, 225, -11, -47, -11);

        System.out.println("****** TESTS EN DEUX LISTES DISTINCTES ******");
        final TwoList result1 = twoList(dataTest1);
        final String expected1 = "{pivot=null, right=[], left=[]}";
        System.out.println("List 1 { " +
                "result: " + result1 + "," +
                " expected: " + expected1 +
                ", status: " + (Objects.equals(result1.toString(), expected1) ? "SUCCEED" : "FAILED") +
                "}");
        final TwoList result2 = twoList(dataTest2);
        final String expected2 = "{pivot=null, right=[], left=[]}";
        System.out.println("List 2 { " +
                "result: " + result2 + "," +
                " expected: " + expected2 +
                ", status: " + (Objects.equals(result2.toString(), expected2) ? "SUCCEED" : "FAILED") +
                "}");

        final TwoList result3 = twoList(dataTest3);
        final String expected3 = "{pivot=42, right=[73, 200], left=[7, 4, 8, 32, 36, 3, 10]}";
        System.out.println("List 3 { " +
                "result: " + result3 + "," +
                " expected: " + expected3 +
                ", status: " + (Objects.equals(result3.toString(), expected3) ? "SUCCEED" : "FAILED") +
                "}");

        final TwoList result4 = twoList(dataTest4);
        final String expected4 = "{pivot=-11, right=[9, 46, 32, 3, 73, 225], left=[-245, -193, -12, -47, -11]}";
        System.out.println("List 4 { " +
                "result: " + result4 + "," +
                " expected: " + expected4 +
                ", status: " + (Objects.equals(result4.toString(), expected4) ? "SUCCEED" : "FAILED") +
                "}");
    }
}

package exerciceThree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class Sort {

    /**
     * tri de la liste
     * @param vals liste d'entier
     * @return liste d'entier trié en ordre croissant
     */
    private static List<Integer> sort(List<Integer> vals) {
        if (vals == null || vals.isEmpty()) {
            return Collections.emptyList();
        }
        return vals.stream().sorted().collect(Collectors.toList());
    }

    public static void main (String[] args) {
        List<Integer> dataTest1 = null;

        List<Integer> dataTest2 = List.of();

        List<Integer> dataTest3 = List.of(7, 4, 42, 8, 32, 36, 3, 73, 200, 10);

        List<Integer> dataTest4 = List.of(9, -245, 46, -193, 32, -12, 3, 73, 225, -11, -47, -11);

        System.out.println("****** TESTS TRI ******");
        final List<Integer> result1 = sort(dataTest1);
        final String expected1 = "[]";
        System.out.println("List 1 { " +
                "result: " + result1 + "," +
                " expected: " + expected1 +
                ", status: " + (Objects.equals(result1.toString(), expected1) ? "SUCCEED" : "FAILED") +
                "}");
        final List<Integer> result2 = sort(dataTest2);
        final String expected2 = "[]";
        System.out.println("List 2 { " +
                "result: " + result2 + "," +
                " expected: " + expected2 +
                ", status: " + (Objects.equals(result2.toString(), expected2) ? "SUCCEED" : "FAILED") +
                "}");

        final List<Integer> result3 = sort(dataTest3);
        final String expected3 = "[3, 4, 7, 8, 10, 32, 36, 42, 73, 200]";
        System.out.println("List 3 { " +
                "result: " + result3 + "," +
                " expected: " + expected3 +
                ", status: " + (Objects.equals(result3.toString(), expected3) ? "SUCCEED" : "FAILED") +
                "}");

        final List<Integer> result4 = sort(dataTest4);
        final String expected4 = "[-245, -193, -47, -12, -11, -11, 3, 9, 32, 46, 73, 225]";
        System.out.println("List 4 { " +
                "result: " + result4 + "," +
                " expected: " + expected4 +
                ", status: " + (Objects.equals(result4.toString(), expected4) ? "SUCCEED" : "FAILED") +
                "}");
    }
}

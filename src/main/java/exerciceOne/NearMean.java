package exerciceOne;

import java.util.List;

public class NearMean {

    /**
     *
     * @param vals une liste d'entier
     * @return l'entier dans la liste le plus proche de la moyenne des valeurs
     */
    public static int nearMean(List<Integer> vals) {
        return 0;
    }

    public static void main (String[] args) {

        List<Integer> dataTest2 = List.of();

        List<Integer> dataTest3 = List.of(7, 4, 42, 8, 32, 36, 3, 73, 200, 10);

        List<Integer> dataTest4 = List.of(9, -245, 46, -193, 32, -12, 3, 73, 225, -11, -47, -11);

        System.out.println("****** TESTS PLUS PROCHE MOYENNE ******");

        System.out.println("  Test 1 : " + nearMean(null) + " / valeur attendue : 0");

        System.out.println("  Test 2 : " + nearMean(dataTest2) + " / valeur attendue : 0");

        System.out.println("  Test 3 : " + nearMean(dataTest3) + " / valeur attendue : 42");

        System.out.println("  Test 4 : " + nearMean(dataTest4) + " / valeur attendue : -11");
    }
}

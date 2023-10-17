package exerciceOne;

import java.util.List;

public class NearMean {

    /**
     *
     * @param vals une liste d'entier
     * @return l'entier dans la liste le plus proche de la moyenne des valeurs
     */
    public static int nearMean(List<Integer> vals) {
        if (vals == null || vals.isEmpty()) {
            return 0;
        }

        double sum = vals.stream().mapToDouble(Integer::doubleValue).sum();
        double average = sum / vals.size();
        int index = 0;
        double closestDifference = average - vals.get(0);

        for (int i = 1; i < vals.size(); i++) {
            double difference = average - vals.get(i);

            if (difference * difference < closestDifference * closestDifference) {
                closestDifference = difference;
                index = i;
            }
        }

        return vals.get(index);
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

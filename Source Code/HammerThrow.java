public class HammerThrow extends FieldSports {
    public void showLongestThrow() {
        longestThrow = 66.54;
        System.out.println(longestThrow + " meters ");
    }

    public void showRanking(int a) {

        // edit the names on index 0

        goldMedalist[0] = new Athlete("Sam", 34, "Male", "Lithuania", 1);
        silverMedalist[0] = new Athlete("Daniel", 36, "Male", "Sweeden", 2);
        bronzeMedalist[0] = new Athlete("Lucas", 39, "Male", "Czech", 3);

        goldMedalist[1] = new Athlete("Sam", 34, "Male", "Lithuania", 1);
        silverMedalist[1] = new Athlete("Daniel", 36, "Male", "Sweeden", 2);
        bronzeMedalist[1] = new Athlete("Lucas", 39, "Male", "Czech", 3);

        goldMedalist[2] = new Athlete("Simon", 29, "Male", "Germany", 1);
        silverMedalist[2] = new Athlete("Ulabunu", 37, "Male", "Australia", 2);
        bronzeMedalist[2] = new Athlete("Benjamin", 38, "Male", "Sweeden", 3);

        goldMedalist[3] = new Athlete("Lizonavi", 40, "Male", "Portugal", 1);
        silverMedalist[3] = new Athlete("Pavard", 39, "Male", "Uraguay", 2);
        bronzeMedalist[3] = new Athlete("Hernandez", 29, "Male", "Brazil", 3);

        super.showRanking();
        System.out.println(1 + " " + goldMedalist[a]);
        System.out.println(2 + " " + silverMedalist[a]);
        System.out.println(3 + " " + bronzeMedalist[a]);
    }
}

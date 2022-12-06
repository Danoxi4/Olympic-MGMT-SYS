public class DiscusThrow extends FieldSports {
    public void showLongestThrow() {
        longestThrow = 78.54;
        System.out.println(longestThrow + " meters ");
    }

    // edit the names
    public void showRanking(int a) {
        goldMedalist[0] = new Athlete("Pawel", 35, "Male", "Poland", 1);
        silverMedalist[0] = new Athlete("Barbora", 25, "Male", "Morocco", 2);
        bronzeMedalist[0] = new Athlete("Hendriksen", 44, "Male", "Norway", 3);

        goldMedalist[1] = new Athlete("Pawel", 35, "Male", "Poland", 1);
        silverMedalist[1] = new Athlete("Barbora", 25, "Male", "Morocco", 2);
        bronzeMedalist[1] = new Athlete("Hendriksen", 44, "Male", "Norway", 3);

        goldMedalist[2] = new Athlete("Takuto", 24, "Male", "France", 1);
        silverMedalist[2] = new Athlete("Frydrych", 35, "Male", "Spain", 2);
        bronzeMedalist[2] = new Athlete("Lima", 27, "Male", "Russia", 3);

        goldMedalist[3] = new Athlete("scezney", 40, "Male", "Poland", 1);
        silverMedalist[3] = new Athlete("Thompson", 44, "Male", "tunisia", 2);
        bronzeMedalist[3] = new Athlete("Usebio", 38, "Male", "Norway", 3);

        super.showRanking();
        System.out.println(1 + " " + goldMedalist[a]);
        System.out.println(2 + " " + silverMedalist[a]);
        System.out.println(3 + " " + bronzeMedalist[a]);
    }

}

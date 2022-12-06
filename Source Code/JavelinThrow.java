public class JavelinThrow extends FieldSports {
    public void showLongestThrow() {
        longestThrow = 86.54;
        System.out.println(longestThrow + " meters ");
    }

    public void showRanking(int a) {
        goldMedalist[0] = new Athlete("Anderson", 28, "Male", "Vietnam", 1);
        silverMedalist[0] = new Athlete("Cyprian", 26, "Male", "Qatar", 2);
        bronzeMedalist[0] = new Athlete("Kiprotich", 33, "Male", "Angola", 3);

        goldMedalist[1] = new Athlete("Alexander", 34, "Male", "Turkey", 1);
        silverMedalist[1] = new Athlete("Lobbo", 26, "Male", "Lativia", 2);
        bronzeMedalist[1] = new Athlete("Chang", 27, "Male", "China", 3);

        goldMedalist[2] = new Athlete("Parkins", 29, "Male", "Luxemburg", 1);
        silverMedalist[2] = new Athlete("Lassio", 38, "Male", "Italy", 2);
        bronzeMedalist[2] = new Athlete("Huang lee", 38, "Male", "Qatar", 3);

        goldMedalist[3] = new Athlete("Hoffman", 28, "Male", "Lativia", 1);
        silverMedalist[3] = new Athlete("Libedo", 33, "Male", "Trinidad and Tobago", 2);
        bronzeMedalist[3] = new Athlete("Arkins", 26, "Male", "Armenia", 3);

        super.showRanking();
        System.out.println(1 + " " + goldMedalist[a]);
        System.out.println(2 + " " + silverMedalist[a]);
        System.out.println(3 + " " + bronzeMedalist[a]);
    }

}

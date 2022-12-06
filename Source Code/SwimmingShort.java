public class SwimmingShort extends InDoor {

    public void showRanking(int a) {
        goldMedalist[0] = new Athlete("Perez", 35, "Male", "Croatia", 1);
        silverMedalist[0] = new Athlete("Mendez", 44, "Male", "Jamaica", 2);
        bronzeMedalist[0] = new Athlete("Roberto", 29, "Male", "Brazil", 3);

        goldMedalist[1] = new Athlete("Michael", 25, "Male", "UK", 1);
        silverMedalist[1] = new Athlete("Mendoza", 34, "Male", "Argentina", 2);
        bronzeMedalist[1] = new Athlete("Ulimini", 45, "Male", "Uzbekistan", 3);

        goldMedalist[2] = new Athlete("Yhune", 29, "Male", "Paraguay", 1);
        silverMedalist[2] = new Athlete("Lobsiad", 27, "Male", "Newzealand", 2);
        bronzeMedalist[2] = new Athlete("Tubia", 29, "Male", "Cuba", 3);

        goldMedalist[3] = new Athlete("Schofield", 34, "Male", "Srilanka", 1);
        silverMedalist[3] = new Athlete("Jessy", 35, "Male", "Pakistan", 2);
        bronzeMedalist[3] = new Athlete("Walter", 26, "Male", "Spain", 3);

        super.showRanking();
        System.out.println(1 + " " + goldMedalist[a]);
        System.out.println(2 + " " + silverMedalist[a]);
        System.out.println(3 + " " + bronzeMedalist[a]);
    }
}

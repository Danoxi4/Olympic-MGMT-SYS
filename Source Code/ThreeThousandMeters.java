public class ThreeThousandMeters extends TrackSports implements ForThreeThousand {
    public void showWorldRecord() {
        worldRecord = 20.57;
        System.out.println(worldRecord + "  minutes");
    }

    public void showRanking(int a) {

        goldMedalist[0] = new Athlete("Aman", 25, "Male", "Ethiopia", 1);
        silverMedalist[0] = new Athlete("Rudisha", 35, "Male", "Kenya", 2);
        bronzeMedalist[0] = new Athlete("nkunku", 33, "Male", "Burundi", 3);

        goldMedalist[1] = new Athlete("taye", 23, "Male", "Ethiopia", 1);
        silverMedalist[1] = new Athlete("dednda", 35, "Male", "uganda", 2);
        bronzeMedalist[1] = new Athlete("ogaga", 32, "Male", "Burundi", 3);

        goldMedalist[2] = new Athlete("muktar", 27, "Male", "Ethiopia", 1);
        silverMedalist[2] = new Athlete("gabone", 33, "Male", "tanzaniya", 2);
        bronzeMedalist[2] = new Athlete("gebremesksel", 33, "Male", "eritrea", 3);

        goldMedalist[3] = new Athlete("gebisa", 22, "Male", "Ethiopia", 1);
        silverMedalist[3] = new Athlete("sanders", 28, "Male", "newzealand", 2);
        bronzeMedalist[3] = new Athlete("nkazimu", 36, "Male", "japan", 3);

        super.showRanking();
        System.out.println(1 + " " + goldMedalist[a]);
        System.out.println(2 + " " + silverMedalist[a]);
        System.out.println(3 + " " + bronzeMedalist[a]);
    }

}

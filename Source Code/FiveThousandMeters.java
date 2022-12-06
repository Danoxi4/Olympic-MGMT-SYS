public class FiveThousandMeters extends TrackSports implements ForFiveThousand {
	public void showWorldRecord() {
		worldRecord = 25.57;
		System.out.println(worldRecord + "  minutes");
	}

	public void showRanking(int a) {

		goldMedalist[0] = new Athlete("tolosa", 23, "Male", "Ethiopian", 1);
		silverMedalist[0] = new Athlete("Kipchoge", 43, "Male", "Kenya", 2);
		bronzeMedalist[0] = new Athlete("upamecano", 39, "Male", "Uganda", 3);

		goldMedalist[1] = new Athlete("Eliud", 39, "Male", "Kenya", 1);
		silverMedalist[1] = new Athlete("Ayana", 37, "Male", "Ethiopia", 2);
		bronzeMedalist[1] = new Athlete("Taye", 27, "Male", "Ethiopia", 3);

		goldMedalist[2] = new Athlete("Selemon", 27, "Male", "Ethiopian", 1);
		silverMedalist[2] = new Athlete("Muktar", 34, "Male", "Ethiopia", 2);
		bronzeMedalist[2] = new Athlete("krop", 39, "Male", "Burundi", 3);

		goldMedalist[3] = new Athlete("Kenenisa", 34, "Male", "Ethiopian", 1);
		silverMedalist[3] = new Athlete("kipkorir", 28, "Male", "Kenya", 2);
		bronzeMedalist[3] = new Athlete("koulibaly", 28, "Male", "France", 3);

		super.showRanking();
		System.out.println(1 + " " + goldMedalist[a]);
		System.out.println(2 + " " + silverMedalist[a]);
		System.out.println(3 + " " + bronzeMedalist[a]);
	}

}

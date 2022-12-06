public class TenThousandMeter extends TrackSports implements ForTenThousand {
	public void showWorldRecord() {
		worldRecord = 30.57;
		System.out.println(worldRecord + "  minutes");
	}

	public void showRanking(int a) {
		goldMedalist[0] = new Athlete("sileshi", 25, "Male", "Ethiopia", 1);
		silverMedalist[0] = new Athlete("Mohammed", 35, "Male", "UK", 2);
		bronzeMedalist[0] = new Athlete("Kejelcha", 33, "Male", "Ethiopia", 3);

		goldMedalist[1] = new Athlete("Ahmed", 34, "Male", "Ethiopia", 1);
		silverMedalist[1] = new Athlete("kiplimo", 23, "Male", "Uganda", 2);
		bronzeMedalist[1] = new Athlete("kiplagat", 43, "Male", "Kenya", 3);

		goldMedalist[2] = new Athlete("Stephen", 23, "Male", "Kenya", 1);
		silverMedalist[2] = new Athlete("Alamiraw", 43, "Male", "Ethiopia", 2);
		bronzeMedalist[2] = new Athlete("Longosiwa", 38, "Male", "Kenya", 3);

		goldMedalist[3] = new Athlete("Aregawi", 33, "Male", "Ethiopia", 1);
		silverMedalist[3] = new Athlete("Mohammed", 32, "Male", "UK", 2);
		bronzeMedalist[3] = new Athlete("Kipruto", 33, "Male", "Uganda", 3);

		super.showRanking();
		System.out.println(1 + " " + goldMedalist[a]);
		System.out.println(2 + " " + silverMedalist[a]);
		System.out.println(3 + " " + bronzeMedalist[a]);
	}
}

abstract class TrackSports extends olympic {
	public double worldRecord;
	int lengthOfRace;
	int numberOfLaps;
	
	public void newWorldRecord(double F) {
		if (F < worldRecord) {
			worldRecord = F;
		}
	}
	public void showWorldRecord() {
		System.out.println(worldRecord + "  minutes");
	}

	public void showRanking() {
		System.out.println("The Men Ranking is: ");
	}
}

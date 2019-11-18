class TravelPlan implements Comparable<TravelPlan>{
	double distance;
	City origin;
	City destination;

	public TravelPlan(City origin, City destination) {
		//Set the origin, desitnation, and distance here
	}
	
	@Override
	public String toString() {
		//Output the origin, destination, and distance
	}
	@Override
	public int compareTo(TravelPlan o) {
		//Compare the TravelPlan objects based upon distance
	}
}

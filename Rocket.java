
public class Rocket implements SpaceShip {
	int cost;
	int weight;
	int maxWeight;
	double launchExplosion;
	double landingCrash;
	int currentWeight;

	@Override
	public boolean launch() {

		return true;
	}

	@Override
	public boolean land() {

		return true;
	}

	@Override
	public boolean cancarry(Item item) {
		return this.currentWeight + item.weight <= maxWeight;

	}

	@Override
	public int carry(Item item) {
		this.currentWeight += item.weight;
		return this.currentWeight;
	}

}

package zoo;

public class LizardAdapter extends Animal {
	
	private lizard liz;

	public LizardAdapter(int weight) {
		liz = new lizard(weight);
	}

	@Override
	protected void feed() {
		liz.feedlizard();

	}

}

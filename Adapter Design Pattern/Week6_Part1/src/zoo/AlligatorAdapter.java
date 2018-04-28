package zoo;

public class AlligatorAdapter extends Animal {

	private alligator a;
	public AlligatorAdapter(int weight) {
		a = new alligator(weight);
	}

	@Override
	protected void feed() {
		a.feedalligator();
		
	}

}

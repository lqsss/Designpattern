package singleton;

public class Lazy {
	private Lazy() {

	}

	private static Lazy instance;

	public static Lazy getLazyInstance() {
		if (instance == null) {
			instance = new Lazy();
		}
		return instance;
	}
}

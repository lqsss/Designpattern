package singleton;


public class Hungry {
	private static Hungry singleton = new Hungry(); // 类加载的时候 就创建了

	private Hungry() {

	}

	public static Hungry getHungryInstance() {
		return singleton;
	}
	
}

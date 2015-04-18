package observer_pattern_demo;

public abstract class Observer {
	protected Subject subject;
	public abstract void update();
}

package isp_unsolved;

public class RobotWorker implements Worker {
	@Override
	public void work() {
		System.out.println("Working...");
	}

	@Override
	public void eat() {
		throw new UnsupportedOperationException("Robots don't eat");
	}
}

package isp_unsolved;

public class HumanWorker implements Worker {
	@Override
	public void work() {
		System.out.println("Working...");
	}

	@Override
	public void eat() {
		System.out.println("Eating...");
	}
}
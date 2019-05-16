package nondi;

public class ITEmployee implements Employee {

	FixComputerTask task;
	
	
	public ITEmployee() {
		super();
		this.task = new FixComputerTask();
	}


	@Override
	public void resolveTask() {
		task.process();
	}

}

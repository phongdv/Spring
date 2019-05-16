package SpringBasic;

public class ITEmployee implements Employee {
	Task t;
	
	
	
	
	public ITEmployee(Task t) {
		super();
		this.t = t;
	}




	@Override
	public void resolveTask() {
		t.doTask();
		
	}

}

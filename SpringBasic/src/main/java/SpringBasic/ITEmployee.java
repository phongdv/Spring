package SpringBasic;

public class ITEmployee implements Employee {
	Task t;
	
	
	
	
	public ITEmployee(Task t) {
		super();
		this.t = t;
	}




	@Override
	public void resolveTask() {
		System.out.print("I am an IT man "); 
		t.doTask();
		
	}

}

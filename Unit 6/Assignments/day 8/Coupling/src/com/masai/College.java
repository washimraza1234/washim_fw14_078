package com.masai;

public class College {

	ControllerInterface ci;
	
	
	
	public void setCi(ControllerInterface ci) {
		this.ci = ci;
	}

	


//	public College(ControllerInterface ci) {
//		super();
//		this.ci = ci;
//	}




	public void doJob() {
		System.out.println("Job is started");
		ci.go();

	}

}

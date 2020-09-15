package controller;

public class ThreadsID extends Thread{
	
	private int idThread;
	
	public ThreadsID () {
		this.idThread=(int) getId();
	}
	
	@Override
	public void run() {
		System.out.println("Nº do ID: " + idThread);
	}
}


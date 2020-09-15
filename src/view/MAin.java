package view;

import controller.ThreadsID;

public class MAin {

	public static void main(String[] args) {
		
		for(int i =0; i<5;i++) {
			Thread threadId =  new ThreadsID();
			threadId.start();
		}

	}

}

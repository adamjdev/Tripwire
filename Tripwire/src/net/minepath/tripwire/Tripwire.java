package net.minepath.tripwire;

import java.util.logging.Logger;

public class Tripwire {

	private static boolean running;
	
	public Tripwire() {
		
	}
	
	public static boolean isRunning() {
		return running;
	}
	
	public static String getVersion() {
		return "";
	}
	
	public static Logger getLogger() {
		return null;
	}
	
	public static void main(String[] args) {
		new Tripwire();
	}
}

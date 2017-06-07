package com.proxy;

public class NexWaveProxy implements Nexwave {

	private ClassRoom classRoom = new ClassRoom();

	@Override
	public void getTraining(String sub) {

		// in-Log
		// authenticate
		// verify you qualification

		if (sub.equals("java")) {
			classRoom.getJavaTraining();
		}

		// out-log
	}

}

package com.proxy;

public class Participant {

	public void doLearn() {

		Nexwave nexwave = new NexWaveProxy();

		nexwave.getTraining("java");
		System.out.println("Learning...Java");

		nexwave.getTraining("js");
		System.out.println("Learning...JS");

	}

}

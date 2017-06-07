package com.observer;

public class Light implements DoorListener {

	@Override
	public void start(DoorEvent event) {
		System.out.println("Light ON>>>");
	}

	@Override
	public void stop(DoorEvent event) {
		System.out.println("Light OFF<<<");
	}

}

package com.observer;

import java.util.ArrayList;

public class Door {

	private ArrayList<DoorListener> doorListeners = new ArrayList<>();

	public void addDoorListener(DoorListener listener) {
		doorListeners.add(listener);
	}

	public void removeDoorListenet(DoorListener listener) {
		doorListeners.remove(listener);
	}

	public void open() {
		System.out.println("Door opened...");
		DoorEvent doorEvent = new DoorEvent(4, 10);
		for (DoorListener listener : doorListeners)
			listener.start(doorEvent);
	}

	public void close() {
		System.out.println("Door closed...");
		DoorEvent doorEvent = new DoorEvent(4, 12);
		for (DoorListener listener : doorListeners)
			listener.stop(doorEvent);
	}

}

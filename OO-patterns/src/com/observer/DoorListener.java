package com.observer;

public interface DoorListener {
	void start(DoorEvent event);

	void stop(DoorEvent event);
}

package com.observer;

import java.util.concurrent.TimeUnit;

public class App {

	public static void main(String[] args) throws InterruptedException {

		Door door = new Door();
		Light light = new Light();

		door.addDoorListener(light);

		door.open();

		TimeUnit.SECONDS.sleep(2);

		door.close();

		door.removeDoorListenet(light);

		TimeUnit.SECONDS.sleep(2);
		door.open();

	}

}

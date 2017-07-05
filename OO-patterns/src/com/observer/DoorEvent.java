package com.observer;

public class DoorEvent {
	private int floor;
	private int doorNum;

	public DoorEvent(int floor, int doorNum) {
		super();
		this.floor = floor;
		this.doorNum = doorNum;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getDoorNum() {
		return doorNum;
	}

	public void setDoorNum(int doorNum) {
		this.doorNum = doorNum;
	}

}

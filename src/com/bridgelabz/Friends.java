package com.bridgelabz;

import com.bridgelabz.home.Locker;

public class Friends extends Locker {

	public void showLockerDetails() {
		System.out.println(this.propertiesFiles);
	}
	public static void main(String[] args) {
		Friends friends = new Friends();
		friends.showLockerDetails();
	}
}

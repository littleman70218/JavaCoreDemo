package net.antra.daythree;

public class Human extends Creature implements CanFly, CanSwim, CanRun{

	@Override
	public void run() {
		System.out.println("Human run...run forest run!!");
	}

	@Override
	public void swim() {
		System.out.println("Human swim...");
	}

	@Override
	public void fly() {
		System.out.println("Human fly...");
	}

}

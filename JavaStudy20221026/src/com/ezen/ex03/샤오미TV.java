package com.ezen.ex03;

public class 샤오미TV implements TV{

	@Override
	public void powerOn() {
		System.out.println("샤오미 전원 온");
	}

	@Override
	public void powerOff() {
		System.out.println("샤오미 전원 다운");
	}

	@Override
	public void volumeUp() {
		System.out.println("샤오미 볼륨 업");
	}

	@Override
	public void volumeDown() {
		System.out.println("샤오미 볼륨 내림");
	}

}

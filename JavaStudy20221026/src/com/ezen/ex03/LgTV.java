package com.ezen.ex03;

public class LgTV  implements TV{

	@Override
	public void powerOn() {
		System.out.println("엘지티비 전원 온");
	}

	@Override
	public void powerOff() {
		System.out.println("엘지티비 전원 오프");
	}

	@Override
	public void volumeUp() {
		System.out.println("엘지티비 볼륨 업");
	}

	@Override
	public void volumeDown() {
		System.out.println("엘지티비 볼륨 다운");
	}

}

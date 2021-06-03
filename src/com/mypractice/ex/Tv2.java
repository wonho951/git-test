package com.mypractice.ex;

public class Tv2 {

	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자
	public Tv2(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	
	//메소드(세터 없어도 됨)	
	
	public int getChanner() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}
	
	
	//메소드 - 일반
	
	//전원
	public void power (boolean on) {
			this.power = on;
	}
	
	
	//채널
	public void channel () {
		if( channel < 1 || channel > 255) {
			this.channel = 255;
		} 
	}
	
	//최종출력
	public void status() {
		System.out.println("채널 :" + channel + " 볼륨 : " + volume + " "+ power );
	}
}

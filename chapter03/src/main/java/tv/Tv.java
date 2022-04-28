package tv;

public class Tv {
	
	private int channel; // 0 ~ 255
	private int volume; // 0 ~ 100
	private boolean power; 
		
	public Tv() {
		this(0, 0, false);
	}
	public Tv(int channel, int volume, boolean power) {	
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public void isPower() {
		System.out.println("power: "+power);
	}
	public void power(boolean power) {
		this.power = power;
	}
	public void channel(boolean up) {
		if(up)
			channel(this.channel+=1);
		else
			channel(this.channel-=1);
	}
	public void channel(int channel) {
		if(channel>100)
			this.channel = 0;
		else if(channel<=100 && channel>=0)
			this.channel = channel;
		else
			this.channel = 100;
	}
	
	public void volume(boolean up) {
		if(up)
			volume(this.volume+=1);
		else
			volume(this.volume-=1);
	}
	public void volume(int volume) {
		if(volume>255)
			this.volume = 0;
		else if(volume<=255 && volume>=0)
			this.volume = volume;
		else
			this.volume = 255;
	}
	
	public void status() {
		System.out.println(
				"TV[channel=" + this.channel +
				", volume=" + this.volume +
				", power="+(this.power?"on":"off")+"]"
				);
	}
	
}

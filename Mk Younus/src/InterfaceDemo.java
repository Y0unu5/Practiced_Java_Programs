class Phone {
	public void call() {
		System.out.println("Phone call");
	}

	public void sms() {
		System.out.println("Phone sending message");
	}
}

interface ICamera {
	void click();

	void record();
}

interface IMusic {
	void play();

	void resume();

	void stop();

}

class SmartPhone extends Phone implements ICamera, IMusic {
	public void videoCall() {
		System.out.println("Smart phone video calling");
	}

	@Override
	public void play() {
		System.out.println("Smart phone playing music");

	}

	@Override
	public void resume() {
		System.out.println("Smart phone resumed the music");
	}

	@Override
	public void stop() {
		System.out.println("Smart phone stopped the music");

	}

	@Override
	public void click() {
		System.out.println("Smart phone click the photo");
	}

	@Override
	public void record() {
		System.out.println("Smart phone record the video");

	}

}

public class InterfaceDemo {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.call();
		sp.sms();
		sp.click();
		sp.play();
		sp.record();

		Phone p1 = new SmartPhone();
		p1.call();
		p1.sms();

		ICamera c = new SmartPhone();
		c.click();
		c.record();

		IMusic m = new SmartPhone();
		m.play();
		m.resume();
		m.stop();

	}

}

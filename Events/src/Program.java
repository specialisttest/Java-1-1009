
public class Program {
	
	public static void fireFighters(Object s)
	{
		
		System.out.println("Пожарные приехали");
	}

	public static void main(String[] args) {
		Switcher sw = new Switcher();

		Lamp lamp = new Lamp();
		TvSet tv = new TvSet();
		AirCondition ac = new AirCondition();

		sw.addElectricityListener(lamp);
		sw.addElectricityListener(tv);
		
		final String message = "Пожар";

		sw.addElectricityListener(
		new ElectricityListener() {
			public void electricity(Object s) {
				System.out.println(message);
			}
		});
		sw.addElectricityListener(s->System.out.println(message));
		//sw.addElectricityListener( s-> ac.on(s));
		sw.addElectricityListener( ac::on );
		//sw.addElectricityListener( s->Program.fireFighters(s) );
		sw.addElectricityListener( Program::fireFighters );
		
		sw.switchOn();

	}

}

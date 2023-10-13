import java.util.ArrayList;

public class Switcher {
	
	private ArrayList<ElectricityListener> listeners = 
			new ArrayList<>();
	
	public void addElectricityListener(ElectricityListener l) {
		listeners.add(l);
	}
	public void removeElectricityListener(ElectricityListener l) {
		listeners.remove(l);
	}
	
	public void switchOn() {
		System.out.println("Выключатель включен");
		for(ElectricityListener l : listeners)
			l.electricity(this);
		
	}


}

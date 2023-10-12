package ru.specialist.graph;

public interface Scaleable {
	public static final double DEFAULT_FACTOR = 2.0;
	
	public static void scaleScene(double factor) {
		for(Shape s : Shape.scene) {
			if (s instanceof Scaleable) {
				Scaleable sc = (Scaleable)s;
				sc.scale(factor);
			}
		}
	}
	
	//public abstract
	void scale(double factor);
	
	// since Java 9
	private void scaleImpl() {
		this.scale(DEFAULT_FACTOR);
	}
	
	// since Java 8
	default void scale() {
		scaleImpl();
	}
	
	
	

}

interface LogScaleable {
	default void scale() {
		System.out.printf("Scale %s\n", this);
	}
}

interface Scaleable3D extends Scaleable,Cloneable {
	void scale3D(double factorX, double factorY, double factorZ);
}

// auto implements Scaleable
class Test implements Scaleable3D {
	@Override
	public void scale(double factor) {
		// TODO Auto-generated method stub
	}
	@Override
	public void scale3D(double factorX, double factorY, double factorZ) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void scale() {
		// TODO Auto-generated method stub
		
	}
	
}

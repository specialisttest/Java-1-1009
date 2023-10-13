package ru.specialist;

enum Colors {RED, GREEN, BLUE}

// reference type
enum FileMode { 
	READ(1), WRITE(100), READWRITE(200);
	
	int k;
	private FileMode(int k){
		this.k=k;
		System.out.println(this);
	}
	
	public String lowerName() {
		return name().toLowerCase();
	}
}

// class FileMode extends Enum<FileMode>

public class App {

	public static void main(String[] args) {
		FileMode mode = FileMode.WRITE;
		
		int k = mode.ordinal();
		System.out.println( k );
		System.out.println(mode);
		
		FileMode mode2 = FileMode.valueOf("READ");
		System.out.println(mode2);
		for(FileMode m : FileMode.values())
			System.out.println(m.lowerName());
		
		

	}

}

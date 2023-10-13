package ru.specialist;

import static java.lang.System.out;

import java.io.IOException;
import java.nio.file.*;
import java.util.function.Consumer;

import static java.lang.Math.*;

public class Program {
	
	public static final String filename = "test1.txt"; 

	public static void main(String[] args) throws IOException, InterruptedException {
		//"c:\\abc\\" + "test.txt"
		
		// double y = sin(log(PI));
		//double y = sin(log(PI));
		
		//for(String line : Files.readAllLines(Paths.get("..", filename)))
		//	System.out.println(line);
		
		Files.readAllLines(Paths.get("..", filename)).
			stream().
			forEach( out::println );
		
		
		
		/*
		Path dir = Paths.get("..");
		// Paths.get(".")
		Files.newDirectoryStream(dir).
			forEach(out::println);
		*/
		
		Path dir = Paths.get("..");
		
		WatchService watchDog = 
				FileSystems.getDefault().newWatchService();
		
		WatchKey key = 
				dir.register(watchDog, StandardWatchEventKinds.ENTRY_CREATE);
		
		key = watchDog.take();
		
		//key.pollEvents().stream().
//			forEach(e->out.println(((Path)e.context()).getFileName() ));
		
		for (WatchEvent<?> event: key.pollEvents()) {
	        WatchEvent<Path> ev = (WatchEvent<Path>)event;
	        Path filename = ev.context();
	        out.println(filename);
		}
		
		// System.exit(0);

	}
	
	
	

}

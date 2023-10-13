import java.io.*;


public class DBConnection implements Closeable
{
	
	public DBConnection() {
		System.out.println("Open connection...");
		isClosed = false;
	}
	
	public void execute()
	{
		System.out.println("execute command...");
	}

	private boolean isClosed = true; 
	@Override
	public void close()  {
		if (!isClosed) {
			System.out.println("Close connection...");
			isClosed = true;
		}
	}
	
	/*@Override
	protected void finalize() throws Throwable {
		System.out.println("Close connection...");
		super.finalize();
	}*/

}

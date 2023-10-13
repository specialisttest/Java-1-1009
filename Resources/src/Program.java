

public class Program
{

	public static void main(String[] args) 
	{
		/*DBConnection db = null;
		try {
			db = new DBConnection();
			db.execute();
		}
		finally {
			if (db != null)
				db.close();
		}*/
		
		// since java 7
		try(DBConnection db = new DBConnection()) {
			db.execute();
		} // db.close();
		
		try(DBConnection db1 = new DBConnection();
				DBConnection db2 = new DBConnection()) {
			db1.execute();
			db2.execute();
		} // db2.close();db1.close();
		
		
		DBConnection db = new DBConnection();
		// since java 9
		try(db) {
			db.execute();
		} // db.close();
		
		//System.gc(); // bad


	}

}

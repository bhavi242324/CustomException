package Custom;

public class Start2 {

	public static void main(String[] args) {
		try {
			throw new MyException("New Exception");
		}
		catch(MyException ex) {
			System.out.println("Exception caught");
		    System.out.println(ex.getMessage());	
		}
		}

	}


package homework07_02;

public class TestOutOfMemoryError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] a = new int[2000000000];
		}
		catch(Error er) {
			System.out.println(er);
		}
	}

}

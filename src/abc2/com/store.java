package abc2.com;

public class store {

	String empId() {

		return "john";

	}

	public static void main(String[] args) {
		store store = new store();

		String empId = store.empId();
		System.out.println(empId);

	}

}

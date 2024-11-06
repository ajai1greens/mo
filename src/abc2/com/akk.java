package abc2.com;

public class akk {

	public static void main(String[] args) {

		String text = "$1,500";

		String substring = text.substring(1);
		String replace = substring.replace(",", "");

		System.out.println(replace);

	}

}
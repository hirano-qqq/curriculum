package check;

import constants.Constants;

public class Check {
	public static void main(String[] args) {

		printName(Check.firstName, Check.lastName);

		Pet p = new Pet();
		RobotPet rp = new RobotPet();

		p = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		p.introduce();

		rp = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		rp.introduce();

	}

	private static String firstName = "平野";
	private static String lastName = "湧太";

	private static void printName(String x, String y) {
		System.out.println("printNameメソッド→" + x + y);

	}

}

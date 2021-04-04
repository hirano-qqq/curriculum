package check;

import java.lang.reflect.Method;

public class Check {
	public static void main(String[] args) throws Exception {

		Class<Myname> c = Myname.class;

		Myname m = new Myname();

		Method m2 = c.getDeclaredMethod("printName", String.class, String.class);
		m2.setAccessible(true);
		m2.invoke(m, m.getFirstName(), m.getLastName());

		Pet p = new Pet();
		RobotPet rp = new RobotPet();

		constants.Constants co = new constants.Constants();

		p = new Pet(co.CHECK_CLASS_JAVA, co.CHECK_CLASS_HOGE);
		p.introduce();

		rp = new RobotPet(co.CHECK_CLASS_R2D2, co.CHECK_CLASS_LUKE);
		rp.introduce();

	}
}

class Myname {

	private String firstName = "平野";

	public String getFirstName() {
		return firstName;
	}

	private String lastName = "湧太";

	public String getLastName() {
		return lastName;
	}

	private void printName(String x, String y) {
		System.out.println("printNameメソッド→" + x + y);

	}

}

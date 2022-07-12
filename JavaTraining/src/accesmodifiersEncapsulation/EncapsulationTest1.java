package accesmodifiersEncapsulation;

public class EncapsulationTest1 {

	public static void main(String[] args) {
		EncapsulationDemo obj = new EncapsulationDemo();

		obj.setRollno(85224);
		obj.setName("Subha");
		

		int r = obj.getRollno();
		String n = obj.getName();

		System.out.println(r);
		System.out.println(n);
		obj.display();


	}

}

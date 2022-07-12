package inheritance;

public class MaruthiSuzuki extends RobertBosch
{
	public void ms_Engine()
	{
		System.out.println("Maruthi Suzuki Engine is running...");
	}
	public static void main(String[] args) 
	{

		MaruthiSuzuki key = new MaruthiSuzuki();
		key.ms_Engine();
		key.fInjection_System();
		key.gp_System();
		key.spark_Plug();
		key.abs_Breaking();

	}

}

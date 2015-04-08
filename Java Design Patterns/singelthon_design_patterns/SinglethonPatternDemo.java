package singelthon_design_patterns;

public class SinglethonPatternDemo {

	public static void main(String[] args) {
		//illegal construct
		//Compile Time Error: The constructor SingleObject is not visible
		//SongleObject object = new SingleObject();
		
		//Get the only object available
		SingleObject object = SingleObject.getInstance();
		
		//show the message
		object.showMassage();
	}

}

package my.packages;

public class Car extends Engine {
	public void drive() {
		int status=super.start();
		
		if(status>=1)
		{
			System.out.println("journey started...");
		}else {
			System.out.println("occur some trouble....");
		}
	}
}

package java221109;

public class NewInstanceExample {

	public static void main(String[] args) {
		try {
			Class clazz1 = Class.forName("java221109.SendAction");
			Class clazz2 = Class.forName("java221109.ReciveAction");
			Action action1 =(Action) clazz1.newInstance();
			Action action2 =(Action) clazz2.newInstance();
			
			action1.execute();
			action2.execute();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(InstantiationException e) {
			e.printStackTrace();
		}catch(IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}

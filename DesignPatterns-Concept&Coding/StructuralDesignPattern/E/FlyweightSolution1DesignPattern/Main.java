package E.FlyweightSolution1DesignPattern;

public class Main {

	public static void main(String[] args) {
		
		IRobot robot1=RoboticFactory.createRobot("HUMANOIDROBOT");
		robot1.display(1, 2);
		
		IRobot robot2=RoboticFactory.createRobot("HUMANOIDROBOT");
		robot2.display(3, 4);
		
		IRobot robot3=RoboticFactory.createRobot("ROBOTICDOG");
		robot3.display(4, 5);

	}

}

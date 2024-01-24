package E.CommandDesignPattern;

public class Main {

	public static void main(String[] args) {
		
		AirConditioner airConditioner=new AirConditioner();
		 MyRemoteControl remoteControl=new MyRemoteControl();
		 remoteControl.setCommand(new TurnOnAcCommand(airConditioner));
		 remoteControl.pressButton();
		 
		 remoteControl.undo();

	}

}

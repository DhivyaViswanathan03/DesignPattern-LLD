package E.CommandDesignPattern;

public class TurnOffAcCommand implements ICommand {
	
	AirConditioner airConditioner;
	
	
	TurnOffAcCommand(AirConditioner airConditioner){
		this.airConditioner=airConditioner;
	}
	

	@Override
	public void execute() {
		airConditioner.turnOffAc();
	}


	@Override
	public void undo() {
		airConditioner.turnOnAc();
	}

}

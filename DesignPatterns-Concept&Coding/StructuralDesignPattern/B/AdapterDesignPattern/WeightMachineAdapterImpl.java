package B.AdapterDesignPattern;

public class WeightMachineAdapterImpl implements IWeightMachineAdapter {
	
	IWeightMachine weightMachine;
	
	public WeightMachineAdapterImpl(IWeightMachine weightMachine) {
		this.weightMachine=weightMachine;
	}

	@Override
	public int getWeightInKg() {
		int pounds=weightMachine.getWeightInPounds();
		int weightInKg=pounds *1;
		return weightInKg;
	}

}

package B.AdapterDesignPattern;

public class Main {

	public static void main(String[] args) {

		IWeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
		int result=weightMachineAdapter.getWeightInKg();
		System.out.println(result);

	}

}

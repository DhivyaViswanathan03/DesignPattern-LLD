package C.StateDesignPattern;

import java.util.List;

public class DispenseState implements IState{
	
	  DispenseState(VendingMachine machine, int codeNumber) throws Exception{
	        System.out.println("Currently Vending machine is in DispenseState");
	        dispenseProduct(machine, codeNumber);
	    }


	private void dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
		   System.out.println("Product has been dispensed");
		   Item item = machine.getInventory().getItem(codeNumber);
		   machine.getInventory().updateSoldOutItem(codeNumber);
		   machine.setVendingMachineState(new IdleState());
	}


	@Override
	public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
		System.out.println("clickOnInsertCoinButton...from DispenseState");
		throw new Exception("insert coin button can not clicked on Dispense state");
		
	}

	@Override
	public void insertCoin(VendingMachine machine,CoinEnum coin) throws Exception {
		throw new Exception("coin can not be inserted in Dispense state");
	}

	@Override
	public void clickOnProductSelectionButton(VendingMachine machine) throws Exception {
		 throw new Exception("product selection buttion can not be clicked in Dispense state");
	}

	@Override
	public void chooseProduct(VendingMachine machine,int code) throws Exception {
		throw new Exception("product can not be choosen in Dispense state");
	}

	@Override
	public List<CoinEnum> refundFullMoney(VendingMachine machine) throws Exception {
		throw new Exception("refund can not be happen in Dispense state");
	}
	
	@Override
	public int getChange(int returnExtraMoney) throws Exception {
		throw new Exception("change can not returned in Dispense state");
	}

	@Override
	public Item dispenseProduct(VendingMachine machine) {
		return null;
	}



}

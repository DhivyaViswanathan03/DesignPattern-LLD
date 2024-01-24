package C.StateDesignPattern;

import java.util.List;

public class IdleState implements IState {
	
	public IdleState(){
        System.out.println("Currently Vending machine is in IdleState");
    }


	@Override
	public void clickOnInsertCoinButton(VendingMachine machine){
		System.out.println("clickOnInsertCoinButton...from idleState");
		machine.setVendingMachineState(new HasMoneyState());

	}

	@Override
	public void insertCoin(VendingMachine machine,CoinEnum coin) throws Exception {
		throw new Exception("you can not insert Coin in idle state");
	}

	@Override
	public void clickOnProductSelectionButton(VendingMachine machine) throws Exception {
		throw new Exception("First you need to insert coin button");
	}

	@Override
	public void chooseProduct(VendingMachine machine,int code) throws Exception {
		throw new Exception("you can not choose Product in idle state");
	}

	@Override
	public int getChange(int returnExtraMoney) throws Exception {
		 throw new Exception("you can not get change in idle state");
	}

	@Override
	public Item dispenseProduct(VendingMachine machine) throws Exception {
		throw new Exception("product can not be dispensed idle state");
	}

	@Override
	public List<CoinEnum> refundFullMoney(VendingMachine machine) throws Exception {
		 throw new Exception("you can not get refunded in idle state");
	}

}

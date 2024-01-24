package C.StateDesignPattern;

import java.util.List;

public class HasMoneyState implements IState {
	
	public HasMoneyState(){
        System.out.println("Currently Vending machine is in HasMoneyState");
    }


	@Override
	public void clickOnInsertCoinButton(VendingMachine machine) {
		System.out.println("clickOnInsertCoinButton...from hasMoneyState");
		return;

	}

	@Override
	public void insertCoin(VendingMachine machine,CoinEnum coin) {
		System.out.println("Accepted the coin");
		machine.getCoinList().add(coin);
	}

	@Override
	public void clickOnProductSelectionButton(VendingMachine machine) {
    machine.setVendingMachineState(new SelectionState());
	}

	@Override
	public void chooseProduct(VendingMachine machine,int code) throws Exception {
		 throw new Exception("you need to click on start product selection button first");
	}

	@Override
	public int getChange(int returnExtraMoney) throws Exception {
		 throw new Exception("you can not get change in hasMoney state");
	}

	@Override
	public Item dispenseProduct(VendingMachine machine) throws Exception {
		throw new Exception("product can not be dispensed in hasMoney state");
	}

	@Override
	public List<CoinEnum> refundFullMoney(VendingMachine machine) {
		return null;
	}

}

package C.StateDesignPattern;

import java.util.List;

public interface IState {

	public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception;
	public void insertCoin(VendingMachine vendingMachine, CoinEnum nickle) throws Exception;
	public void clickOnProductSelectionButton(VendingMachine vendingMachine) throws Exception;
	public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception;
	public int getChange(int returnExtraMoney) throws Exception;
	public Item dispenseProduct(VendingMachine vendingMachine) throws Exception;
	public List<CoinEnum> refundFullMoney(VendingMachine vendingMachine) throws Exception;
	
}

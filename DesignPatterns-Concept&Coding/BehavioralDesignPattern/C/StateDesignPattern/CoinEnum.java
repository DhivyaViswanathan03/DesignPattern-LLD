package C.StateDesignPattern;

public enum CoinEnum {
PENNY(1),
NICKLE(5),
DIME(10),
QUARTER(25);
	int value;

CoinEnum(int value) {
	this.value=value;
	
}
}

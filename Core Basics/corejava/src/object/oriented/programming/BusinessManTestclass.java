package object.oriented.programming;

public class BusinessManTestclass {
	public static void main(String[] args) {
		
		Richman rm = new BusinessMan();
		rm.donation();
		SocialWorker sw = new BusinessMan();
		sw.helpToOthers();
		BusinessMan bm = new BusinessMan();
		bm.earnMoney();
		bm.party();
		bm.donation();
		
		
	}

}

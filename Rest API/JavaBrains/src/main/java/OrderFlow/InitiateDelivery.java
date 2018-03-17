package OrderFlow;

import java.util.ArrayList;
import java.util.List;


public class InitiateDelivery {
	
	public List<DelPackage> getPackageStatus(){
		List <DelPackage> list= new ArrayList<>();
		DelPackage d1 = new DelPackage("010101", "Ready for departure");
		DelPackage d2 = new DelPackage("010102", "Ready for departure");
		DelPackage d3 = new DelPackage("010103", "Ready for departure");
		list.add(d1);
		list.add(d2);
		list.add(d3);
		return list;
	}
}

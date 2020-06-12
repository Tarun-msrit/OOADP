package Template;
import java.util.HashMap;
import java.util.Map;


public class Item {
	HashMap<String, Integer> itemList;
	
	public Item() {
		itemList=new HashMap<String, Integer>();
		itemList.put("Football", 200);
		itemList.put("Bat", 100);
		itemList.put("Ball", 50);
		itemList.put("T-shirt",200);
	}
	
	public void  getItemList() {
		System.out.println("Name \tCost \t");
		for(Map.Entry m: itemList.entrySet()){
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
	}
}

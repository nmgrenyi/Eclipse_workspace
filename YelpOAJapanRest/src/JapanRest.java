import java.util.ArrayList;
import java.util.List;

class bussinessInfo {
	int id;
	String country;
	String catagory;
	String food;
	public bussinessInfo(int id, String country, String catagory, String food) {
		this.id = id;
		this.country = country;
		this.catagory = catagory;
		this.food = food;
	}
}

public class JapanRest {

	public List<Integer> findJapaneseRest(List<bussinessInfo> restList) {
		List<Integer> res = new ArrayList<>();
		for (bussinessInfo rest : restList) {
			if (rest.country == "Japanese" && rest.catagory == "restaurant") {
				res.add(rest.id);
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bussinessInfo b1 = new bussinessInfo(1, "China", "LanZhouRoman", "noodle");
		bussinessInfo b2 = new bussinessInfo(2, "China", "BeiJingDuck", "meat");
		bussinessInfo b3 = new bussinessInfo(3, "Japanese", "restaurant", "meat");
		bussinessInfo b4 = new bussinessInfo(4, "Japanese", "restaurant", "meat");
		List<bussinessInfo> restList = new ArrayList<>();
		restList.add(b1);
		restList.add(b2);
		restList.add(b3);
		restList.add(b4);
		JapanRest jp = new JapanRest();
		List<Integer> res = jp.findJapaneseRest(restList);
		System.out.println(res.size());
	}

}

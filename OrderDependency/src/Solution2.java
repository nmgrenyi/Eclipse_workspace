import java.util.*;
/*
class Order {
	String orderName;
	public Order(String orderName) {
		this.orderName = orderName;
	}
}

class OrderDependency {
	Order pre;
	Order cur;
	public OrderDependency (Order pre, Order cur) {
		this.pre = pre;
		this.cur = cur;
	}
}
*/

public class Solution2 {
	
	public List<Order> solution (List<OrderDependency> list) {
		List<Order> result = new ArrayList<>();
		HashMap<String, Integer> inMap = new HashMap<>();
		HashMap<String, List<String>> outMap = new HashMap<>();
		HashMap<String, Order> recordMap = new HashMap<>();
		Set<String> set = new HashSet<>();
		
		for (OrderDependency od : list) {
			Order pre = od.pre;
			Order cur = od.cur;
			String preName = pre.orderName;
			String curName = cur.orderName;
			set.add(preName);
			set.add(curName);
			
			//recordMap
			if (!recordMap.containsKey(curName)) {
				recordMap.put(curName, cur);
			}
			if (!recordMap.containsKey(preName)) {
				recordMap.put(preName, pre);
			}
			
			//inMap
			if (!inMap.containsKey(preName)) {
				inMap.put(preName, 0);
			}
			if (!inMap.containsKey(curName)) {
				inMap.put(curName, 1);
			}
			else {
				inMap.put(curName, inMap.get(curName) + 1);
			}
			
			//outMap
			if (!outMap.containsKey(preName)) {
				outMap.put(preName, new ArrayList<String>());
			}
			outMap.get(preName).add(curName);
		}
		
		Queue<String> queue = new LinkedList<String>();
		for (String key : inMap.keySet()) {
			int inDegree = inMap.get(key);
			if (inDegree == 0) {
				queue.add(key);
			}
		}
		
		while (queue.size() != 0) {
			String next = queue.poll();
			result.add(recordMap.get(next));
			set.remove(next);
			for (String str : outMap.get(next)) {
				if (!set.contains(str)) {
					continue;
				}
				queue.add(str);
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order o1 = new Order("泡面");
		Order o2 = new Order("泡面");
		Order o3 = new Order("SF");
		Order o4 = new Order("租车");
		Order o5 = new Order("SF");
		Order o6 = new Order("泡面");
		Order o7 = new Order("租车");
		Order o8 = new Order("SF");
		Order o9 = new Order("爽（每个行为之输出了一次对吧）");
		OrderDependency od1 = new OrderDependency(o1, o3);
		OrderDependency od2 = new OrderDependency(o2, o7);
		OrderDependency od3 = new OrderDependency(o3, o9);
		OrderDependency od4 = new OrderDependency(o4, o3);
		OrderDependency od5 = new OrderDependency(o6, o9);
		OrderDependency od6 = new OrderDependency(o8, o9);
		OrderDependency od7 = new OrderDependency(o2, o5);
		
		List<OrderDependency> list = new ArrayList<>();
		list.add(od1);
		list.add(od2);
		list.add(od3);
		list.add(od4);
		list.add(od5);
		list.add(od6);
		list.add(od7);
		Solution sls = new Solution();
		List<Order> res = sls.solution(list);
		for (int i = 0; i < res.size(); i++) {
			System.out.println(res.get(i).orderName);
			if (i + 1 < res.size()) {
				System.out.print(" -> ");
			}
		}
	}

}

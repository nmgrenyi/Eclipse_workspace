import java.util.*;

class Order {
	String orderName;
	public Order (String string) {
		this.orderName = string;
	}
}

class OrderDependency{
	Order cur;
	Order pre;
	public OrderDependency(Order pre, Order cur) {
		this.pre = pre;
		this.cur = cur;
	}
}

public class Solution {

	public static List<Order> solution(List<OrderDependency> orderDependencies) {
		//拿来输出
		List<Order> result = new ArrayList<>();
		//接下来所有的key都保持的是string， orderName， 这样直接避免重复输出
		//计算入度
		//Map<String, Integer> inMap = new HashMap<>();
		Map<Order, Integer> inMap = new HashMap<>();
		//计算出度，就是一个Order指着多少个其他的Order
		Map<Order, List<Order>> outMap = new HashMap<>();
		//这个负责记录，记录orderName和Order的关系
		//Map<String, Order> recordMap = new HashMap<>();
		//这个负责去掉重复
		//Set<String> set = new HashSet<>();
		
		//下面开始吧硅胶填入到这些map或者是set里面，使其丰满
		//这里注意要仔细就行，别漏东西
		for (OrderDependency od : orderDependencies) {
			Order pre = od.pre;
			Order cur = od.cur;
			String preName = pre.orderName;
			String curName = cur.orderName;
			//set.add(preName);
			//set.add(curName);
			
			/*
			//先㩙好string和Order的map
			if (!recordMap.containsKey(preName)) {
				recordMap.put(preName, pre);
			}
			if (!recordMap.containsKey(curName)) {
				recordMap.put(curName, cur);
			}
			*/
			
			//先做好入度
			if (!inMap.containsKey(pre)) {
				inMap.put(pre, 0);
			}
			if (inMap.containsKey(curName)) {
				inMap.put(cur, inMap.get(curName) + 1);
			}
			else {
				inMap.put(cur, 1);
			}
			
			//再做一下出度
			List<Order> temp = new ArrayList<>();
			if (outMap.containsKey(pre)) {
				temp = outMap.get(pre);
			}
			temp.add(cur);
			outMap.put(pre, temp);
			//这里得加个空表，否则后面的null会报错的
			if (!outMap.containsKey(cur)) {
				outMap.put(cur, new ArrayList<>());
			}
		}
		
		//一路BFS剥洋葱，每层都挑入度为0的string
		Queue<Order> queue = new LinkedList<>();
		for (Order str : inMap.keySet()) {
			int inDegree = inMap.get(str);
			if (inDegree == 0) {
				queue.offer(str);
			}
		}
		
		while (!queue.isEmpty()) {
			Order top = queue.poll();
			//result.add(recordMap.get(top));
			result.add(top);
			List<Order> outList = outMap.get(top);
			for (Order next : outList) {
				inMap.put(next, inMap.get(next) - 1);
				if (inMap.get(next) == 0) {
					queue.offer(next);
				}
			}
		}
		
		/*
		if (set.size() != result.size()) {
			return null;
		}
		*/
		
		return result;
	}
	
	/*
	public List<Order> GetOrderList (List<OrderDependency> OrderDependencies) {
	    List<Order> result = new ArrayList<Order>();
	    HashMap<String, Integer> inMap = new HashMap<String, Integer>();
	    HashMap<String, List<String>> outMap = new HashMap<>();
	    HashMap<String, Order> recordMap = new HashMap<>();
	    HashSet<String> set = new HashSet<>();

	    for (OrderDependency od : OrderDependencies) {
			Order pre = od.pre;
			Order cur = od.cur;
			String preName = pre.orderName;
			String curName = cur.orderName;
			set.add(preName);
			set.add(curName);
			
			//recordMap
			if (!recordMap.containsKey(preName)) {
			    recordMap.put(preName, pre);
			}
			if (!recordMap.containsKey(curName)) {
			    recordMap.put(curName, cur);
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
			if (!outMap.containsKey(curName)) {
				outMap.put(curName, new ArrayList<String>());
			}
	
			if (!outMap.containsKey(preName)) {
			    outMap.put(preName, new ArrayList<String>());
			}
			outMap.get(preName).add(curName);

	    }

	    Queue<String> queue = new LinkedList<String>();
		    for (String name : inMap.keySet()) {
			if (inMap.get(name) == 0) {
			    queue.offer(name);
			}
	    }

	    while(queue.size() != 0) {
			String next = queue.poll();
			result.add(recordMap.get(next));
			//inMap.put(next, inMap.get(next) - 1);
//			if (!outMap.containsKey(next)) {
//				System.out.println("outMap lost Key" + next);
//				continue;
//			}
			List<String> nextList = outMap.get(next);
			for (String str : nextList) {
				inMap.put(str, inMap.get(str) - 1);
			    if (inMap.get(str) == 0) {
			        queue.offer(str);
			    }
			}
//			for (String str : inMap.keySet()) {
//				if (inMap.get(str) == 0) {
//					queue.add(str);
//				}
//			}
	    }
	    return result;
	}
	*/
	
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
		//List<Order> res = sls.solution(list);
		//List<Order> res = sls.GetOrderList(list);
		List<Order> res = solution(list);
		for (int i = 0; i < res.size(); i++) {
			System.out.println(res.get(i).orderName);
			if (i + 1 < res.size()) {
				System.out.print(" -> ");
			}
		}
	}

}

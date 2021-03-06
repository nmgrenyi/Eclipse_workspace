package OA2secondRound;

import java.util.*;
class Order {
	String order = "";
	public Order(String order) {
		this.order = order;
	}
}
class OrderDependency {
	Order current;
	Order depend;
	public OrderDependency(Order current, Order depend) {
		this.current = current;
		this.depend = depend;
	}
}

public class OrderDependencySolution {
	
	public List<Order> getOrderList(List<OrderDependency> orders) {
		// write your code here
		List<Order> res = new ArrayList<>();
		HashMap<String, Integer> inMap = new HashMap<>();
		HashMap<String, List<String>> outMap = new HashMap<>();
		HashMap<String, Order> recordMap = new HashMap<>();
		Set<String> set = new HashSet<>();
		
		for (OrderDependency od : orders) {
			Order pre = od.depend;
			Order cur = od.current;
			String preName = pre.order;
			String curName = cur.order;
			set.add(preName);
			set.add(curName);
			
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
				List<String> temp = new ArrayList<>();
				temp.add(curName);
				outMap.put(preName, temp);
			}
			else {
				outMap.get(preName).add(curName);
			}
			
			//recordMap
			if (!recordMap.containsKey(curName)) {
				recordMap.put(curName, cur);
			}
			if (!recordMap.containsKey(preName)) {
				recordMap.put(preName, pre);
			}
		}
		
		Queue<String> queue = new LinkedList();
		for (String str : inMap.keySet()) {
			if (inMap.get(str) == 0) {
				queue.add(str);
			}
		}
		
		if (queue.size() == 0) {
			return res;
		}
		
		while (queue.size() > 0) {
			String temp = queue.poll();
			res.add(recordMap.get(temp));
			set.remove(temp);
			for (String neighbor : outMap.get(temp)) {
				inMap.put(neighbor, inMap.get(neighbor) - 1);
				if (inMap.get(neighbor) == 0) {
					queue.add(neighbor);
				}
			}
		}
		return res;
		
	}
	
	/*
	public List<Order> getOrderList(List<OrderDependency> orders) {
		List<Order> res = new ArrayList<>();
		if (orders == null || orders.size() == 0) {
			return res;
		}
		HashMap<String, Integer> inMap = new HashMap<>();
		HashMap<String, List<String>> outMap = new HashMap<>();
		HashMap<String, Order> recordMap = new HashMap<>();
		Set<String> set = new HashSet<>();
		for (OrderDependency od : orders) {
			Order pre = od.depend;
			Order cur = od.current;
			String preName = pre.order;
			String curName = cur.order;
			set.add(preName);
			set.add(curName);
			
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
			
			//recordMap
			if (!recordMap.containsKey(preName)) {
				recordMap.put(preName, pre);
			}
			if (!recordMap.containsKey(curName)) {
				recordMap.put(curName, cur);
			}
		}
		Queue<String> queue = new LinkedList<String>();
		for (String str : inMap.keySet()) {
			if (inMap.get(str) == 0) {
				queue.offer(str);
			}
		}
		
		while (queue.size() != 0) {
			String temp = queue.poll();
			res.add(recordMap.get(temp));
			set.remove(temp);
			for (String next : outMap.get(temp)) {
				inMap.put(next, inMap.get(next) - 1);
				if (inMap.get(next) == 0 && set.contains(next)) {
					queue.offer(next);
				}
			}
		}
		return res;
	}
	*/
	
	public static void main(String[] argc) {
		OrderDependencySolution solution = new OrderDependencySolution();
		Order a = new Order("A");
		Order b = new Order("B");
		Order c = new Order("C");
		Order d = new Order("D");
		Order e = new Order("E");
		Order f = new Order("F");
		Order g = new Order("G");
		Order h = new Order("H");
		
		// Test case 1
		List<OrderDependency> test1 = new ArrayList<>();
		OrderDependency ab = new OrderDependency(b, a);
		OrderDependency ac = new OrderDependency(c, a);
		OrderDependency be = new OrderDependency(e, b);
		OrderDependency ce = new OrderDependency(e, c);
		OrderDependency bd = new OrderDependency(d, b);
		OrderDependency ef = new OrderDependency(f, e);
		OrderDependency df = new OrderDependency(f, d);
		OrderDependency gh = new OrderDependency(h, g);
		test1.addAll(Arrays.asList(ab, ac, be, ce, bd, ef, df, gh));
		List<Order> result = solution.getOrderList(test1);
		System.out.println("Test case 1: ");
		print(result);

		// Test case 2
		List<OrderDependency> test2 = new ArrayList<>();
		OrderDependency bc = new OrderDependency(c, b);
		OrderDependency af = new OrderDependency(f, a);
		OrderDependency dh = new OrderDependency(h, d);
		OrderDependency eg = new OrderDependency(g, e);
		OrderDependency cd = new OrderDependency(d, c);
		OrderDependency fc = new OrderDependency(c, f);
		test2.addAll(Arrays.asList(ab, af, bc, be, fc, eg, cd, gh, dh));
		result = solution.getOrderList(test2);
		System.out.println("Test case 2: ");
		print(result);

		// Test case 3
		List<OrderDependency> test3 = new ArrayList<>();
		OrderDependency eh = new OrderDependency(h, e);
		test3.addAll(Arrays.asList(ab, eh, cd));
		result = solution.getOrderList(test3);
		System.out.println("Test case 3: ");
		print(result);
		
		// Test case 4
		List<OrderDependency> test4 = new ArrayList<>();
		OrderDependency fg = new OrderDependency(g, f);
		OrderDependency cf = new OrderDependency(f, c);
		OrderDependency hg = new OrderDependency(g, h);
		test4.addAll(Arrays.asList(eg, fg, cd, cf, ab, bc, ce, dh, hg));
		result = solution.getOrderList(test4);
		System.out.println("Test case 4: ");
		print(result);
				
		// Test case 5 (with circle)
		List<OrderDependency> test5 = new ArrayList<>();
		OrderDependency ca = new OrderDependency(a, c);
		test5.addAll(Arrays.asList(ab, bc, ca, ce));
		result = solution.getOrderList(test5);
		System.out.println("Test case 5: ");
		print(result);
				
		// Test case 6
		result = solution.getOrderList(new ArrayList<OrderDependency>());
		System.out.println("Test case 6: ");
		print(result);
				
		// Test case 7
		result = solution.getOrderList(Arrays.asList(ab, bc, cd, df));
		System.out.println("Test case 7: ");
		print(result);
				
		// Test case 8
		result = solution.getOrderList(Arrays.asList(ab, bc, bd, df, ce, fg, eh ));
		System.out.println("Test case 8: ");
		print(result);
	}
	
	private static void print(List<Order> orders) {
		for(Order i : orders) {
			System.out.print(i.order + " ");
		}
		System.out.println();
	}
}

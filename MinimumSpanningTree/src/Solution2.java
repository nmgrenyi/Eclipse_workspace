import java.util.*;

/*
class Connection {
	String city1;
	String city2;
	int cost;
	public Connection (String city1, String city2, int cost) {
		this.city1 = city1;
		this.city2 = city2;
		this.cost = cost;
	}
}
*/

public class Solution2 {
	
	public static ArrayList<Connection> findPath(ArrayList<Connection> list) {
		ArrayList<Connection> res = new ArrayList<Connection>();
		ArrayList<String> cityTree = new ArrayList<String>();
		Comparator<Connection> cmp_Connection = new Comparator<Connection>() {
			public int compare (Connection c1, Connection c2) {
				return c2.cost - c1.cost;
			}
		};
		Collections.sort(list, cmp_Connection);
		while (!list.isEmpty()) {
			Connection minEdge = findMinEdge(list, cityTree);
			if (minEdge == null) {
				break;
			}
			list.remove(minEdge);
			cityTree.add(minEdge.city1);
			cityTree.add(minEdge.city2);
			res.add(minEdge);
		}
		
		Comparator<Connection> cmp = new Comparator<Connection>() {
			public int compare (Connection c1, Connection c2) {
				if (c1.city1 != c2.city1) {
					return c1.city1.compareTo(c2.city1);
				}else {
					return c1.city2.compareTo(c2.city2);
					
				}
			}
		};
		Collections.sort(res, cmp);
		return res;
	}
	
	public static Connection findMinEdge (ArrayList<Connection> list, ArrayList<String> cityTree) {
		Connection res = null;
		int minCost = Integer.MAX_VALUE;
		for (Connection edge : list) {
			if (edge.cost >= minCost) {
				continue;
			}
			if ((cityTree.contains(edge.city1) && !cityTree.contains(edge.city2)) || (cityTree.contains(edge.city2) && !cityTree.contains(edge.city1))) {
				minCost = edge.cost;
				res = edge;
			}
			if (cityTree.size() == 0) {
				minCost = edge.cost;
				res = edge;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection[] citys = new Connection[10];
		citys[0] = new Connection("A", "B", 6);
		citys[1] = new Connection("A", "D", 1);
		citys[2] = new Connection("A", "E", 5);
		citys[3] = new Connection("B", "C", 3);
		citys[4] = new Connection("B", "D", 5);
		citys[5] = new Connection("C", "D", 6);
		citys[6] = new Connection("C", "F", 6);
		citys[7] = new Connection("D", "F", 4);
		citys[8] = new Connection("D", "E", 5);
		citys[9] = new Connection("E", "F", 2);
		ArrayList<Connection> list = new ArrayList<Connection>();
		for (Connection temp : citys) {
			list.add(temp);
		}
		for (Connection temp : findPath(list)) {
			temp.printConnection();
		}
	}

}

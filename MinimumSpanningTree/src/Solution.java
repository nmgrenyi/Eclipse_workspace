import java.util.*;

class Connection {
	String city1;
	String city2;
	int cost;
	Connection (String city1, String city2, int cost) {
		this.city1 = city1;
		this.city2 = city2;
		this.cost = cost;
	}
	
	public void printConnection () {
		System.out.println("{" + this.city1 + " , " + this.city2 + " } " + this.cost);
	}
}

public class Solution {
	
	public static List<Connection> findPath (List<Connection> list) {
		List<Connection> result = new ArrayList<Connection>();
		ArrayList<String> cityTree = new ArrayList<String>();
		
		Comparator<Connection> cmp_Connection = new Comparator<Connection> () {
			public int compare (Connection c1, Connection c2) {
				return c2.cost - c1.cost;
			}
		};
		
		Collections.sort(list, cmp_Connection);
		
		while (!list.isEmpty()) {
			//find the Minimum cost to the city from cityTree among the result
			Connection temp = findMin(list, cityTree);
			if (temp == null) {
				break;
			}
			list.remove(temp);	//remove the current minimum cost from grand set
			cityTree.add(temp.city1);
			cityTree.add(temp.city2);
			result.add(temp);
		}
		
		Comparator<Connection> cmp = new Comparator<Connection>() {
			public int compare (Connection c1, Connection c2) {
				if (c1.city1.equals(c2.city1)) {
					return c1.city2.compareTo(c2.city2);
				}
				return c1.city1.compareTo(c2.city1);
			}
		};
		
		result.sort(cmp);
		
		return result;
	}
	
	public static Connection findMin(List<Connection> list, ArrayList<String> cityTree) {
		Connection result = null;
		int minCost = Integer.MAX_VALUE;
		for (Connection con : list) {
			if ((cityTree.contains(con.city1) && !cityTree.contains(con.city2)) || cityTree.contains(con.city2) && !cityTree.contains(con.city1)) {
				minCost = con.cost;
				result = con;
			}
			if (cityTree.isEmpty()) {
				minCost = con.cost;
				result = con;
				//break;
			}
		}
		return result;
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
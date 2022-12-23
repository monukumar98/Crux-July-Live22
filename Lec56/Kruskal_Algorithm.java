package Lec56;

import java.util.*;

public class Kruskal_Algorithm {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Kruskal_Algorithm(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public class EdgePair {
		int v1;
		int v2;
		int cost;

		public EdgePair(int v1, int v2, int cost) {
			// TODO Auto-generated constructor stub
			this.v1 = v1;
			this.v2 = v2;
			this.cost = cost;

		}

	}

	public List<EdgePair> AllEdgeList() {
		List<EdgePair> ll = new ArrayList<>();
		for (int key : map.keySet()) {
			for (int nbrs : map.get(key).keySet()) {
				int cost = map.get(key).get(nbrs);
				EdgePair ep = new EdgePair(key, nbrs, cost);
				ll.add(ep);
			}
		}

		return ll;
	}

	public int KruskalAlgo() {
		List<EdgePair> ll = AllEdgeList();
		Collections.sort(ll, new Comparator<EdgePair>() {

			@Override
			public int compare(EdgePair o1, EdgePair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		Disjoint_Set dsu = new Disjoint_Set();
		for (int i = 1; i <= map.size(); i++) {
			dsu.Create(i);
		}
		int ans = 0;
		for (EdgePair e : ll) {
			int e1 = e.v1;
			int e2 = e.v2;
			int r1 = dsu.find(e1);
			int r2 = dsu.find(e2);

			if (r1 == r2) {

			} else {
				System.out.println(e);
				ans += e.cost;
				dsu.Union(r1, r2);
			}
		}
		return ans;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Kruskal_Algorithm ks = new Kruskal_Algorithm(n);
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int cost = sc.nextInt();
			ks.AddEdge(v1, v2, cost);
		}
		ks.KruskalAlgo();
	}

}

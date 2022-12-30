package Lec57;

import java.util.*;

public class Dijkstra_Algo {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Dijkstra_Algo(int v) {
		// TODO Auto-generated constructor stub
		this.map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void addEdge(int v1, int v2, int cost) {

		map.get(v1).put(v2, cost);// v1--> map get kra then put v2 and Cost
		map.get(v2).put(v1, cost);
	}

	public class DijktraPair {
		int vtx;
		String acqp;
		int cost;

		public DijktraPair(int vtx, String acqp, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.cost = cost;
			this.acqp = acqp;

		}

		@Override
		public String toString() {
			return this.vtx + " " + this.acqp + "  @ " + this.cost;
		}
	}

	public void DijktraAlgo(int src) {

		PriorityQueue<DijktraPair> pq = new PriorityQueue<>(new Comparator<DijktraPair>() {

			@Override
			public int compare(DijktraPair o1, DijktraPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;//
			}
		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new DijktraPair(src, "" + src, 0));
		while (!pq.isEmpty()) {
			DijktraPair rp = pq.remove();
			if (visited.contains(rp.vtx)) {
				continue;
			}
			visited.add(rp.vtx);
			System.out.println(rp);
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = rp.cost + map.get(rp.vtx).get(nbrs);
					DijktraPair dp = new DijktraPair(nbrs, rp.acqp + nbrs, cost);
					pq.add(dp);
				}
			}
		}

	}

	public static void main(String[] args) {
		Dijkstra_Algo pa = new Dijkstra_Algo(7);
		pa.addEdge(1, 2, 2);
		pa.addEdge(2, 3, 3);
		pa.addEdge(1, 4, 10);
		pa.addEdge(4, 5, 8);
		pa.addEdge(3, 4, 1);
		pa.addEdge(5, 6, 5);
		pa.addEdge(5, 7, 6);
		pa.addEdge(6, 7, 4);
		pa.DijktraAlgo(1);

	}

}

package Lec61;
import java.util.*;
public class Prims_Algo {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Prims_Algo(int v) {
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

	public class PrimsPair {

		int vtx;
		int  acqvtx;
		int cost;

		public  PrimsPair(int vtx, int acqvtx, int cost) {
			this.vtx = vtx;
			this.acqvtx = acqvtx;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return this.vtx + " via " + this.acqvtx + " @ " + this.cost;
		}

	}

	public void prims() {
		PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {
			@Override
			public int compare(PrimsPair p1,PrimsPair p2) {
				return p1.cost - p2.cost;
			}

		});

		HashSet<Integer> visited = new HashSet<>();
		pq.add(new PrimsPair(1, 1, 0));
		while (!pq.isEmpty()) {
			
			PrimsPair dp = pq.remove();
			if(visited.contains(dp.vtx)) {
				continue;
			}
			visited.add(dp.vtx);
			System.out.println(dp);
			
			for(int nbrs : map.get(dp.vtx).keySet()) {
				if(!visited.contains(nbrs)) {
					int c= dp.cost+map.get(dp.vtx).get(nbrs);
					PrimsPair ndp = new PrimsPair(nbrs, nbrs, c);
					pq.add(ndp);
					
				}
			}

		}
	}
		public static void main(String[] args) {
			Prims_Algo pa = new Prims_Algo(7);
			pa.addEdge(1, 2, 2);
			pa.addEdge(2, 3, 3);
			pa.addEdge(1, 4, 10);
			pa.addEdge(4, 5, 8);
			pa.addEdge(3, 4, 1);
			pa.addEdge(5, 6, 5);
			pa.addEdge(5, 7, 6);
			pa.addEdge(6, 7, 4);
			pa.prims();

		}

	

}

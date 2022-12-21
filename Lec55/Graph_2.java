package Lec55;

import java.util.*;

public class Graph_2 {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph_2(int v) {
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

	public boolean BFS(int src, int des) {

		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		q.add(src);
		while (!q.isEmpty()) {
			// 1 remove
			int rv = q.remove();
			// 2 ignore if ALready visited
			if (visited.contains(rv)) {
				continue;
			}
			// 3 marked visited
			visited.add(rv);
			// 4 self work
			if (rv == des) {
				return true;
			}
			// 5 unvisited nbrs ko add krna
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}

		}
		return false;

	}

	public boolean DFS(int src, int des) {

		Stack<Integer> s = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		s.push(src);
		while (!s.isEmpty()) {
			// 1 remove
			int rv = s.pop();
			// 2 ignore if ALready visited
			if (visited.contains(rv)) {
				continue;
			}
			// 3 marked visited
			visited.add(rv);
			// 4 self work
			if (rv == des) {
				return true;
			}
			// 5 unvisited nbrs ko add krna
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					s.push(nbrs);
				}
			}

		}
		return false;

	}

	public void BFT() {

		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();

		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}

			q.add(src);
			while (!q.isEmpty()) {
				// 1 remove
				int rv = q.remove();
				// 2 ignore if ALready visited
				if (visited.contains(rv)) {
					continue;
				}
				// 3 marked visited
				visited.add(rv);
				// 4 self work
				System.out.print(rv + " ");

				// 5 unvisited nbrs ko add krna
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}

			}
		}
		System.out.println();

	}

	public void DFT() {

		Stack<Integer> s = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();

		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			s.push(src);
			while (!s.isEmpty()) {
				// 1 remove
				int rv = s.pop();
				// 2 ignore if ALready visited
				if (visited.contains(rv)) {
					continue;
				}
				// 3 marked visited
				visited.add(rv);
				// 4 self work
				System.out.print(rv + " ");
				// 5 unvisited nbrs ko add krna
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						s.push(nbrs);
					}
				}

			}

		}
		System.out.println();

	}

	public boolean isCycle() {
		Stack<Integer> s = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();

		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			s.push(src);
			while (!s.isEmpty()) {
				// 1 remove
				int rv = s.pop();
				// 2 ignore if ALready visited
				if (visited.contains(rv)) {
					return true;
				}
				// 3 marked visited
				visited.add(rv);

				// 5 unvisited nbrs ko add krna
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						s.push(nbrs);
					}
				}

			}

		}
		return false;

	}

	public int CountCompnenet() {
		Stack<Integer> s = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		int ans = 0;
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			ans++;
			s.push(src);
			while (!s.isEmpty()) {
				// 1 remove
				int rv = s.pop();
				// 2 ignore if ALready visited
				if (visited.contains(rv)) {
					continue;
				}
				// 3 marked visited
				visited.add(rv);

				// 5 unvisited nbrs ko add krna
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						s.push(nbrs);
					}
				}

			}

		}
		return ans;

	}

}

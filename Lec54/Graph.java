package Lec54;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph(int v) {
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

	public boolean ContainsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2);

	}

	public boolean Containsvertex(int v1) {
		return map.containsKey(v1);
	}

	public int noofEdge() {
		int ans = 0;
		for (int key : map.keySet()) {
			ans += map.get(key).size();
		}
		return ans / 2;
	}

	public void removeEdge(int v1, int v2) {

		if (ContainsEdge(v1, v2)) {
			map.get(v1).remove(v2);
			map.get(v2).remove(v1);
		}

	}

	public void removevertex(int v1) {
		for (int nbrs : map.get(v1).keySet()) {
			map.get(nbrs).remove(v1);
		}
		map.remove(v1);

	}

	public void display() {
		for (int key : map.keySet()) {
			System.out.println(key + "-->" + map.get(key));
		}
	}

	public boolean haspath(int src, int des, HashSet<Integer> visited) {

		if (src == des) {
			return true;
		}
		visited.add(src);
		for (int key : map.get(src).keySet()) {
			if (!visited.contains(key)) {
				boolean ans = haspath(key, des, visited);
				if (ans) {
					return true;
				}
			}
		}
		visited.remove(src);
		return false;

	}

	public void Printpath(int src, int des, HashSet<Integer> visited, String ans) {

		if (src == des) {
			System.out.println(ans + src);
			return;
		}
		visited.add(src);
		for (int key : map.get(src).keySet()) {
			if (!visited.contains(key)) {
				Printpath(key, des, visited, ans + src);

			}
		}
		visited.remove(src);

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
}

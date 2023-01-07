package Lec61;

import java.util.Arrays;

public class MinimumPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		int[][] dp = new int[maze.length][maze[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(pathsum(maze, 0, 0, dp));
	}

	public static int pathsum(int[][] maze, int cc, int cr, int[][] dp) {
		if (cc == maze[0].length - 1 && cr == maze.length - 1) {
			return maze[cr][cc];
		}
		if (cc >= maze[0].length || cr >= maze.length) {
			return Integer.MAX_VALUE;
		}
		if (dp[cr][cc] != -1) {
			return dp[cr][cc];
		}

		int v = pathsum(maze, cc, cr + 1, dp);
		int h = pathsum(maze, cc + 1, cr, dp);
		return dp[cr][cc] = maze[cr][cc] + Math.min(v, h);

	}
}

package Lec27;

import java.util.Scanner;

public class Rat_Chases_its_cheese {
	static boolean f = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < maze.length; i++) {
			String str = sc.next();
			for (int j = 0; j < str.length(); j++) {
				maze[i][j] = str.charAt(j);
			}

		}
		int[][] ans = new int[n][m];
		ratinmaze(maze, 0, 0, ans);
		if (f == false) {
			System.out.println("NO PATH FOUND");
		}

	}

	public static void ratinmaze(char[][] maze, int cc, int cr, int[][] ans) {
		if (cr == maze.length - 1 && cc == maze[0].length - 1 && maze[cr][cc] != 'X') {
			ans[cr][cc] = 1;
			Display(ans);
			System.out.println();
			f = true;
			
			return;
		}
		if (cc < 0 || cr < 0 || cc >= maze[0].length || cr >= maze.length || maze[cr][cc] == 'X') {
			return;
		}
		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
		int[] r = { -1, 1, 0, 0 };
		int[] c = { 0, 0, 1, -1 };

//		ratinmaze(maze, cc, cr - 1, ans);
//		ratinmaze(maze, cc, cr + 1, ans);
//		ratinmaze(maze, cc + 1, cr, ans);
//		ratinmaze(maze, cc - 1, cr, ans);
		for (int i = 0; i < c.length; i++) {
			ratinmaze(maze, cc + c[i], cr + r[i], ans);

		}
		maze[cr][cc] = 'O';
		ans[cr][cc] = 0;

	}

	public static void Display(int[][] ans) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

}

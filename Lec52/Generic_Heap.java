package Lec52;

import java.util.ArrayList;

public class Generic_Heap<T extends Comparable<T>> {

	private ArrayList<T> list = new ArrayList<>();

	public void add(T item) {
		list.add(item);
		upheapify(list.size() - 1);

	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;
		if (large(list.get(ci), list.get(pi)) > 0) /* list.get(pi) > list.get(ci) */ {// ci ki priority zada hai pi se
			swap(pi, ci);
			upheapify(pi);
		}

	}

	private void swap(int i, int j) {
		T ith = list.get(i);
		T jth = list.get(j);
		list.set(i, jth);
		list.set(j, ith);

	}

	public T getmin() {
		return list.get(0);
	}

	public void Display() {
		System.out.println(list);
	}

	public T remove() {
		swap(0, list.size() - 1);
		T rv = list.remove(list.size() - 1);
		downheapfiy(0);
		return rv;

	}

	private void downheapfiy(int pi) {
		// TODO Auto-generated method stub
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if (lci < list.size() && large(list.get(lci), list.get(mini)) > 0) {// lci c ki priority zada hai mini se
			mini = lci;
		}
		if (rci < list.size() && large(list.get(rci), list.get(mini)) > 0) {// rci c ki priority zada hai mini se
			mini = rci;
		}
		if (mini != pi) {
			swap(mini, pi);
			downheapfiy(mini);
		}

	}

	public int large(T o1, T o2) {// o1 ki priority zada hai o2
		return o1.compareTo(o2);

	}

}

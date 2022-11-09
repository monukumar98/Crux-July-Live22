package Lec40;

public class LinkedList_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addfirst(10);
		ll.addfirst(20);
		ll.addfirst(30);
		ll.Display();
		ll.addlast(40);
		ll.Display();
		ll.addatindex(2, -9);
		ll.Display();
		ll.addfirst(200);
		ll.addfirst(300);
		ll.addfirst(201);
		ll.addfirst(301);
		System.out.println(ll.GetFirst());
		System.out.println(ll.GetLAst());
		System.out.println(ll.Getatindex(2));
		ll.Display();
		System.out.println(ll.removefirst());
		ll.Display();
		System.out.println(ll.removelast());
		ll.Display();
		System.out.println(ll.removeatindex(2));
		ll.Display();
	}

}

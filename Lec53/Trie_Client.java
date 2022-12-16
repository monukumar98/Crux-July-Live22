package Lec53;

public class Trie_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie t = new Trie();
		t.insert("app");
		t.insert("apple");
		t.insert("raj");
		t.insert("rajesh");
		t.insert("go");
		t.insert("man");
		t.insert("mango");
		t.insert("rat");
		t.insert("ankit");
		t.insert("ankita");
		t.insert("amisha");
		System.out.println(t.search("ap"));
		System.out.println(t.search("app"));
		System.out.println(t.startsWith("ap"));
		System.out.println(t.countstartsWith("ap"));

	}

}

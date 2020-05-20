package dome;

import java.util.ArrayList;

public class Database {

	private ArrayList<Item> listItem = new ArrayList<Item>();

	public void add(Item item){
		listItem.add(item);
	}
		
	public void list() {

		for (Item item : listItem) {
			item.print();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database db = new Database();
		db.add(new CD("aaa", "bbb", 4, 60, "..."));
		db.add(new CD("ccc", "ddd", 4, 60, "..."));
		db.add(new DVD("this is a dvd","fff",60,"..."));
		db.add(new Mp3("this is mp3", 180, true, "dont know",1989));
		db.list();
	}

}

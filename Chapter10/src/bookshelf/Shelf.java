package bookshelf;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf; //자료를 순서대로 저장할 ArrayList선언
	
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}

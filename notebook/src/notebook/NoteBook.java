package notebook;

import java.util.ArrayList;

public class NoteBook {
	private ArrayList<String> notes = new ArrayList<String>();
	
	public void add(String s) {
		notes.add(s);
	}
	
	public void add(String s,int location) {
		notes.add(location,s);
	}
	
	public int getSize(){
		return notes.size();
	}

	public String getNote(int index) {
		return notes.get(index);
	}
	
	public void removeNote(int index) {
		notes.remove(index);
	}
	
	public String[] list() {
		String[] a = new String[notes.size()];
//		for(int i=0;i<notes.size();i++) {
//			a[i] = notes.get(i);	
//		}
		notes.toArray(a);
		return a;
	}
	
//	public ArrayList<String> list(ArrayList<String> notes2) {
////	String[] a = new String[notes.size()];
//////	for(int i=0;i<notes.size();i++) {
//////		a[i] = notes.get(i);	
//////	}
////	notes.toArray(a);
//	for(int i=0;i<notes.size();i++)
//	{
//		notes2.add(notes.get(i));
//	}
//	return notes2;
//		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoteBook nb = new NoteBook();
		nb.add("first");
		nb.add("second");
		nb.add("third", 1);
		nb.add("four");
		System.out.println(nb.getSize());
		System.out.println(nb.getNote(0));
		System.out.println(nb.getNote(1));
		nb.removeNote(1);
//		ArrayList<String> notes2 = new ArrayList<String>();
//		notes2 = nb.list(notes2);
//		for(int i=0;i<notes2.size();i++)
//		{
//			System.out.println(notes2.get(i));
//		}
		String[] a = nb.list();
		for(String s:a)
		{
			System.out.println(s);
		}
	}

}

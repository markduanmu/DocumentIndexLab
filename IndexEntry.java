import java.util.ArrayList;
public class IndexEntry{

private String word;
	private ArrayList<Integer> numList;
	
	public IndexEntry(String str){
		word = str.toUpperCase();
		numList = new ArrayList<Integer>();
	}
	
	public void add(int num){
		if(numList.contains(num)==false){
			numList.add(num);
		}
	}
	
	public String getWord(){
		return word;
	}
	
	public String toString(){
		return (word + " " + numList);
	}

}


import java.util.ArrayList;

public class DocumentIndex extends ArrayList<IndexEntry>{

	public DocumentIndex(){
		super();
	}
	
	public DocumentIndex(int capacity){
		super(capacity);
	}
	
	public void addWord(String word, int num){
		IndexEntry entry = get(foundOrInserted(word));
		entry.add(num);
	}
	
	public void addAllWords(String str, int num){
		String[] words = str.split("\\W+");
		for( String word : words){
			if(word.length()>0){
				addWord(word, num);
			}
		}
			
	}
	
	public int foundOrInserted(String word){
		int i;
		
		for(i=0; i< size(); i++){
			int comp = word.compareToIgnoreCase(get(i).getWord());
			if(comp==0)
				return i;
			if(comp<0)
				break;
		}
		
		add(i, new IndexEntry(word));
		return i;
	}
	
}



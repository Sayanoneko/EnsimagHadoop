package flickr;

public class StringAndInt implements Comparable<StringAndInt> {
	private String tag;
	private int occurence;
	
	public StringAndInt(String tag, int occurence){
		this.tag = tag;
		this.occurence = occurence;
	}
	
	public String getTag(){
		return tag;
	}
	
	public int getOccurence(){
		return occurence;
	}
	
	public void setTag(String tag){
		this.tag = tag;
	}
	
	public void setOccurence(int occurence){
		this.occurence = occurence;
	}

	@Override
	public int compareTo(StringAndInt stringAndInt) {
		if (stringAndInt.getOccurence() < this.occurence){
			return 1;
		}
		else if (stringAndInt.getOccurence() > this.occurence){
			return -1;
		}
		else {
			return 0;
		}
	}
	
}

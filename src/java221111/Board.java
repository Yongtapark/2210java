package java221111;

public class Board {
	String subject;
	String content;
	String writer;
	
	public Board(String subject, String content, String writer){
		this.content=content;
		this.subject=subject;
		this.writer=writer;
	}
	
	@Override
	public String toString() {
		return this.content+" "+this.subject+" "+this.writer;
		
	}

}

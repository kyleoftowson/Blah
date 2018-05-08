import java.io.File;
import java.util.Scanner;

public class Readin {
	public static void main(String [ ] args){
		new Readin();
	}
	File file;
	String filename;
	Scanner scan;
	String Score;
	public Readin(){
		
		filename="C:\\Users\\Kyle\\Desktop\\senior project\\BLAHBLAH.txt";
		readinfile();
		
		makeScore();
		scan.close();
		file=null;
		printscore();
		
	}
	public void readinfile(){
		file=new File(filename);
		
	}
	public void makeScore(){
		int nop=0, allo=0;
		try{
			for(int x=0;x<2;x++){
				scan=new Scanner(file);
				if(x==0){
				nop=searchFile("nop");
				}
				else if(x==1){
					allo=searchFile("var");
				}
			}
			int total=nop+allo;
			Score="This has been rated "+total+".";
			
		}
		catch(Exception e){
			Score="An Error Occured";
			
		}
	}
	public int searchFile(String search){
		
		int howmany=0;
		while(scan.hasNext()){
			String result=scan.next();
			if(result.contains(search)||result.equalsIgnoreCase(search)){
				howmany++;
			}
			
		}
		return howmany;
	}
	public void printscore(){
		
		System.out.println(Score);;
	}
}

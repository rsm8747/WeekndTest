package Weekend_Test;

public class Author {
	int aid;
	String aName;
	int mobNo;
	Author(){}
	Author(int aid,String sName,int mobNo){
		this.aid=aid;
		this.aName=sName;
		this.mobNo=mobNo;
		
	}
	public String toString(){
		return "Author Id : " + aid +"\nAuthor Name:  " + aName + "\n Author Mobile Number : " + mobNo ;
	}

}

import java.util.*;
public class PlayersList {
ArrayList playerArray;
List subListObj;
	PlayersList()
{
	playerArray=new ArrayList();
	subListObj=new ArrayList();
}
void add()
{
	for(int ctr=0;ctr<5;ctr++)
	{
		playerArray.add(new Integer(ctr));	
	}
	playerArray.add("Aparna");
	playerArray.add("Kirti");
	playerArray.add("Anushka");
	playerArray.add("Anwesha");
	System.out.println();
}
void search()
{
	System.out.println();
	System.out.println("*************************************"+"*******************************************");
	System.out.println("Search for an object and return"+"the first and last position");
	System.out.println("*****************************************"+"*******************************************");
	System.out.println();
	System.out.println("First occurance fo the String"+"\"Kirti\" is at position"+ playerArray.indexOf("Kirti"));
	System.out.println("Last occurance of the String"+"\"Kirti\" is at position"+ playerArray.lastIndexOf("Kirti"));
	System.out.println();
}
void extract()
{
	System.out.println("***********************************************************"+"******************************");
	System.out.println("Extract a sublist and"+"then print the new List");
	System.out.println("*********************************************************"+"***************************");
    System.out.println();
    subListObj = playerArray.subList(5,playerArray.size());
    System.out.println("new subList from index 5 to "+playerArray.size()+"is : "+subListObj);
    System.out.println();
}
void display()
{
	System.out.println("*************************************************"+"***************************");
	System.out.println("Retrieve objects from the array list ");
	System.out.println("***********************************************"+"*********************************");
	System.out.println();
	for(int ctr=0;ctr<playerArray.size();ctr++)
	{
		System.out.println(" "+playerArray.get(ctr));
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
{
	PlayersList a=new PlayersList();
	a.add();
	a.search();
	a.extract();
	a.display();
}
	}

}

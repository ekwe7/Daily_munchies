import java.util.Scanner;
public class Main{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("Enter the name: ");


String[] names = {"James", "Okey", "Izu", "Mark", "Sulty"};

for(int index = 0; index < names.length; index++){
	String name = input.next();

	if(names.equals(name)){
	System.out.print("Available");
	}else{
	System.out.print("not available");
	}
	
	
}

}
}
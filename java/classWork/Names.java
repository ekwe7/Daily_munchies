public class Names{
public static void main(String[] args){

int counter = 0;
String[] names = {"James", "Okey", "Izu", "Mark", "Sulty"};
for(String name: names){
	System.out.println(name +" ");
	counter++;
}
System.out.println(counter);


for(int i = 2; i < names.length; i++){
	System.out.println(names[i]);
}
}
}
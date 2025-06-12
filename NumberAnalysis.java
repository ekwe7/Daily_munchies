public class NumberAnalysis{
public static void main(String[] args){

java.util.Scanner scanner = new java.util.Scanner(System.in);

System.out.print("Enter nums of items: ");
int nums = scanner.nextInt();
double[] arr = new double[nums];

double sum = 0;
int counter = 0;
System.out.print("Enter your numbers: ");
for(int index = 0; index < nums; index++){
	arr[index] = scanner.nextDouble();
	sum += arr[index];
}


double average = sum / nums;

for(int i = 0; i < nums; i++){
	if(arr[i] > average){
	counter++;
	}
}
System.out.println("total sum is: " +sum);
System.out.println("average number is: "+ average);
System.out.println("Numbers greater than average are: "+ counter);
}
}
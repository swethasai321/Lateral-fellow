package JavaPractice;

import java.util.Scanner;

public class arraydemo {
	
	public static void main(String[] args) {
		
		Scanner scan= new scanner(System.in);
		System.out.println( "Enter the size of the array" );
int size=scan.nextInt();
int [] array = new int[size];
for(int i=0;i<size;i++) {
	System.out.println( "enter the elements" );
	array[i]=scan.nextInt();
}
scan.close();
System.out.println("printing the elements");
for(int i=0;i<array.length;i++) {
	System.out.println(array[i]);
}
	}

}

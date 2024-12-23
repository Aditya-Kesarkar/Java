import java.util.Scanner;

public class SwitchStatement {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

int month = scanner.nextInt();

//printSeason(month);

scanner.close();

if (month == 1 || month == 2 || month == 12) {
	printSeason(1); // Winter 
	} 
else if (month == 3 || month == 4 || month == 5) { 
	printSeason(2); // Spring 
	} 
else if (month == 6 || month == 7 || month == 8) { 
	printSeason(3); // Summer 
	}
else if (month == 9 || month == 10 || month == 11) { 
	printSeason(4); // Autumn 
} 
else {printSeason(0); // Invalid input 
	}
}


public static void printSeason(int month) {

switch (month)
{
case 1: System.out.println("Winter");
break;
case 2: System.out.println("Spring");
break;
case 3: System.out.println("Summer");
break;
case 4: System.out.println("Autumn");
break;
default: System.out.println("Wrong input");
}
}
}

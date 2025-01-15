class App {
	public static void main(String args[]){
		
		// zadanie 1
		
		int employees = 10420;
		byte firstYearEmployees = 10;
		
		employees = firstYearEmployees;
		System.out.println("Employees: " + employees);
		
		// zadanie 2
		
		int zakopane;
		short number = 27266;
		
		zakopane = number;
		System.out.println("Zakopane: " + zakopane);
		System.out.println();
		
		// zadanie 3
		System.out.println("------- zadanie 3 --------");
		System.out.println("Rzutowanie z obcięciem:");
		int lastParticipantsNumber = 255;
		System.out.println("Ostatnia liczba uczestników: " + lastParticipantsNumber);
		byte largeParticipantsNumber = (byte) lastParticipantsNumber;
		System.out.println("Największa liczba uczestników : " + largeParticipantsNumber);
		System.out.println();
		
		// zadanie 4
		System.out.println("------- zadanie 3 --------");
		System.out.println("Rzutowanie double do int :");
		double number1 = 1241241.82;
		int number2 = (int) number1;
		System.out.println(number2);
		System.out.println();
		
		// zadanie 5
		System.out.println("------- zadanie 5 --------");
		System.out.println("Rozszerzanie typów : ");
		
		/* W przypadku gdy np. w wyrażeniu występują różne typy zmiennych
		to Java z automatu znajduje najszerszy typ użytych zmiennych 
		i dokonuje konwersju automatycznej do tego typu, np:
		Mamy dwie zmienne - jedna typu int a druga short, po czym tworzymy
		zmienną typu int w której chcemy umieścić sumę tych dwóch zmiennych.
		Java stwierdza, że int jest zmienną obejmującą najszerszy zakres
		z nich wszystkich i zmienna typu short zostanie rozszerzona do typu int */
		
		int i = 10;
		short s = 123;
		int result = i + s; // konwerja typu short -> int
		System.out.println("Zmienna typu int: i = " + i);
		System.out.println("Zmienna typu short: s = " + s);
		System.out.println("Zmienna typu int: Suma: i + s = " + (i + s));
	}
}
package persons;

public class CreatePerson {
	
	public static void main(String[] args) {
		
		Person olha = new Person("Olha", "Kulyk", "Olha_Kulyk@epam.com");
		Person vadym = new Person("Vadym", "Klymenko", "Vadym_Klymenko@epam.com");
		
		olha.printData();
		vadym.printData();
}}

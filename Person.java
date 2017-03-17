package persons;

public class Person {
		
		private String name;
		private String surname;
		private String email;
		
		public Person(String name, String surname, String email){
			this.name = name;
			this.surname = surname;
			this.email = email;}
		
//gets for data		
		public String getName(){
		       	return name;}
		
		public String getSurname(){
	       	return surname;}
		
		public String getEmail(){
	       	return email;}
		
//sets for data		
		public void setName(String name){
		    this.name = name;}
		
		public void setSurname(String surname){
			this.surname = surname;}
		
		public void setEmail(String email){
			this.email = email;}
		

//print all data		
		public void printData() {
			String s=" ";
			String s1=s.concat(getName()).concat(s).concat(getSurname()).concat(s).concat(getEmail());
			System.out.println(s1);
}}

package persons;

public class Person {
		
		private String name;
		private String surname;
		private String email;
		
		public Person(String n, String s, String e){
			name = n;
			surname = s;
			email = e;
		}
		
//gets for data		
		public String getName(){
		       	return this.name; 
		}
		
		public String getSurname(){
	       	return this.surname; 
		}
		
		public String getEmail(){
	       	return this.email; 
		}
		
//sets for data		
		public void setName(String n){
		    this.name = n;
		}
		
		public void setSurname(String s){
		    this.surname = s;
		}
		
		public void setEmail(String e){
		    this.email = e;
		}
		

//print all data		
		public void printData() {
			String s=" ";
			String s1=s.concat(getName()).concat(s).concat(getSurname()).concat(s).concat(getEmail());
			System.out.println(s1);
		}
		
	

}

public class rleCoder {
	
	public static String code(String inputdata){
	   StringBuffer text = new StringBuffer();
	   for (int i = 0; i < inputdata.length(); i++){
	        int quantity = 1;
	        while (i + 1 < inputdata.length() && inputdata.charAt(i) == inputdata.charAt(i + 1)){
	            quantity++;
	            i++;}
	        if (quantity > 1 && quantity <= 9){
	        	text.append(quantity);
	        	text.append(inputdata.charAt(i));}
	        else if (quantity > 9){
	        	text.append(9);
	        	text.append(inputdata.charAt(i));
	        	text.append(quantity - 9);
	        	text.append(inputdata.charAt(i));} 
	        else
	        	text.append(inputdata.charAt(i));}
	   return text.toString();}
}
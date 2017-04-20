
public class rleDeCoder {
	
	public static String decoder(String inputdata){
		StringBuffer text = new StringBuffer();
		if (Character.isDigit(inputdata.charAt(inputdata.length() -1)))
			return text.toString();
		for (int i = 0; i < inputdata.length()-1; i++){
			if (Character.isDigit(inputdata.charAt(i))){
				if (Character.getNumericValue(inputdata.charAt(i)) <= 9)
				for (int j = 0; j < Character.getNumericValue(inputdata.charAt(i)) - 1; j++)
				text.append(inputdata.charAt(i+1));
				i++;}
			text.append(inputdata.charAt(i));}
		return text.toString();}
}
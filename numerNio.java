package intro;

public class numerNio {
	public static void main( String [] arg){
		
	}
	public static int randomSumm () {
		int random = (int) (Math.random() * 50) + 1;
		int summa =0;
		for(int i =0;i <random;i++ ) {
			summa = summa + (int) (Math.random() * 500) + 1;
		}
		return summa;
	}
	public static String revurs (String text) {
		 String reverse = "";
	        
	        
	        for(int i = text.length() - 1; i >= 0; i--)
	        {
	            reverse = reverse + text.charAt(i);
	        }
		
		return reverse;
	}
	public static char[] arry(String saker){
		char[] chars = saker.toCharArray();
		
		return chars;
	}
	
}

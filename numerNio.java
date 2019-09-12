package intro;

public class numerNio {
	public static void main( String [] arg){
		System.out.print(randomSumm());
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
	public static Object arry(Object saker){
		 Object.class [] arry = skaer.toObject.class()
		
		return chars;
	}
	
}

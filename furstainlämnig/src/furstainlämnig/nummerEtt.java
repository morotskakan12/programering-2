package furstainlämnig;
import java.util.ArrayList;
import java.util.Scanner;
public class nummerEtt {
	
		public static void main( String [] arg){
			  Scanner sc = new Scanner(System.in); 
			  System.out.print("skriv in");
			  String i = sc.next();
			System.out.print(anagramR(i));
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
		private <T> T[] GenericMethod(T... items)
		{
			return items;
		}
		private <T> boolean comper(T items, T t)
		{
			
			return items == t;
			}
		public static ArrayList<String> anagram (String ord) {
			ArrayList<String> anagramm = new ArrayList<>();
			int summa = (int) (Math.random() * ord.length()) + 1;
			int sek = 0;
			int num = 0;
			char[] chars = ord.toCharArray();
			if (ord.length()==1) {
				ord=("?????"+ord+" "+"detta blir svårt");
				anagramm.add(ord);
				return anagramm;
			}
			if (ord.length()==2) {
				char a = chars[0];
				char b = chars[1];
				chars[0] = b;
				chars[1] = a;
				ord = String.valueOf(chars,0, chars.length);
				anagramm.add(ord);
				return anagramm;
			}
			for (int i = 0; i < summa; i++ ) {
				num = (int) (Math.random() * ord.length()-1) + 0;
				char a = chars[num];
				
				do {
					sek = (int) (Math.random() * ord.length()-1) + 0;
				}while(num==sek);
				
				char b = chars[sek];
				chars[num] = b;
				chars[sek] = a;
				ord = String.valueOf(chars,0, chars.length);
				anagramm.add(ord);
			}
			 //chars.toString();
			
			return anagramm;
			
			
			
		}
		public static ArrayList<String> anagramR (String ord) {
			ArrayList<String> anagramm = new ArrayList<>();
			ArrayList<Character> chars = new ArrayList<Character>();
			for (int i = 0; i < ord.length(); i++ ) {
				
				chars.add(ord.charAt (i));
			}
			for (int e = 0; e <ord.length();e++ ) {
				
				for (int i = e+1; i < ord.length()-1; i++) {
					
					char a = chars.get(e);
					char b = chars.get(i);
					chars.set(e, b);
					chars.set(i,a);	
					anagramm.add(chars+"");
					System.out.println(chars);
					chars.clear();
					for (int f = 0; f < ord.length(); f++ ) {
						
						chars.add(ord.charAt (f));
					}
				}

		}			
			for (int e = 0; e < anagramm.size()-1;e++ ) {
				for (int i = e; i < anagramm.size()-2; i++) {
					if (anagramm.get(e).equals(anagramm.get(i+1))) {
						anagramm.remove(e);
					}
					}
				}
			
			return anagramm;
		}
		public static int anagramM (String ord) {
			int  numer = 1;
			for (int i = ord.length(); i>0; i--) {
				numer = numer*i;
				
			} 
			
			return numer;
		}
		}
		



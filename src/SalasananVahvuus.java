import java.util.Scanner;   




public class SalasananVahvuus {   
	private static final Scanner lukija = new Scanner(System.in);    
	public static void main(String[] args) {  
		String salasana = lueSalasana();  
		while (salasananMuuttujat(salasana) == false){  
			salasana = lueSalasana();  
		}  
		tulostaSalasana(salasana);  
	}  
	private static void tulostaSalasana(String salasana) {  
		System.out.println("Salasanasi on: " +salasana);  


	}  
	public static boolean salasananMuuttujat(String salasana) {  
		if (salasana.length() < 10){  
			System.out.println("salasana on alle 10 merkki� pitk�, anna uusi");  
			return false;  
		} 
		if (!salasana.matches(".*\\d+.*")){  
			System.out.println("salasanasta puuttuu numero");  
			return false;  
		}  
		if (!salasana.matches(".*[����]+.*")){  
			System.out.println("salasanasta puuttuu ��kk�nen");  
			return false;  
		} 
		if (salasana.equals(salasana.toLowerCase())){ 
			System.out.println("salasanasta puuttuu iso kirjain"); 
			return false; 
		} 
		if (!salasana.contains("KAKKA")){ 
			System.out.println("salasanasta puuttuu sana KAKKA"); 
			return false; 
		} 
		if (salasana.contains(" ")){ 
			System.out.println("salasanassa ei saa olla v�lily�nti�"); 
			return false; 
		} 
		if (salasana.contains("!")){ 
			System.out.println("salasanassa ei saa olla huutomerkki�"); 
			return false; 
		} 
		if (salasana.length() > 50){  
			System.out.println("salasana on yli 50 merkki� pitk�, anna uusi");  
			return false;  
		}  
		return true;  
	}  
	private static String lueSalasana() {  
		System.out.println("Anna salasana, sen tulee sis�lt�� ainakin 10 merkki�, isoja ja pieni� kirjaimia, numeroita sek� ��kk�si�. Ei saa olla v�lily�nti� eik� huutomerkki�, salasana ei my�sk��n saa olla yli 50merkki� pitk�");  
		String salasana = lukija.nextLine();  
		return salasana;  
	}   


} 
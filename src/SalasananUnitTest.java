import java.util.ArrayList;
public class SalasananUnitTest {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("kakka");
		lista.add("kakAka���1�2�12");
		lista.add("kakAkaKAKKA ����12 11");
		lista.add("kakAkaAKKA11asa");
		lista.add("kakkaKAKKA����111!");
		lista.add("asdskdslakdsakdl�sak�sakd88lsakd�skad�ad�ks�daslkd��ask��ask�ads�dkdlkskaldsakaksd");
		lista.add("kakkaKAKKA�����������1111");
		for (String salasana : lista) {
			System.out.println(SalasananVahvuus.salasananMuuttujat(salasana));
			
		}

	}

}

public class Exec4 {

	public static void main(String[] args) {
		
		int pais1 = 80000;
		double pais2 = 200000;
		int i = 0;
		
		while(pais1 < pais2)
		{
			pais1 = pais1 + (pais1 * 3) / 100;
			pais2 = pais2 + (Math.round(pais2 * 1.5)) / 100;
			i++;
		}
		
		System.out.println("População 1 e 2: " + pais1 + " " + pais2);
		System.out.println("Anos: " + i);

	}

}

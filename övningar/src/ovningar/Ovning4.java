package ovningar;

public class Ovning4 {

	public static void main(String[] args) {
		int tal = 10;
		 int tal2 = 25;

		 System.out.println(tal++ + tal++);

		 System.out.println(tal);//12

		 tal=10;
		 System.out.println(tal++ + ++tal);
		 tal=10;
		 System.out.println(++tal + ++tal);

		 System.out.println(++tal - tal++ - --tal - tal--);

		 System.out.println(tal++ - --tal2);


	}

}

package testklass;
//array �r en ordnad lista med element
public class Testklass1 {
//detta �r en array med for-loop
	public static void main(String[] args) {
		int[ ] intArray1;
		 intArray1 = new int[3]; // Default init: 0 f�r int
		 int[ ] intArray2 = new int[3];
		//Storage
		intArray1[0] = 2;
		intArray1[1] = 4;
		intArray1[2] = 3;
		 // g� igenom array
		 for (int i=0; i < intArray1.length; i++) {
			 System.out.println(intArray1[i]);

	}

}}

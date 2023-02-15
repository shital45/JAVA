package package1;

public class castingdemo02 {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
         double s=87483029;
         int d=s;
         System.out.println(d);/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	                             Type mismatch: cannot convert from double to int

	                             at package1.castingdemo02.main(castingdemo02.java:8)
*/
		/************************************************************************************/
		
		//in explicit type casting when we are converting from the higher to lower then use follwing:
		double s=87483029;
        int d=(int)s;
        System.out.println(d);
        
        float q=(float) 6.4;
        System.out.println(q);
        double u=3534534.67;
        System.out.println(u);
       float w=4;
       System.out.println(w);
	}

}

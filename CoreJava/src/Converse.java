
		// TODO Auto-generated method stub/** This class demonstrates use of methods of Integer class.*/
		class Converse {
	        void tobeConvert() {
	        String binary, hex, octal;
	        int num = 100;
	        Integer obj = new Integer(num); // Integer Wrapper class obj

	        binary = obj.toBinaryString(num);
	        hex = obj.toHexString(num);
	        octal = obj.toOctalString(num);

	        System.out.println("Decimal value : " + num);
	        System.out.println("Binary equivalent = " + binary);
	        System.out.println("Hexadecimal equivalent = " + hex);
	        System.out.println("Octal equivalent = " + octal);
	        System.out.println(ob);
	    }

	       public static void main(final String[] args) {
	        Converse objConvert = new Converse();
	        objConvert.tobeConvert();
	    }
	}


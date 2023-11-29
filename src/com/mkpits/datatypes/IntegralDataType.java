package Com.mkpits.Datatypes;

public class IntegralDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // int,byte,long,short - data type is used to store the integer values
		// Integral data type - Primitive/Pre-defind type
		// Implementation
		
		int intDataType = 12;
		// it hold the memory of 4 byte (in java compare to c/c++ its hold 2 byte of memory)
		// default value for int is 0.
		byte byteDataType = 10;
		// it takes 1 byte of memory
		// Range - ( -2^n-1 to 2^n-1 - 1) where n - no. of bits
		// ex. -2^8-1 to 2^8-1 -1
		// default value for byte is 0
		short shortDataType = 15;
		// it takes 2 byte of memory
		// default value for byte is 0
		long longDataType = 1584257145l;
		// this data type used to store the huge value
		// it takes 8 byte of memory
		// default value for long is 0
		// declared by ending with l/L
		System.out.println(intDataType);
		System.out.println(byteDataType);
		System.out.println(shortDataType);
		System.out.println(longDataType);
	}

}

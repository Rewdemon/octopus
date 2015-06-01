import java.util.Random;


public class BinaryString {

private char[] bits;

	public BinaryString(int numberofBits){
		bits = new char[numberofBits];
		Random rnd = new Random();
		for (int i = 0; i<numberofBits; i++){
		if(rnd.nextDouble()< 0.5)
		bits[i] = '1';
	        else
		bits[i] = '0';
	}
	}

	public BinaryString(String bits) {
		this.bits = bits.toCharArray();
	}
	public int length(){
		return bits.length;
	}
	public void set(int index, char value){
		try{
		if(value == '1'|| value == '0')
				bits[index] = value;
			else
				throw new BinaryStringException();
		}catch(RuntimeException e) {throw new BinaryStringException();}
	}

	public char get(int index){
		try{
			return bits[index];
		}catch (RuntimeException e) {throw new BinaryStringException();}
	}


	@Override
	public String toString() {
		String result = "";
		for (int i = 0; i < bits.length; i++){
			if(bits[i] == '1')
				result += '1';
			else
				result += '0';
		}
		return result;
	}
}
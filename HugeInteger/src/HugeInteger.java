/**
 * 
 * @author 
 * @version
 *
 */

public class HugeInteger {
	private boolean equality=true;
	private boolean less=true;
	private boolean greater=true;
	private int[] hugeInt = new int[100];
	/** 
	 * This constructor uses the values in 'a' which represent a very large (or even small) integer
	 * Make a deep copy, not a shallow copy of the integer array
	 * 
	 * @param a the digits in the integer
	 */
	public HugeInteger(int[] a){
		for(int i=0; i<a.length; i++) {
			this.hugeInt[i]=a[i];
		}
	}
	
	/**
	 * Make sure that you remove the leading 0's, as your array should
	 * have 100 spots, but the number may be smaller than that.
	 * 
	 * Also, strings append using +
	 * 
	 * Also, you may need to start at spot 99 and go down, depending on how you do it 
	 * 
	 * @return the integer represented as a string
	 */
	@Override
	public String toString(){
		String oBoi="";
		boolean zeroFool=false;
		for(int i=hugeInt.length-1; i>-1; i--) {
			if(hugeInt[i]==0&&zeroFool==false) {}
			else {
				oBoi=(oBoi+hugeInt[i]);
				zeroFool=true;
			}
		}
		return oBoi;
	}

	/**
	 * This method returns true if the object contains the same values as h, false otherwise
	 * @param h the object to compare the current object to
	 * @return true if the current object equals h, false otherwise
	 */
	public boolean isEqualTo (HugeInteger h){
		for(int i=0; i<hugeInt.length; i++) {
			if(this.hugeInt[i]!=h.hugeInt[i]) {
				this.equality=false;
				h.equality=false;
				break;
			}
			else if(i==this.hugeInt.length-1) {
				this.equality=true;
				h.equality=true;
				this.less=false;
				h.less=false;
			}	
		}
		return equality;
	}

	/**
	 * This method returns true if the object does not contain the same values as h, true otherwise
	 * @param h the object to compare the current object to
	 * @return false if the current object equals h, true otherwise
	 */
	public boolean isNotEqualTo (HugeInteger h){
		for(int i=0; i<hugeInt.length; i++) {
			if(this.hugeInt[i]!=h.hugeInt[i]) {
				this.equality=false;
				h.equality=false;
				break;
			}
			else if(i==this.hugeInt.length-1) {
				this.equality=true;
				h.equality=true;
				this.less=false;
				h.less=false;
			}	
		}
		if(equality==true)
			return false;
		else {}
			return true;
	}

	/**
	 * This method returns true if the current object is less than h, false otherwise
	 * 
	 * Note: you need to start at the large side
	 * 
	 * 
	 * @param h the HugeInteger to compare the current object to
	 * @return true if the current object is less than h, false otherwise
	 */
	public boolean isLessThan (HugeInteger h){
		boolean endZeros=false;
		for(int i=this.hugeInt.length-1; i>=0; i--) {
			if(this.hugeInt[i]!=0||h.hugeInt[i]!=0)
				endZeros=true;
			if(endZeros==true) {
				if(this.hugeInt[i]==h.hugeInt[i]) {
					this.less=false;
					h.less=false;
				}
				else if(this.hugeInt[i]<h.hugeInt[i]) {
					this.less=true;
					h.less=false;
					break;
				}
				else if(this.hugeInt[i]>h.hugeInt[i]) {
					h.less=true;
					this.less=false;
					break;
				}
				
			}
		}
		return less;
	}

	/**
	 * This method returns true if the current object is greater than h, false otherwise
	 * 
	 * Note: you need to start at the large side
	 * 
	 * @param h the HugeInteger to compare the current object to
	 * @return true if the current object is greater than h, false otherwise
	 */
	public boolean isGreaterThan (HugeInteger h){
		boolean endZeros=false;
		for(int i=this.hugeInt.length-1; i>=0; i--) {
			if(this.hugeInt[i]!=0||h.hugeInt[i]!=0)
				endZeros=true;
			if(endZeros==true) {
				if(this.hugeInt[i]==h.hugeInt[i]) {
					this.greater=false;
					h.greater=false;
				}
				else if(this.hugeInt[i]<h.hugeInt[i]) {
					this.greater=false;
					h.greater=true;
					break;
				}
				else if(this.hugeInt[i]>h.hugeInt[i]) {
					h.greater=false;
					this.greater=true;
					break;
				}
			}
		}
		return greater;
	}

	/**
	 * This method returns true if the current object is less than or equal to h, false otherwise
	 * @param h the HugeInteger to compare the current object to
	 * @return true if the current object is less than or equal to h, false otherwise
	 */
	public boolean isLessThanOrEqualTo (HugeInteger h){
		boolean endZeros=false;
		for(int i=this.hugeInt.length-1; i>=0; i--) {
			if(this.hugeInt[i]!=0||h.hugeInt[i]!=0)
				endZeros=true;
			if(endZeros==true) {
				if(this.hugeInt[i]==h.hugeInt[i]) {
					this.less=true;
					h.less=true;
				}
				else if(this.hugeInt[i]<h.hugeInt[i]) {
					this.less=true;
					h.less=false;
					break;
				}
				else if(this.hugeInt[i]>h.hugeInt[i]) {
					h.less=true;
					this.less=false;
					break;
				}
				
			}
		}
		return less;
	}

	/**
	 * This method returns true if the current object is greater than or equal to h, false otherwise
	 * @param h the HugeInteger to compare the current object to
	 * @return true if the current object is greater than or equal to h, false otherwise
	 */
	public boolean isGreaterThanOrEqualTo (HugeInteger h){
		boolean endZeros=false;
		for(int i=this.hugeInt.length-1; i>=0; i--) {
			if(this.hugeInt[i]!=0||h.hugeInt[i]!=0)
				endZeros=true;
			if(endZeros==true) {
				if(this.hugeInt[i]==h.hugeInt[i]) {
					this.greater=true;
					h.greater=true;
				}
				else if(this.hugeInt[i]<h.hugeInt[i]) {
					this.greater=false;
					h.greater=true;
					break;
				}
				else if(this.hugeInt[i]>h.hugeInt[i]) {
					h.greater=false;
					this.greater=true;
					break;
				}
			}
		}
		return greater;
	}

	/**
	 * This method adds h to the current object.
	 * @param h the HugeInteger to add to the current object
	 */
	public void add (HugeInteger h){
		for(int i=0; i<hugeInt.length; i++) {
			this.hugeInt[i]=this.hugeInt[i]+h.hugeInt[i];
			if(this.hugeInt[i]>9) {
				this.hugeInt[i]-=10;
				this.hugeInt[i+1]++;
			}
		}
	}
	
	/**
	 * This method subtracts h from the current object
	 * @param h the HugeInteger to subtract from the current object
	 */
	public void subtract (HugeInteger h){
		for(int i=0; i<hugeInt.length; i++) {
			this.hugeInt[i]=this.hugeInt[i]-h.hugeInt[i];
			if(this.hugeInt[i]<0) {
				this.hugeInt[i]+=10;
				this.hugeInt[i+1]--;
			}
		}
	}
}

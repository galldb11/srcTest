import java.util.concurrent.atomic.AtomicReferenceArray;

public class Test0 {
	private int num;
	public String str;
	
	public Test0(int num, String str)
	{
		this.num = num;
		this.str = str;
	}
	
	public double getNum()
	{
		return this.num;
	}
	
	public String getStr()
	{
		return this.str;
	}
	
	public boolean equals(Test0 obj)
	{
		if(num == obj.getNum())
		{
			if(str.equals(obj.getStr()))
			{
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean atomicError()
	{
		AtomicReferenceArray intArray = new AtomicReferenceArray(new Integer[10]);
		intArray.set(0, "String object");
		intArray.set(1, 42);
		return (intArray.get(1) instanceof String);
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(Test0.atomicError());
		//String typeConfusion = (String) intArray.get(0);
		//Integer typeConfusion = (Integer) intArray.get(0);
		//System.out.println(typeConfusion.toString());

	}

}

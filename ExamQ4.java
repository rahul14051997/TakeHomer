
class StringReverse
{
	public String reverseString(String str)
	{
		String reverse = new StringBuilder(str).reverse().toString();
		return reverse;
	}		
}
public class ExamQ4 
{	
	public static void main(String[] args) 
	{
		StringReverse reverse1 = new StringReverse();
		System.out.println(reverse1.reverseString("rahul"));
	}
}

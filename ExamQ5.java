
class ExamSingleton
{
	private static ExamSingleton instance = null;
    public static ExamSingleton getInstance()
    {
    	 try{
             instance = new ExamSingleton();
         }catch(Exception e){
             System.out.println("Exception occured in creating singleton instance");
         }
        return instance;
    }
	
	public String tellJoke() {
		String str = "Q: “Whats the object-oriented way to become wealthy?”\r\n" + 
				"A: Inheritance";
				
		return str;
		
	}	
}
public class ExamQ5 
{
	public static void main(String[] args)
	{
		ExamSingleton exam = ExamSingleton.getInstance();
		System.out.println(exam.tellJoke());
	}
}

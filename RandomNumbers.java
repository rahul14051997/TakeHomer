public class RandomNumbers {
	public static double generateRandom()
	{
		return (Math.random()*20);
		
	}
	public static void main(String[] args) 
	{
		double sum = 0;
		double num;
		for(int i = 0;i<10;i++)
		{
			num = generateRandom();
			sum = sum + num;
		}
		System.out.println(sum);
	}
}

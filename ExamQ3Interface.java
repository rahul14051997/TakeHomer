import java.util.ArrayList;

interface BakedGoods 
{
	public int getPrice();
	public String getDescription();
	public String getSellByDate();
	}

class Cookie implements BakedGoods  {

	@Override
	public int getPrice() {
		return 1;
	}

	@Override
	public String getDescription() {
		return "Cookie";
	}

	@Override
	public String getSellByDate() {
		return "04/12/2020";
	}
	
}

class CinnamonRoll implements BakedGoods {

	@Override
	public int getPrice() {	
		return 2;
	}

	@Override
	public String getDescription() {
		return "CinnamonRoll";
	}

	@Override
	public String getSellByDate() {
		return "04/12/2020";
	}
	
}

class Brownie implements BakedGoods {

	@Override
	public int getPrice() {
		return 3;
	}

	@Override
	public String getDescription() {
		return "Brownie";
	}

	@Override
	public String getSellByDate() {
		return "04/12/2020";
	}
} 
public class ExamQ3Interface 
{
	public static void main(String[] args) 
	{
		ArrayList<BakedGoods> bakedgoods = new ArrayList<BakedGoods>();
		Cookie cookie1 =  new Cookie();
		Cookie cookie2 =  new Cookie();
		Cookie cookie3 =  new Cookie();
		bakedgoods.add(cookie1);
		bakedgoods.add(cookie2);
		bakedgoods.add(cookie3);
		CinnamonRoll cinnamonroll1 = new CinnamonRoll();
		CinnamonRoll cinnamonroll2 = new CinnamonRoll();
		CinnamonRoll cinnamonroll3 = new CinnamonRoll();
		bakedgoods.add(cinnamonroll1);
		bakedgoods.add(cinnamonroll2);
		bakedgoods.add(cinnamonroll3);
		Brownie brownie1 = new Brownie();
		Brownie brownie2 = new Brownie();
		Brownie brownie3 = new Brownie();
		bakedgoods.add(brownie1);
		bakedgoods.add(brownie2);
		bakedgoods.add(brownie3);
		for(int i =0;i<bakedgoods.size();i++) {
			System.out.println(bakedgoods.get(i).getPrice());
			System.out.println(bakedgoods.get(i).getDescription());
			System.out.println(bakedgoods.get(i).getSellByDate());
		}
		
	}
}

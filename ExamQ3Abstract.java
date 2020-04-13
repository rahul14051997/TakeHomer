import java.util.ArrayList;

abstract class SpaceShip 
{
	int tonnage;
	String name;
	String franchise;
	public int getTonnage() {return tonnage; }
	public String getName() {return name;}
	public String getFranchise() {return franchise;}
	}

class StarWarsShips extends SpaceShip {
	public int getTonnage() {
		return 1;
	}
	public String getName() {
		return "Battleship";
	}
	public String getFranchise() {
		return "SpaceShip";
	}
}

class StarTrekShips extends SpaceShip {
	public int getTonnage() {
		return 2;
	}
	public String getName() {
		return "USS-Enterprise";
	}
	public String getFranchise() {
		return "StarTrekShip";
	}
}

class OtherSciFiSpaceShips extends SpaceShip {
	public int getTonnage() {
		return 3;
	}
	public String getName() {
		return "Firefly";
	}
	public String getFranchise() {
		return "ScifiShip";
	}
	
} 
public class ExamQ3Abstract 
{
	public static void main(String[] args) 
	{
		ArrayList<SpaceShip> ships = new ArrayList<SpaceShip>();
		StarWarsShips starwarship1 =  new StarWarsShips();
		StarWarsShips starwarship2 =  new StarWarsShips();
		StarWarsShips starwarship3 =  new StarWarsShips();
		ships.add(starwarship1);
		ships.add(starwarship2);
		ships.add(starwarship3);
		StarTrekShips startrekship1 = new StarTrekShips();
		StarTrekShips startrekship2 = new StarTrekShips();
		StarTrekShips startrekship3 = new StarTrekShips();
		ships.add(startrekship1);
		ships.add(startrekship2);
		ships.add(startrekship3);
		OtherSciFiSpaceShips scifiship1 = new OtherSciFiSpaceShips();
		OtherSciFiSpaceShips scifiship2 = new OtherSciFiSpaceShips();
		OtherSciFiSpaceShips scifiship3 = new OtherSciFiSpaceShips();
		ships.add(scifiship1);
		ships.add(scifiship2);
		ships.add(scifiship3);
		for(int i =0;i<ships.size();i++) {
			System.out.println(ships.get(i).getTonnage());
			System.out.println(ships.get(i).getName());
			System.out.println(ships.get(i).getFranchise());
		}
		
	}
}

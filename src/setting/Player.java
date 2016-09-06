package setting;

import item.Item;
import util.MessageUtils;

public class Player
{
	//Nome del giocatore
	public static String name;
    public static String outfits;
    public static String bedroomcolor;
    public static String ageplayer;
	
	//e la sua classe...
	static String plclass;

    static String selectionToken;

	static int insanity = 0;

	public static boolean life = true;
	
	//L'inventario del giocatore
	static Inventory inv = new Inventory();
	
	//item.Item equipaggiato
	public static Item equipped;

	public static void nameSet()
	{
		name = Scans.readLine().toLowerCase();
	}

	public static void outfitsSet(){outfits = Scans.readLine().toLowerCase();}

    public static void bedroomcolorSet(){bedroomcolor = Scans.readLine().toLowerCase();}

    public static void ageplayerSet(){ageplayer = Scans.readLine();}

    public static void classSet()
	{
		plclass = Scans.readLine().toLowerCase();
	}

	public static void selectionToken(){
	    selectionToken = Scans.readLine().toLowerCase();
    }
	
	public static void equip()
	{
		System.out.println(MessageUtils.getLocalizedString("Player1"));
		System.out.println(MessageUtils.getLocalizedString("Player2"));
		Inventory.view();

		Item temp = Inventory.equip(Scans.readLine());
		
		if(temp != null)
		{	
			if(equipped != null){
				Inventory.itemList.addLast(equipped);
			}
			equipped = temp;

		}
	}
}
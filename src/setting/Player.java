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
    public static String eye;
    public static String flashlight;
    public static String flashlightON;

	public static boolean life = true;
	
	//L'inventario del giocatore
	static Inventory inv = new Inventory();
	
	//item.Item equipaggiato
	public static Item equipped;

    // Settaggio del nome del giocatore
	public static void nameSet()
	{
		name = Scans.readLine().toLowerCase();
	}

	// Settaggio Abito del giocatore
	public static void outfitsSet(){
	    outfits = Scans.readLine().toLowerCase();
	}

	// Settaggio colore preferito
    public static void bedroomcolorSet(){
        bedroomcolor = Scans.readLine().toLowerCase();
    }

    // Settaggio colore occhi
    public static void eyemirrorrSet(){
        eye = Scans.readLine().toLowerCase();
    }

    // Settaggio età del giocatore
    public static void ageplayerSet(){
        ageplayer = Scans.readLine();
    }

    // Il giocatore prende la torcia o no
    public static void flashlightSet()
    {
        flashlight = Scans.readLine().toLowerCase();
    }

    // Settaggio Abito del giocatore
    public static void flashlightONSet(){
        flashlightON = Scans.readLine().toLowerCase();
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
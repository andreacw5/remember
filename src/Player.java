public class Player
{
	//Nome del giocatore
	static String name;
	
	//e la sua classe...
	static String plclass;

    static String selectionToken;

	static int insanity = 0;

	static boolean life = true;
	
	//L'inventario del giocatore
	static Inventory inv = new Inventory();
	
	//Item equipaggiato
	static Item equipped;

	public static void nameSet()
	{
		name = Scans.readLine();
	}

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
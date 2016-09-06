import util.MessageUtils;

public class Room
{

	static int roomNumber = 0;
	
	public static void enter()
	{
		//We immediately move forward a room upon entry
		roomNumber++;
		
		if(roomNumber == 1)
		{
			System.out.println(MessageUtils.getLocalizedString( "Dialog1"));

			//Creazione del personaggio
			System.out.println(MessageUtils.getLocalizedString( "Dialog2"));

			Player.nameSet();
			System.out.println(MessageUtils.getLocalizedString( "Dialog3") +" "+ Player.name + MessageUtils.getLocalizedString( "Dialog4"));
			
			System.out.println(MessageUtils.getLocalizedString( "Dialog5"));
			System.out.println(MessageUtils.getLocalizedString( "Dialog6"));
			
			Player.classSet();
			System.out.println(MessageUtils.getLocalizedString( "Dialog7") +" "+ Player.plclass +" "+ MessageUtils.getLocalizedString( "Dialog8"));
			System.out.println(MessageUtils.getLocalizedString( "Dialog9"));
			
		}else if(roomNumber >= 2)
		{
			System.out.println(MessageUtils.getLocalizedString( "Dialog10"));
		}
	}
	//Quando il giocatore entra in una stanza ci sarà la descrizione appropriata
	public static void description()
	{
		if(roomNumber == 1)
		{
			System.out.println(MessageUtils.getLocalizedString( "Description1"));
			System.out.println(MessageUtils.getLocalizedString( "Description2"));
		
		}else if(roomNumber == 2)
		{
			System.out.println(MessageUtils.getLocalizedString( "Description3"));
			System.out.println(MessageUtils.getLocalizedString( "Description4"));
		
		}else if(roomNumber >= 3)
		{
			System.out.println(MessageUtils.getLocalizedString( "Description5"));
			System.out.println(MessageUtils.getLocalizedString( "Description6"));
		}
	}
}

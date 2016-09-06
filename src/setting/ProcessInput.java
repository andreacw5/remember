package setting;

import util.MessageUtils;

public class ProcessInput
{
	
	public static void input()
	{
		String[] userinput = Scans.readLine().toLowerCase().split(" ", 0);
		
		for(int i=0; i < userinput.length; i++)
		{

			switch(userinput[i])
			{
			
				case "aiuto":
					System.out.println(MessageUtils.getLocalizedString( "look"));
					System.out.println(MessageUtils.getLocalizedString( "kill"));
					break;

				case "mangia":
					Player.equipped.eat();			
					break;
					
				case "equipaggia":
					Player.equip();
					break;
					
				case "suicidati": case "ucciditi":
					//Il suicidio che brutta via
					Player.life = false;			
					break;
					
				default:
					System.out.println(MessageUtils.getLocalizedString("default"));
					break;
					
			}
		}
	}
}

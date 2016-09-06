package setting;

import item.Food;
import util.MessageUtils;

public class ProcessInput
{
	
	public static void input()
	{
		//Rimuove il maiuscolo dagli input dell'utente
		String[] userinput = Scans.readLine().toLowerCase().split(" ", 0);
		
		for(int i=0; i < userinput.length; i++)
		{

			switch(userinput[i])
			{
			
				case "aiuto":
					System.out.println(MessageUtils.getLocalizedString( "look"));
					System.out.println(MessageUtils.getLocalizedString( "kill"));
					break;
					
				case "item":
					System.out.println(Player.equipped.name);			
					break;
					
				case "inventario":
					Inventory.view();			
					break;
					
				case "aggiungi":
					Inventory.add(new Food(Food.foodType.Burger));
					break;
					
				case "mangia":
					Player.equipped.eat();			
					break;
					
				case "equipaggia":
					Player.equip();
					break;
					
				case "suicide": case "kill self":
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

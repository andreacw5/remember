
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
			
				case "help":
					System.out.println(MessageUtils.getLocalizedString( "look"));
					System.out.println(MessageUtils.getLocalizedString( "move/go"));
					System.out.println(MessageUtils.getLocalizedString( "kill"));
					break;
					
				case "move":
					System.out.println(MessageUtils.getLocalizedString( "move"));
					break;
					
				case "go":
					System.out.println(MessageUtils.getLocalizedString( "go"));
					break;
					
				case "move north": case"move forward":case "go north":case "go forward":
					Room.enter();			
					break;
					
				case "item":
					System.out.println(Player.equipped.name);			
					break;
					
				case "view":
					Inventory.view();			
					break;
					
				case "add":
					Inventory.add(new Food(Food.foodType.Burger));			
					break;
					
				case "eat":
					Player.equipped.eat();			
					break;
					
				case "equip":
					Player.equip();			
					break;
					
				case "rename":
					Player.equipped.rename();			
					break;
					
				case "look":
					Room.description();			
					break;
					
				case "suicide": case "kill self":
					//Kills self, ends game loop
					Player.life = false;			
					break;
					
				default:
					System.out.println(MessageUtils.getLocalizedString("default"));
					break;
					
			}
		}
	}
}

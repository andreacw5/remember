package item;

import setting.Scans;

public abstract class Item
{
	
	public String name;
	int damage;
	int curePower;
	
	//There are different outcomes for eating a sword or a ham
	//so we treat them differently even though they are both items
	public abstract void hit();
	public abstract void eat();
	
	//Renaming is the same though
	public void rename()
	{
		System.out.println("You decide that " + name + " is a terrible name for that paticular object.");
		System.out.println("What should it be called?");
		
		name = Scans.readLine();
		System.out.println(name + "... Well... Close enough.");
	}
}

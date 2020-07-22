
public class SimpleHamburgerFactory {
	public static Hamburger getInstance(String Burgername) 
	{
		if (Burgername.equals("veggie")) 
		{
		return new VeggieBurger();
		} 
		else if (Burgername.equals("cheese"))
		{
		return new CheeseBurger();
		} 
		else
		{
		return new MeatLoverBurger();
		}
	}
}



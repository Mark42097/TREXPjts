
public class HamburgerStore extends SimpleHamburgerFactory{
	public Hamburger orderHamburger(String type)
	{
		return(SimpleHamburgerFactory.getInstance(type));
	}
	
	public static void main(String[] args)
	{
		HamburgerStore HS = new HamburgerStore();
		System.out.println("-------------------------");
		Hamburger H1= HS.getInstance("veggie");
		H1.prepare();
		H1.cook();
		H1.box();
		System.out.println("-------------------------");
		Hamburger H2= HS.getInstance("cheese");
		H2.prepare();
		H2.cook();
		H2.box();
		System.out.println("-------------------------");
		Hamburger H3= HS.getInstance("MeatLover");
		H3.prepare();
		H3.cook();
		H3.box();
		
	}
	

}

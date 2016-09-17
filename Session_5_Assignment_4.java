/* ACD_JAVAB_Session_5_Assignment_4_Main :
 * Override the getRateOfInterest() of Bank class for all the 3 other Bank classes.
 */


class bank
{
	void getRateOfInterest()
	{
		System.out.println("Rate of Interest in Bank : 8.5%");
	}
}

class SBI extends bank
{
	void getRateOfInterest()
	{
		System.out.println("Rate of Interest in SBI   : 8%");
	}
}

class ICICI extends bank
{
	void getRateOfInterest()
	{
		System.out.println("Rate of Interest in ICICI : 7%");
	}
}

class AXIS extends bank
{
	void getRateOfInterest()
	{
		System.out.println("Rate of Interest in AXIS  : 9%");
	}
}

public class Session_5_Assignment_4
{
	public static void main(String[] args) 
	{
		bank a = new AXIS();
		a.getRateOfInterest();
		bank b = new SBI();
		b.getRateOfInterest();
		bank i = new ICICI();
		i.getRateOfInterest();
	}
}

/* OUTPUT
 
Rate of Interest in AXIS  : 9%
Rate of Interest in SBI   : 8%
Rate of Interest in ICICI : 7%
*/
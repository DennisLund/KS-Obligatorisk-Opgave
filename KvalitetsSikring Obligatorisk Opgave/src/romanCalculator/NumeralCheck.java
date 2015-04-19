/*
 * This class ensures that both incoming and outgoing Numerals are valid, and correctly formatted.
 * It contains four methods:
 * 
 * The first method checks the incoming Numerals for invalid characters.
 * The second method is a service method for the first method.
 * The third method ensures that the outgoing Numeral does not exceed the maximum value specified in the assignment.
 * The fourth method ensures that the incoming Numerals are correctly formatted (that the Numerals appear in the correct order(descending in value)).
 */

package romanCalculator;

public class NumeralCheck 
{
	private String aCheck = "";
	private String bCheck = "";
	
	public NumeralCheck()
	{
		
	}
	
	public Boolean checkNumerals(String a, String b)
	{
		char[] charArraya = a.toCharArray();
		for(int i=0; i<charArraya.length; i++)
		{
			if(charArraya[i] != 'M')
			{
				if(charArraya[i] != 'D')
				{
					if(charArraya[i] != 'C')
					{
						if(charArraya[i] != 'L')
						{
							if(charArraya[i] != 'X')
							{
								if(charArraya[i] != 'V')
								{
									if(charArraya[i] != 'I')
									{
										aCheck+= "I";
										
									}
								}
							}
						}
					}
				}
			}
		}
		
		char[] charArrayb = b.toCharArray();
		for(int i=0; i<charArrayb.length; i++)
		{
			if(charArrayb[i] != 'M')
			{
				if(charArrayb[i] != 'D')
				{
					if(charArrayb[i] != 'C')
					{
						if(charArrayb[i] != 'L')
						{
							if(charArrayb[i] != 'X')
							{
								if(charArrayb[i] != 'V')
								{
									if(charArrayb[i] != 'I')
									{
										bCheck+= "I";
										
									}
								}
							}
						}
					}
				}
			}
		}
		
		return validityCheck();
		
	}
	
	
	public Boolean validityCheck()
	{
		if(aCheck == "" && bCheck == "")
		{
			return true;
		}
		else
			return false;
	}
	
	
	public boolean maxValue(String m) 
	{
		String mAntal = "";
		String maxM = "MMMM";

		char[] charArraym = m.toCharArray();
		for(int i=0; i<charArraym.length; i++)
		{
			if(charArraym[i] == 'M')
			{
				mAntal += "I";
			}
		}

		if (mAntal.length() <= maxM.length())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		
	public boolean numeralOrder(String a, String b) 
	{
		String inputOrder = "(M?)+(D?)+(C?)+(L?)+(X?)+(V?)+(I?)+";
		if (a.matches(inputOrder) && b.matches(inputOrder))
			return true;
		else
			return false;
	}
	
}

package romanCalculator;

public class NumeralCheck 
{
	private int aCheck = 0;
	private int bCheck = 0;
	
	public NumeralCheck()
	{
		
	}
	
	public String checkNumerals(String a, String b)
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
										aCheck++;
										
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
										bCheck++;
										
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
	
	
	public String validityCheck()
	{
		if(aCheck == 0 && bCheck == 0)
		{
			return "True";
		}
		else
			return "False";
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

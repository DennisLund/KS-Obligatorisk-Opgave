package romanCalculator;

public class NumeralInstanceCounter 
{
	private Logic l = new Logic();
	
	
	public NumeralInstanceCounter()
	{
		
	}
	
	
	public void numeralsInA(String a)
	{
		char[] charArraya = a.toCharArray();

		for(int i=0; i<charArraya.length; i++)
		{
			if(charArraya[i] == 'M' )

			{
				String s = l.getMCount() + "M";
				l.setMCount(s);
			}
			
			else if(charArraya[i] == 'D' )
			{
				String s = l.getDCount() + "D";
				l.setDCount(s);
			}
			
			else if(charArraya[i] == 'C' )
			{
				String s = l.getCCount() + "C";
				l.setCCount(s);
			}
			
			else if(charArraya[i] == 'L' )
			{
				String s = l.getLCount() + "L";
				l.setLCount(s);
			}
			
			else if(charArraya[i] == 'X' )
			{
				String s = l.getXCount() + "X";
				l.setXCount(s);
			}
			
			else if(charArraya[i] == 'V' )
			{
				String s = l.getVCount() + "V";
				l.setVCount(s);
			}
			
			else if(charArraya[i] == 'I' )
			{
				String s = l.getICount() + "I";
				l.setICount(s);
			}
			
//			else
//			{
//				System.out.println("A [ " + a + " ] is an Invalid Numeral");
//				break;
//			}
	
		}
		
	}
	
	
	public void numeralsInB(String b)
	{
		char[] charArrayb = b.toCharArray();
		
		for(int i=0; i<charArrayb.length; i++)
		{
			if(charArrayb[i] == 'M' )

			{
				String s = l.getMCount() + "M";
				l.setMCount(s);
			}
			
			else if(charArrayb[i] == 'D' )
			{
				String s = l.getDCount() + "D";
				l.setDCount(s);
			}
			
			else if(charArrayb[i] == 'C' )
			{
				String s = l.getCCount() + "C";
				l.setCCount(s);
			}
			
			else if(charArrayb[i] == 'L' )
			{
				String s = l.getLCount() + "L";
				l.setLCount(s);
			}
			
			else if(charArrayb[i] == 'X' )
			{
				String s = l.getXCount() + "X";
				l.setXCount(s);
			}
			
			else if(charArrayb[i] == 'V' )
			{
				String s = l.getVCount() + "V";
				l.setVCount(s);
			}
			
			else if(charArrayb[i] == 'I' )
			{
				String s = l.getICount() + "I";
				l.setICount(s);
			}
			
//			else
//			{
//				System.out.println("B [ " + b + " ] is an Invalid Numeral");
//				break;
//			}
	
		}
	}
	
	
	public String rawResult()
	{
		String c = l.getRawResult();
		
		return c;
	}
	
	
	
}

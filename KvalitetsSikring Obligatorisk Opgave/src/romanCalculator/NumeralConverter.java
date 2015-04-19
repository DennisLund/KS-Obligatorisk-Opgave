/*
 * This class is responsible for processing the Numerals.
 * 
 * The first method processes the two incoming Numerals (Through the other classes),
 * and returns the outgoing Numeral after processing.
 * 
 * The second method is a service method for the first method.
 * It is responsible for conversions between Numerals (Converting "IIIII" to "V" etc.).
 * 
 * 
 */

package romanCalculator;

public class NumeralConverter 
{
	private String rawResult;
	private String cleanResult;

	
	public NumeralConverter()
	{
		
	}
	
	
	public String mergeNumerals(String a, String b)
	{   
		NumeralCheck numCh = new NumeralCheck();
		if(numCh.checkNumerals(a, b))
		{
			if(numCh.numeralOrder(a, b))
			{
				NumeralInstanceCounter numIC = new NumeralInstanceCounter();
				numIC.numeralsInA(a);
				numIC.numeralsInB(b);
				setRawResult(numIC.rawResult());
				setCleanResult(convertResult(rawResult));
				
				if(numCh.maxValue(getCleanResult()))
				{
					return getCleanResult();
				}
				else
				{
					return "Invalid Numeral. Max Numeral value allowed is: MMMMDCCCCLXXXXVIIII";
				}
				
			}
			else
			{
				return "Numerals are in the wrong order. Correct order of numerals are: M, D, C, L, X, V, I";
				
			}

		}
		else
		{
			return "One or both inputs is not a Valid Roman Numeral";
		}
		
	}


	public String convertResult(String raw) 
	{

		return raw.toString()
								.replaceAll("IIIII", "V")
								.replaceAll("VV", "X")
								.replaceAll("XXXXX", "L")
								.replaceAll("LL", "C")
								.replaceAll("CCCCC", "D")
								.replaceAll("DD", "M");
	}
	
	
	
	
	public String getRawResult() 
	{
		return rawResult;
	}


	public void setRawResult(String rawResult) 
	{
		this.rawResult = rawResult;
	}
	
	
	
	
	public String getCleanResult() 
	{
		return cleanResult;
	}


	public void setCleanResult(String cleanResult) 
	{
		this.cleanResult = cleanResult;
	}
	
	
	
	
}

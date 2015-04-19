/*
 * This class is used to merge the two incomming Roman Numerals into one single (Raw version) of the output result.
 */


package romanCalculator;

public class Logic 
{
	private String MCount = "";
	private String DCount = "";
	private String CCount = "";
	private String LCount = "";
	private String XCount = "";	
	private String VCount = "";
	private String ICount = "";
	
	
	public Logic()
	{
		
	}
	
	
	public String getMCount() 
	{
		return MCount;
	}

	public void setMCount(String mCount) 
	{
		MCount = mCount;
	}


	public String getDCount() 
	{
		return DCount;
	}

	public void setDCount(String dCount) 
	{
		DCount = dCount;
	}


	public String getCCount() 
	{
		return CCount;
	}

	public void setCCount(String cCount) 
	{
		CCount = cCount;
	}


	public String getLCount() 
	{
		return LCount;
	}

	public void setLCount(String lCount) 
	{
		LCount = lCount;
	}


	public String getXCount() 
	{
		return XCount;
	}

	public void setXCount(String xCount) 
	{
		XCount = xCount;
	}


	public String getVCount() 
	{
		return VCount;
	}

	public void setVCount(String vCount) 
	{
		VCount = vCount;
	}


	public String getICount() 
	{
		return ICount;
	}

	public void setICount(String iCount) 
	{
		ICount = iCount;
	}
	
	public String getRawResult()
	{
		return MCount + DCount + CCount + LCount + XCount + VCount + ICount;
	}
	
	
}

package testSuite;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import romanCalculator.NumeralConverter;


public class test 
{
	NumeralConverter numConv;
	
	@Before
	public void initialize() throws Exception 
	{
		NumeralConverter numConv = new NumeralConverter();
	}
	

	@Test
	public void test1_InvalidNumber() 
	{
		assertEquals("Result: One or both inputs is not a Valid Roman Numeral", numConv.mergeNumerals("0", "I"));
	}

	@Test
	public void test2_IandIIequalsIII() 
	{
		assertEquals("Result: III", numConv.mergeNumerals("I", "II"));
	}

	@Test
	public void test3_IIIandIIequalsV() 
	{
		assertEquals("Result: V", numConv.mergeNumerals("III", "II"));
	}

	@Test
	public void test4_IIIandIIIequalsVI() 
	{
		assertEquals("Result: VI", numConv.mergeNumerals("III", "III"));
	}

	@Test
	public void test5_IIandVequalsVII() 
	{
		assertEquals("Result: VII", numConv.mergeNumerals("II", "V"));
	}

	@Test
	public void test6_VandVequalsX() 
	{
		assertEquals("Result: X", numConv.mergeNumerals("V", "V"));
	}

	@Test
	public void test7_VandXIequalsXVI() 
	{
		assertEquals("Result: XVI", numConv.mergeNumerals("V", "XI"));
	}

	@Test
	public void test8_XXXXandVVIIequalsLII() 
	{
		assertEquals("Result: LII", numConv.mergeNumerals("XXXX", "VVII"));
	}

	@Test
	public void test9_LVIandXVequalsLXXI() 
	{
		assertEquals("Result: LXXI", numConv.mergeNumerals("LVI", "XV"));
	}

	@Test
	public void test10_LLandXXXXVVVIIIequalsCLVIII() 
	{
		assertEquals("Result: CLVIII", numConv.mergeNumerals("LL", "XXXXVVVIII"));
	}

	@Test
	public void test11_CCCCLandLLLLXXVVVIIequalsDCLXXXVII() 
	{
		assertEquals("Result: DCLXXXVII", numConv.mergeNumerals("CCCCL", "LLLLXXVVVII"));
	}

	@Test
	public void test12_DCCLXXXVIIIandDCCCLLXXXVVIIIequalsMDCCXXXI() 
	{
		assertEquals("Result: MDCCXXXI", numConv.mergeNumerals("DCCLXXXVIII", "DCCCLLXXXVVIII"));
	}

	@Test
	public void test13_MMDCCLXVIIandMDCLXXVIequalsMMMMCCCCXXXXI() 
	{
		assertEquals("Result: MMMMCCCCXXXXI", numConv.mergeNumerals("MMDCCLXVII", "MDCLXXVI"));
	}

	@Test
	public void test14_OutOfRange() 
	{
		assertEquals("Result: Invalid Numeral. Max Numeral value allowed is: MMMMDCCCCLXXXXVIIII", numConv.mergeNumerals("MMMMDCCCCLXXXXVIIII", "II"));
	}

}

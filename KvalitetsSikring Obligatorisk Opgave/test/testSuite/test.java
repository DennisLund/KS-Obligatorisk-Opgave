package testSuite;

import static org.junit.Assert.*;

import org.junit.Test;

import romanCalculator.*;


public class test 
{
	
	NumeralConverter numConv = new NumeralConverter();

	
	@Test
	public void test1_InvalidNumber() 
	{
		assertEquals("One or both inputs is not a Valid Roman Numeral", numConv.mergeNumerals("0", "I"));
	}

	@Test
	public void test2_IandIIequalsIII() 
	{
		assertEquals("III", numConv.mergeNumerals("I", "II"));
	}

	@Test
	public void test3_IIIandIIequalsV() 
	{
		assertEquals("V", numConv.mergeNumerals("III", "II"));
	}

	@Test
	public void test4_IIIandIIIequalsVI() 
	{
		assertEquals("VI", numConv.mergeNumerals("III", "III"));
	}

	@Test
	public void test5_IIandVequalsVII() 
	{
		assertEquals("VII", numConv.mergeNumerals("II", "V"));
	}

	@Test
	public void test6_VandVequalsX() 
	{
		assertEquals("X", numConv.mergeNumerals("V", "V"));
	}

	@Test
	public void test7_VandXIequalsXVI() 
	{
		assertEquals("XVI", numConv.mergeNumerals("V", "XI"));
	}

	@Test
	public void test8_XXXXandVVIIequalsLII() 
	{
		assertEquals("LII", numConv.mergeNumerals("XXXX", "VVII"));
	}

	@Test
	public void test9_LVIandXVequalsLXXI() 
	{
		assertEquals("LXXI", numConv.mergeNumerals("LVI", "XV"));
	}

	@Test
	public void test10_LLandXXXXVVVIIIequalsCLVIII() 
	{
		assertEquals("CLVIII", numConv.mergeNumerals("LL", "XXXXVVVIII"));
	}

	@Test
	public void test11_CCCCLandLLLLXXVVVIIequalsDCLXXXVII() 
	{
		assertEquals("DCLXXXVII", numConv.mergeNumerals("CCCCL", "LLLLXXVVVII"));
	}

	@Test
	public void test12_DCCLXXXVIIIandDCCCLLXXXVVIIIequalsMDCCXXXI() 
	{
		assertEquals("MDCCXXXI", numConv.mergeNumerals("DCCLXXXVIII", "DCCCLLXXXVVIII"));
	}

	@Test
	public void test13_MMDCCLXVIIandMDCLXXVIequalsMMMMCCCCXXXXI() 
	{
		assertEquals("MMMMCCCCXXXXIII", numConv.mergeNumerals("MMDCCLXVII", "MDCLXXVI"));
	}

	@Test
	public void test14_OutOfRange() 
	{
		assertEquals("Invalid Numeral. Max Numeral value allowed is: MMMMDCCCCLXXXXVIIII", numConv.mergeNumerals("MMMMDCCCCLXXXXVIIII", "II"));
	}
	
	

//				The following tests have been added upon further reflections

	
	
	@Test
	public void test15_WrongFormat() 
	{
		assertEquals("Numerals are in the wrong order. Correct order of numerals are: M, D, C, L, X, V, I", numConv.mergeNumerals("MDCCCCLXXXXVIIII", "IMI"));
	}
	
	
	@Test
	public void test16_MotherTest() 
	{
		assertEquals("MMMM", numConv.mergeNumerals("MMMDCCCCLXXXXVIIII", "I"));
	}
	
	
	
	

}

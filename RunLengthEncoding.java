/******************************************************************************
RUN LENGTH ENCODING
*******************************************************************************/

public class RunLengthEncoding
{
    public String encoding(String toEncode)
    {
        int count = 1;
        StringBuilder encoded = new StringBuilder();
        
        for(int i=1; i<=toEncode.length(); i++)
        {
            if(i==toEncode.length() || toEncode.charAt(i)!=toEncode.charAt(i-1))
            {
                encoded.append(count);
                encoded.append(toEncode.charAt(i-1));
                count = 1;
            }
            else
            {
                count++;
            }
        }
        
        return encoded.toString();
        
    }
	public static void main(String[] args) {
		
		RunLengthEncoding runlength = new RunLengthEncoding();
		String testCase1 = "AAAAABBBB";
		System.out.println("Runlength Encoding for " + testCase1 + " : " + runlength.encoding(testCase1));
	}
}

/******************************************************************************
OUTPUT

Runlength Encoding for AAAAABBBB : 5A4B 

*******************************************************************************/


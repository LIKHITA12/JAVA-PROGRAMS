/******************************************************************************
 TO FIND THE LONGEST COMMON PREFIX
*******************************************************************************/

public class LongestCommonPrefixClass
{
    public String LongestCommonPrefix(String[] strings){
        
        if(strings.length == 0)
        {
            return "";
        }
        
        for(int i=0; i<strings[0].length(); i++)
        {
            char match = strings[0].charAt(i);
            
            for(int j=1; j<strings.length; j++)
            {
                if(i >= strings[j].length() || strings[j].charAt(i) != match)
                {
                    return strings[0].substring(0,i);
                }
            }
            
        }
        
        return strings[0];
        
    }
    
	public static void main(String[] args) {
		
		LongestCommonPrefixClass lcp = new LongestCommonPrefixClass();
		
		String[] testCase1 = {"flow", "flower", "flowInsight"};
		System.out.println("Longest Common prefix in the TestCase1: " + lcp.LongestCommonPrefix(testCase1));
		
		String[] testCase2 = {"bird", "dog", "cat"};
		System.out.println("Longest Common prefix in the TestCase2: " + lcp.LongestCommonPrefix(testCase2));
		
		String[] testCase3 = {"classes", "class", ""};
		System.out.println("Longest Common prefix in the TestCase3: " + lcp.LongestCommonPrefix(testCase3));
		
		
	}
}

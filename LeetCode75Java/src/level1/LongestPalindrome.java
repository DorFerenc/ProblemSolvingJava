package level1;

public class LongestPalindrome {
	/*
	 * Given a string s which consists of lowercase or uppercase letters, 
	 * 		return the length of the longest palindrome that can be built with those letters.
	 * Letters are case sensitive, for example, 
	 * 		"Aa" is not considered a palindrome here.
	 */
    public int longestPalindrome(String s) {
    	//can have one char that has odd count
    	if(s.length() == 1) 
    		return 1;
    	int[] arr = new int[128]; //need asci for letters
    	int total = 0; //counter
    	for(int i = 0; i < s.length(); i++) {
    		arr[s.charAt(i)]++;
    		if(arr[s.charAt(i)] == 2) { //if even palindrome
    			total += 2;
    			arr[s.charAt(i)] = 0;
    		}
    	}
    	return (total < s.length()) ? total + 1 : total; //can add one odd letter
    }
}

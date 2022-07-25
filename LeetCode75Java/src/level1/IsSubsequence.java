package level1;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
    	String res = "";
    	int j = 0;
    	for (int i = 0; i < t.length() && j < s.length(); i++) {
    		if (t.charAt(i) == s.charAt(j)) {
    			res += t.charAt(i);
    			j++;
    		}
    	}
    	if (res.equals(s))
    		return true;
    	return false;
    }
}

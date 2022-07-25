package level1;

import java.util.Arrays;

public class IsomorphicStrings {
	/*
	 * Given two strings s and t, determine if they are isomorphic.
	 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
	 * All occurrences of a character must be replaced with another character while preserving the order of characters. 
	 * No two characters may map to the same character, but a character may map to itself.
	 */
    public boolean IsIsomorphic(String s, String t) {
        int[] mapStoT = new int[256];
        Arrays.fill(mapStoT, -1);
        int[] mapTtoS = new int[256];
        Arrays.fill(mapTtoS, -1);
        
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if (mapStoT[c1] == -1 && mapTtoS[c2] == -1) {
                mapStoT[c1] = c2;
                mapTtoS[c2] = c1;
            }
            else if(!(mapStoT[c1] == c2 && mapTtoS[c2] == c1))
                return false;
        }
        return true;
    }
}

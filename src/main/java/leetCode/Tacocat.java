package leetCode;

public class Tacocat {

    public boolean isPalindrome(String s) {
        boolean tacocat = true;
        s = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int l = 0;
        int r = s.length()-1;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return !tacocat;
            }
            l++;
            r--;
        }
        return tacocat;
    }
}


class Solution {
    static int[] map = new int[256];

    static {
        for (int i = 0; i < 10; i++) {
            map[i + '0'] = i + 1;
        }
        for (int i = 0; i < 26; i++) {
//            a is used as charcode to increment of off
            map[i + 'a'] = map[i + 'A'] = i + 11;
        }
    }

    public boolean isPalindrome(String s) {
        char[] array = s.toCharArray();
        int lo = 0;
        int hi = array.length - 1;
        while (lo < hi) {
            while (lo < hi && map[array[lo]] == 0) lo++;
            while (lo < hi && map[array[hi]] == 0) hi--;
            if (lo == hi) return true;
            if (map[array[lo]] == 0 || map[array[hi]] == 0 || map[array[lo++]] != map[array[hi--]]) return false;

        }
        return true;
    }
}
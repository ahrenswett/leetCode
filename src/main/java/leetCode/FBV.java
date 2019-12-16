package leetCode;


public class FBV {
    private static int badVersion = -1;


    public static boolean isBadVersion(int version) {
        int bv = 4;
        if (version == bv) return true;
        return false;
    }

    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
//            find the middle. the below avoids stack overflow where left + right/2 could overflow if right is Max_Value
            int mid = left + (right - left) / 2;
//            check if bad version is present in the middle if it is get rid of everything after and set right  to mid  repeat loop
            if (isBadVersion(mid)) {
                right = mid;
            } else {
//                if the mid is not a bad version get rid of everything on the left
                left = mid + 1;
            }
        }
        return left;
    }
}
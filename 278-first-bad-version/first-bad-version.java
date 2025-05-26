/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
    int start = 1, end = n;

    while (start < end) {
        int mid = start + (end - start) / 2;

        if (isBadVersion(mid)) {
            end = mid; // could be the first bad one, so keep it in the range
        } else {
            start = mid + 1; // it's good, skip to the right half
        }
    }

    return start;
}
}
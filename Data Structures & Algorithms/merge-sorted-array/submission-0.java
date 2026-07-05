class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] arr = new int[m + n];
        int i = 0;
        int left = 0, right = 0;

        while (left < m && right < n) {
            if (nums1[left] <= nums2[right]) {
                arr[i++] = nums1[left++];
            } else {
                arr[i++] = nums2[right++];
            }
        }

        while (left < m) {
            arr[i++] = nums1[left++];
        }

        while (right < n) {
            arr[i++] = nums2[right++];
        }

        for (int j = 0; j < m + n; j++) {
            nums1[j] = arr[j];
        }
    }
}
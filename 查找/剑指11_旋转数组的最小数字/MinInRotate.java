package 查找.剑指11_旋转数组的最小数字;

/**
 * 题目：
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。
 */

public class MinInRotate {
    private static boolean isValid = true;

    public static void main(String[] args) {
//        int[] array={3,4,5,1,2};
//        int[] array={3,4,5,6,1,2};
//        int[] array={1};
//        int[] array={3,4,4,5,5,5,1,1,2,2,3};
//        int[] array = {1, 2, 3, 4, 5};
        int[] array = {1, 0, 1, 1, 1};
        int res = minInRotate(array);
        System.out.println(res);
    }

    public static int minInRotate(int[] array) {
        if (array == null || array.length == 0) {
            isValid = true;
            return 0;
        }
        int lo = 0;
        int hi = array.length - 1;
        int mid = 0;
        int res = array[0];

        //判断数组是否旋转
        if (array[lo] < array[hi]) {
            return res;
        }

        while (lo < hi) {
            mid = lo + ((hi - lo) >> 1);
            if (array[mid] >= array[lo]) {
                lo = mid;
            } else if (array[mid] <= array[hi]) {
                hi = mid;
            }
            if (hi - lo == 1) {
                res = array[hi];
                break;
            }
        }
        return res;
    }
}

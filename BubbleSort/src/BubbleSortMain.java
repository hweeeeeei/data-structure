/**
 * 冒泡排序
 * <p>
 * 交换式排序， 将两值相比较， 判断规则交换位置
 * <p>
 * 将最后一个元素 a[i] 同它的前一个元素 a[i-1]比较
 * 如果 a[i] 小于 a[i-1]  则将两者位置交换，
 * 意思就是将小的值移到前一位
 * <p>
 * 稳定性排序 相等数值比价不改变原来前后顺序
 */

public class BubbleSortMain {


    public static void main(String[] args) {


        // 需要排序的数组
        int nums[] = {6, 2, 5, 4, 7, 9, 3};

        // 比较的次数
        for (int count = 0; count < nums.length - 1; count++) {
            System.out.println("比较次数：" + count);


            //  比较次数越多，  值的比较越少
            for (int i = nums.length - 1; i > count; i--) {

                if (nums[i] < nums[i - 1]) {

                    //t 作为交换位置的中间变量
                    int t = nums[i];

                    nums[i] = nums[i - 1];
                    nums[i - 1] = t;
                }


            }


        }

        display(nums);

    }


    public static void display(int nums[]) {

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "  ");

        }
    }


}

package 二维数组的查找;


/**
 * //题目描述
 * //        在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * //        每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @Accecpt
 */
public class Solution {
    public boolean Find(int target,int[][] array){
        for (int[] _array:array)
        for (int item:_array){
            if (target==item)
                return true;
        }
        return false;
    }
}

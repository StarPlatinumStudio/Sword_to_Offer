package 斐波那契数列;

/**
 *数组法
 * @Accept
 */
public class Solution {
    public int Fibonacci(int n) {
        int array[]=new int[n+3],i;
        array[0]=0;
        array[1]=1;
        if(n>=2){
            for(i=2;i<=n;i++)
                array[i]=array[i-1]+array[i-2];
        }
        return array[n];
    }
}

package 替换空格;

public class Solution {
    /**
     * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
     * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     * @param str
     * @return
     * @Accept
     */
    public String replaceSpace(StringBuffer str) {
        StringBuffer strBuffer=new StringBuffer();
        char[] chars=str.toString().toCharArray();
        for (char c:chars){
            if (c==' ')
                strBuffer.append("%20");
            else
                strBuffer.append(c);
        }
        return strBuffer.toString();
    }
}

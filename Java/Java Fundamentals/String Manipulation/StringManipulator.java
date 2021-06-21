public class StringManipulator 
{
    public static String trimAndConcat(String str1, String str2)
    {
        return str1.trim().concat(str2.trim());        
    }
    public static Integer getIndexOrNull(String str, char c)
    {
        if (str.indexOf(c) != -1)
        {
            return str.indexOf(c);
        }
        else return null;
    }
    public static Integer getIndexOrNull(String str1, String str2)
    {
        if (str1.contains(str2))
        {
            return str1.indexOf(str2);
        }
        else return null;
    }
    public static String ConcatSubstring(String str, int a, int b, String replace) {
        String substr;
        substr = str.substring(a, b);
       
        return substr.concat(replace);
    }
    public static void main(String[] args) {
      //for testing
    }
}
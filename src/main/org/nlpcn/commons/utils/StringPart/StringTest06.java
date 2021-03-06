package main.org.nlpcn.commons.utils.StringPart;

import java.util.Arrays;

public class StringTest06 {
    public static void main(String[] args) {
        //charAt
        char c1 = "abcdef".charAt(2);
        System.out.println(c1);//c

        //endsWith(String endStr)
        System.out.println("helloworld".endsWith("ld"));

        //equalsIgnoreCase(String anotherString)
        System.out.println("hello".equalsIgnoreCase("HellO"));

        //byte[] getBytes()
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        //int indexof(String str)
        System.out.println("www.index.com.info".indexOf("i"));

        //int indexof(String str,int fromIndex)
        System.out.println("www.index.com.info".indexOf("i", 6));

        //lastIndexOf(String str, int lastIndex)
        System.out.println("www.index.com.info".lastIndexOf("i", 100));

        //String是length方法，数组是length属性
        System.out.println("www.nba.com".length());

        //String.replace(String targetStr,String replacementStr)
        System.out.println("www.baidu.com".replace(".com", ".org"));

        //String[] split(String s)
        System.out.println("www.baidu.com".split("."));

        //boolean startWith(String s)

        // String subString(int beginIndex,int endIndex)
        System.out.println("www.google.com".substring(0, 3));//www
        System.out.println("www.google.com".substring(3));//.google.com

        //char[] toCharArray();
        char[] c2 = "www.xiaomi.com".toCharArray();
        System.out.println(Arrays.toString(c2));

        //toUpperCase
        System.out.println("www.xiaomi.com".toUpperCase());

        //toLowerCase
        //String trim()
        // String valueof(object obj)
        Object o = null;
        System.out.println(o);
        System.out.println(String.valueOf(o));
        System.out.println(o.toString());//空指针异常

    }
}

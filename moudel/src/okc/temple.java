package okc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/11/14.
 */
public class temple {

    /*
    psf 公共常量
     */
    public static final int NUM=10;
    //psfs  String类型公共常量
    public static final String  nation="china";

    public static void main(String[] args) {
        System.out.println("hello");
        String [] str=new String[]{"lilei","hanmeimei","lucy"};
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        System.out.println(".....");
        for (String s : str) {
            System.out.println(s);
        }
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Object o : list) {
            System.out.println(o);
        }
    }
}

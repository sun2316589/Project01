package com.sun.test;

import java.util.ArrayList;

/**
 * @author sunruiyang
 * @date 2018/11/12-10:35
 *
 * 代码模板
 * 常用模板
 */
public class TemplatesDemo {

    //模板六：prsf
    private static final int a=123;
    //变形 psf
    public static final int num=1;
    //变形 psfi
    public static final int num2=2;
    //变形 psfs
    public static final String str="str";

    //自定义模板
    private int age;

    private String name;
    

   //模板一：psvm
    public static void main(String[] args) {

        //模板二：sout
        System.out.println();
        //变形: soutp/soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesDemo.main");
        //System.out.println("args = " + args);

        int num1=10;
        int num2=20;
        System.out.println("num2 = " + num2);
        //xxx.sout
        System.out.println(num1);

        //模板三 fori
            String[] arr=new String[]{"sun","wang","li","zhao"};
            for (int i = 0; i <arr.length ; i++) {
                System.out.println(arr[i]);
            }
            //变形 iter
            for (String s : arr) {
                System.out.println(s);
            }
            //变形 itar
            for (int i = 0; i < arr.length; i++) {
                String s = arr[i];
            }

        //模板四：list.for
        ArrayList<String> list=new ArrayList();
        list.add("123");
        list.add("qwe");
        list.add("mnb");

        for (String s : list) {
            
        }
        
        //变形:list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //变形:list.forr 倒叙遍历
        for (int i = list.size() - 1; i >= 0; i--) {
        }

        //模板五:ifn
        ArrayList<String> list2=new ArrayList();
        list.add("123");
        list.add("qwe");
        list.add("mnb");
        if (list2 == null) {
        }
        //变形 inn
        if (list2 != null) {
        }


        //变形 xxx.nn / xxx.null
        if (list2 == null) {

        }
        if (list2 != null) {

        }

    }


}

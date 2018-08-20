package io;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;
import java.util.*;

public class Practice {
    public static void main(String[] args) {
//        File file = new File("d:" + File.separator + "test.txt");
        //字节流
//        OutputStream out = new FileOutputStream(file);
//        String string = "hello world1111";
//        byte[] bytes = string.getBytes("utf-8");
//        out.write(bytes);
//        out.close();
        //字符流
//        Writer writer = new FileWriter(file);
//        String string = "hello world!";
//        writer.write(string);
//        writer.flush();
//        writer.close();

        //BufferedReader使用
//        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
//        String line = is.readLine();
//        int val = Integer.parseInt(line);
//        System.out.println(val);
//
//        System.out.println(is.read());

        //console读取密码
//        Console console;
//        if((console = System.console()) !=null){
//            char[] password = null;
//            try{
//                password = console.readPassword("input your password:");
////                System.out.println(new String(password));
//            }finally {
//                if(password!=null){
//                    Arrays.fill(password,' ');
//                }
//            }
//        }
        System.out.println(new Formatter().format("%1$4d - the year of %2$f",956,Math.PI));
        List list = new ArrayList();

        while (true){
            list.add(new T());
        }

    }
    public static class T{
        public T(){

        }
    }
}

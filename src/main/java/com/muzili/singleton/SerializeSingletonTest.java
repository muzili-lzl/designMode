package com.muzili.singleton;

import java.io.*;

/**
 * 序列化对单例的破坏
 * @author lizuoliang
 * @create 2022/10/30 16:55
 */
public class SerializeSingletonTest {
    public static void main(String[] args) throws Exception {
        // 序列化对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile.obj"));
        oos.writeObject(DoubleLockSingleton.getInstance());

        // 序列化对象输入流
        File file = new File("tempFile.obj");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        DoubleLockSingleton doubleLockSingleton = (DoubleLockSingleton) ois.readObject();

        System.out.println(doubleLockSingleton);
    }
}

package com.kaibing.game.server;

import java.io.IOException;
import java.io.InputStream;
import java.lang.management.ManagementFactory;

public class GameServer {
    public static void main(String[] args) throws IOException {
        TestHot testHot = new TestHot();
        int num = 1;
        String name = ManagementFactory.getRuntimeMXBean().getName();
        //这里为了方便测试，打印出来进程id
        String pid = name.split("@")[0];
        System.out.println("进程Id：" + pid);
        InputStream in = System.in;
        while (true){
            in.read();
            testHot.print(num);
        }
    }
}

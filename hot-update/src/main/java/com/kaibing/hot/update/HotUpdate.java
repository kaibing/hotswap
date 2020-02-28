package com.kaibing.hot.update;

import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;

import java.io.IOException;

public class HotUpdate {
    public static void main(String[] args) {
        try {

            //这个pid在实际应用中可以通过args参数传进来
            System.out.println("hot update start ...");
            String pid = args[0];
            System.out.println("pid:" + pid);
            //VirtualMachine是jdk中tool.jar里面的东西，所以要在pom.xml引用这个jar
            VirtualMachine vm = VirtualMachine.attach(pid);
            System.out.println("vm:");
            // 这个路径是相对于被热更的服务的，也就是这个pid的服务，也可以使用绝对路径。
            vm.loadAgent("config\\load-agent-1.0-SNAPSHOT.jar");
            System.out.println("loadAgent:");
            // vm.detach();
            // Thread.sleep(300000);
        }catch (Exception e){
            System.out.println();
        }
    }
}

package com.stzhangjk.demo.java.jmx;

import com.stzhangjk.demo.java.jmx.mbeans.Hello;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class Main {
    public static void main(String[] args){
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        try {
            ObjectName name = new ObjectName("com.stzhangjk.demo.java.jmx.mbeans:type=Hello");
            mbs.registerMBean(new Hello(), name);
            Thread.sleep(Long.MAX_VALUE);
        } catch (MalformedObjectNameException e) {
            e.printStackTrace();
        } catch (NotCompliantMBeanException e) {
            e.printStackTrace();
        } catch (InstanceAlreadyExistsException e) {
            e.printStackTrace();
        } catch (MBeanRegistrationException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

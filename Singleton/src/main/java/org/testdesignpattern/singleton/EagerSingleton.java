package org.testdesignpattern.singleton;

/**
 * 饿汉式单例类
 * @author Administrator
 *
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();
    /**
     * 私有默认构造子
     */
    private EagerSingleton(){}
    /**
     * 静态工厂方法
     */
    public static EagerSingleton getInstance(){
        return instance;
    }
}

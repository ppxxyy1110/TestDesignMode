package org.testdesignpattern.singleton;

/**
 * 懒汉式单例类  --- Lazy initialization holder class模式
 * 
 * 采用类级内部类，在这个类级内部类里面去创建对象实例。这样一来，只要不使用到这个类级内部类，那就不会创建对象实例，从而同时实现延迟加载和线程安全。
 * @author Administrator
 *
 */
public class LazyHolderSingleton {
    
    private LazyHolderSingleton(){}
    /**
     *    类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例
     *    没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载。
     */
    private static class SingletonHolder{
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static LazyHolderSingleton instance = new LazyHolderSingleton();
    }
    
    public static LazyHolderSingleton getInstance(){
        return SingletonHolder.instance;
    }
}
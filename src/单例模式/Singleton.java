package 单例模式;

//懒汉式单例类.在第一次调用的时候实例化自己

//线程不安全
public class Singleton {
    private Singleton() {
    }

    private static Singleton single = null;

    //静态工厂方法
    public static Singleton getInstance() {
        if (single == null)
            single = new Singleton();
        return single;
    }
}

//线程安全  修改getInstance()方法


//1、在getInstance方法上加同步
/*public static synchronized Singleton getInstance() {
    if (single == null) {
        single = new Singleton();
    }
    return single;
}*/


//2、双重检查锁定

/*    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }*/


//3、静态内部类

/*public class Singleton {
    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {
    }

    public static final Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}*/

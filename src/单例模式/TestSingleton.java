package 单例模式;


public class TestSingleton {
    String name = null;

    private TestSingleton() {
    }

    private static final TestSingleton single = new TestSingleton();

    public static TestSingleton getInstance() {
        return single;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("the name is " + name);
    }


    public static class TMain {
        public static void main(String[] args){
            TestSingleton ts1 = TestSingleton.getInstance();
            ts1.setName("jason");
            TestSingleton ts2 = TestSingleton.getInstance();
            ts2.setName("0539");

            ts1.printInfo();
            ts2.printInfo();

            if(ts1 == ts2){
                System.out.println("创建的是同一个实例");
            }else{
                System.out.println("创建的不是同一个实例");
            }
        }
    }


}

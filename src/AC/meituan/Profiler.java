package AC.meituan;

public class Profiler {

    //生命一个ThreadLocal对象
    private static final ThreadLocal<Long> TIME_THREADLOCAL = new ThreadLocal<>();

    //    {
//
//        protected Long initialValue() {
//            return System.currentTimeMillis();
//        }
//    };
    public static final void begin() {
        TIME_THREADLOCAL.set(System.currentTimeMillis());
    }

    public static final long end() {
        return System.currentTimeMillis() - TIME_THREADLOCAL.get();
    }

    public static void main(String[] args) throws InterruptedException {
        //ThreadLocal对象的set()方法
//        Profiler.begin();
        TIME_THREADLOCAL.set(System.currentTimeMillis());
        Thread.sleep(1000);
        System.out.println(TIME_THREADLOCAL.get());
        Thread.sleep(1000);
        System.out.println(TIME_THREADLOCAL.get());

        //第二次设置ThreadLocal对象
        TIME_THREADLOCAL.set(System.currentTimeMillis());
        Thread.sleep(1000);
        System.out.println(TIME_THREADLOCAL.get());
//        System.out.println("cost:" + Profiler.end());
    }

}

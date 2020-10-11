//package java.lang;
//
//import jdk.internal.HotSpotIntrinsicCandidate;
//
///**
// * Class {@code Object} is the root of the class hierarchy.
// * Every class has {@code Object} as a superclass. All objects,
// * including arrays, implement the methods of this class.
// *
// * @author  unascribed
// * @see     java.lang.Class
// * @since   1.0
// */
//public class Object {
//
//    private static native void registerNatives();
//    static {
//        registerNatives();
//    }
//
//    @HotSpotIntrinsicCandidate
//    public Object() {}
//
//    @HotSpotIntrinsicCandidate
//    public final native Class<?> getClass();
//
//    @HotSpotIntrinsicCandidate
//    public native int hashCode();
//
//    public boolean equals(Object obj) {
//        return (this == obj);
//    }
//
//    @HotSpotIntrinsicCandidate
//    protected native Object clone() throws CloneNotSupportedException;
//
//    public String toString() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    }
//
//    @HotSpotIntrinsicCandidate
//    public final native void notify();
//
//    @HotSpotIntrinsicCandidate
//    public final native void notifyAll();
//
//    public final void wait() throws InterruptedException {
//        wait(0L);
//    }
//
//    public final native void wait(long timeoutMillis) throws InterruptedException;
//
//    public final void wait(long timeoutMillis, int nanos) throws InterruptedException {
//        if (timeoutMillis < 0) {
//            throw new IllegalArgumentException("timeoutMillis value is negative");
//        }
//
//        if (nanos < 0 || nanos > 999999) {
//            throw new IllegalArgumentException(
//                                "nanosecond timeout value out of range");
//        }
//
//        if (nanos > 0) {
//            timeoutMillis++;
//        }
//
//        wait(timeoutMillis);
//    }
//    
//    @Deprecated(since="9")
//    protected void finalize() throws Throwable { }
//}

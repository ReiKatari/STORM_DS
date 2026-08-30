package nc;

import a1.z0;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class k {
    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static int b(int i2, int i10) {
        if (i2 < i10) {
            return -1;
        }
        if (i2 == i10) {
            return 0;
        }
        return 1;
    }

    public static int c(long j2, long j10) {
        int i2 = (j2 > j10 ? 1 : (j2 == j10 ? 0 : -1));
        if (i2 < 0) {
            return -1;
        }
        if (i2 == 0) {
            return 0;
        }
        return 1;
    }

    public static final z0 d(Object[] objArr) {
        objArr.getClass();
        return new z0(objArr);
    }

    public static void e(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(stackTrace[i10].getClassName())) {
                i2 = i10;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static void f(String str) {
        RuntimeException runtimeException = new RuntimeException(kc.a.g("lateinit property ", str, " has not been initialized"));
        e(runtimeException, k.class.getName());
        throw runtimeException;
    }
}
